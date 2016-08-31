/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAOJDBCImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stepReport.DAO.RelatoriosDAO;
import stepReport.Util.FuncionarioHoras;
import stepReport.model.ConnectionDB;
/**
 *
 * @author gabriela
 */
public class RelatoriosDAOJDBCImpl implements RelatoriosDAO {

    @Override
    //Retorna uma lista de cadastro de horas de funcionarios que possuem o campo data_semana entre duas datas informadas
    public List<FuncionarioHoras> totalHorasMensal(String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT id_func,data_semana,horas_dom, horas_seg, horas_ter, horas_qua, horas_qui, "+
                         "horas_sex, horas_sab FROM cadastra_horas " +
                         "WHERE data_semana >= ?"+
                         "AND data_semana <= ?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,dataSemIni);
            prepStatement.setString(2, dataSemFim);
            ResultSet rs = prepStatement.executeQuery();
            conexao.close();
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                list.add(new FuncionarioHoras(Integer.toString(rs.getInt("id_func")),
                rs.getString("data_semana"),rs.getString("horas_dom"),rs.getString("horas_seg"),
                rs.getString("horas_ter"),rs.getString("horas_qua"),rs.getString("horas_qui"),
                rs.getString("horas_sex"),rs.getString("horas_sab")));
            }
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
            return null;
        }
    }

    @Override
    //Retorna uma lista de cadastro de horas de funcionarios que possuem o campo nacionalidade igual ao informado
    //e o campo data_semana entre duas datas informadas
    public List<FuncionarioHoras> hrsTrabByNacionalidade(String nacionalidade, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT cadastra_horas.id, cadastra_horas.id_func, funcionario.nome, "+
                         "cadastra_horas.data_semana,cadastra_horas.horas_dom,cadastra_horas.horas_seg, " +
                         "cadastra_horas.horas_ter,cadastra_horas.horas_qua,cadastra_horas.horas_qui, "+
                         "cadastra_horas.horas_sex,cadastra_horas.horas_sab FROM cadastra_horas " +
                         "INNER JOIN funcionario " +
                         "ON cadastra_horas.id_func = funcionario.id " +
                         "WHERE funcionario.nacionalidade = ? " +
                         "AND data_semana >= ? " +
                         "AND data_semana <= ? ";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,nacionalidade);
            prepStatement.setString(2,dataSemIni);
            prepStatement.setString(3, dataSemFim);
            
            ResultSet rs = prepStatement.executeQuery();
            
            
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                list.add(new FuncionarioHoras(Integer.toString(rs.getInt("cadastra_horas.id")),Integer.toString(rs.getInt("id_func")),
                rs.getString("funcionario.nome"),rs.getString("data_semana"),rs.getString("horas_dom"),rs.getString("horas_seg"),                       
                rs.getString("horas_ter"),rs.getString("horas_qua"),rs.getString("horas_qui"),rs.getString("horas_sex"),
                rs.getString("horas_sab")));
            }
            conexao.close();
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
            return null;
        }
    }

    @Override
    //Retorna uma lista de cadastro de horas de funcionarios que possuem o campo
    //bsp igual ao informado na tarefa CURRENT do funcionario
    //e o campo data_semana entre duas datas informadas
    public List<FuncionarioHoras> hrsTrabByBsp(String bsp, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT cadastra_horas.id,cadastra_horas.id_func, funcionario.nome, "+
                         "cadastra_horas.data_semana, cadastra_horas.horas_dom, cadastra_horas.horas_seg, "+
                         "cadastra_horas.horas_ter, cadastra_horas.horas_qua, cadastra_horas.horas_qui, "+
                         "cadastra_horas.horas_sex, cadastra_horas.horas_sab " +
                         "FROM cadastra_horas " +
                         "INNER JOIN funcionario ON cadastra_horas.id_func = funcionario.id " +
                         "INNER JOIN tarefas ON cadastra_horas.id_tarefa = tarefas.id " +
                         "WHERE tarefas.bsp = ? " +
                         "AND cadastra_horas.data_semana >= ? " +
                         "AND cadastra_horas.data_semana <= ? ";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,bsp);
            prepStatement.setString(2,dataSemIni);
            prepStatement.setString(3, dataSemFim);
            
            ResultSet rs = prepStatement.executeQuery();
            conexao.close();
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                list.add(new FuncionarioHoras(Integer.toString(rs.getInt("id_horas")),Integer.toString(rs.getInt("id_func")),
                rs.getString("nome_func"),rs.getString("data_semana"),rs.getString("horas_dom"),rs.getString("horas_seg"),                       
                rs.getString("horas_ter"),rs.getString("horas_qua"),rs.getString("horas_qui"),rs.getString("horas_sex"),
                rs.getString("horas_sab")));
            }
            return list;
         
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
            return null;
        }
    }

    @Override
    //Retorna uma lista de cadastro de horas de funcionarios que possuem o campo
    //task number igual ao informado na tarefa CURRENT do funcionário
    //e o campo data_semana entre duas datas informadas
    public List<FuncionarioHoras> hrsTrabByTaskNumber(String taskNumber, String dataSemIni, String dataSemFim) {
       try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT cadastra_horas.id,cadastra_horas.id_func, funcionario.nome, "+
                         "cadastra_horas.data_semana, cadastra_horas.horas_dom, cadastra_horas.horas_seg, "+
                         "cadastra_horas.horas_ter, cadastra_horas.horas_qua, cadastra_horas.horas_qui, "+
                         "cadastra_horas.horas_sex, cadastra_horas.horas_sab " +
                         "FROM cadastra_horas " +
                         "INNER JOIN funcionario ON cadastra_horas.id_func = funcionario.id " +
                         "INNER JOIN tarefas ON cadastra_horas.id_tarefa = tarefas.id " +
                         "WHERE tarefas.task_number = ? " +
                         "AND cadastra_horas.data_semana >= ? " +
                         "AND cadastra_horas.data_semana <= ? ";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,taskNumber);
            prepStatement.setString(2,dataSemIni);
            prepStatement.setString(3, dataSemFim);
            
            ResultSet rs = prepStatement.executeQuery();
            conexao.close();
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                list.add(new FuncionarioHoras(Integer.toString(rs.getInt("id_horas")),Integer.toString(rs.getInt("id_func")),
                rs.getString("nome_func"),rs.getString("data_semana"),rs.getString("horas_dom"),rs.getString("horas_seg"),                       
                rs.getString("horas_ter"),rs.getString("horas_qua"),rs.getString("horas_qui"),rs.getString("horas_sex"),
                rs.getString("horas_sab")));
            }
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
            return null;

        }
    }

    @Override
    //Retorna uma lista de cadastro de horas de funcionarios que possuem o campo
    //unidade/navio igual ao informado na tarefa CURRENT do funcionario
    //e o campo data_semana entre duas datas informadas
    public List<FuncionarioHoras> hrsTrabByNavio(String navio, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT cadastra_horas.id,cadastra_horas.id_func, funcionario.nome, "+
                         "cadastra_horas.data_semana, cadastra_horas.horas_dom, cadastra_horas.horas_seg, "+
                         "cadastra_horas.horas_ter, cadastra_horas.horas_qua, cadastra_horas.horas_qui, "+
                         "cadastra_horas.horas_sex, cadastra_horas.horas_sab " +
                         "FROM cadastra_horas " +
                         "INNER JOIN funcionario ON cadastra_horas.id_func = funcionario.id " +
                         "INNER JOIN tarefas ON cadastra_horas.id_tarefa = tarefas.id " +
                         "WHERE tarefas.navio = ? " +
                         "AND cadastra_horas.data_semana >= ? " +
                         "AND cadastra_horas.data_semana <= ? ";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,navio);
            prepStatement.setString(2,dataSemIni);
            prepStatement.setString(3, dataSemFim);
            
            ResultSet rs = prepStatement.executeQuery();
            conexao.close();
            
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                list.add(new FuncionarioHoras(Integer.toString(rs.getInt("id_horas")),Integer.toString(rs.getInt("id_func")),
                rs.getString("nome_func"),rs.getString("data_semana"),rs.getString("horas_dom"),rs.getString("horas_seg"),                       
                rs.getString("horas_ter"),rs.getString("horas_qua"),rs.getString("horas_qui"),rs.getString("horas_sex"),
                rs.getString("horas_sab")));
            }
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
            return null;
        }
    }
}
