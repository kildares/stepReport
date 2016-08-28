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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stepReport.DAO.RelatoriosDAO;
import stepReport.model.ConnectionDB;
/**
 *
 * @author gabriela
 */
public class RelatoriosDAOJDBCImpl implements RelatoriosDAO {

    @Override
    public void totalHorasMensal(String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT id_func,data_semana,horas_dom, horas_seg, horas_ter, horas_qua, horas_qui,"+
                         "horas_sex, horas_sab FROM cadastra_horas" +
                         "WHERE data_semana > ?"+
                         "AND data_semana < ?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,dataSemIni);
            prepStatement.setString(2, dataSemFim);
            ResultSet rs = prepStatement.executeQuery();
            
            //RETORNAR O QUE?
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
        }
    }

    @Override
    public void hrsTrabByNacionalidade(String nacionalidade, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT cadastra_horas.id, cadastra_horas.id_func, funcionario.nome,"+
                         "cadastra_horas.data_semana,cadastra_horas.horas_dom,cadastra_horas.horas_seg," +
                         "cadastra_horas.horas_ter,cadastra_horas.horas_qua,cadastra_horas.horas_qui,"+
                         "cadastra_horas.horas_sex,cadastra_horas.horas_sab FROM cadastra_horas" +
                         "INNER JOIN funcionario" +
                         "ON cadastra_horas.id_func = funcionario.id" +
                         "WHERE funcionario.nacionalidade = ?" +
                         "AND data_semana > ?" +
                         "AND data_semana < ?";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,nacionalidade);
            prepStatement.setString(2,dataSemIni);
            prepStatement.setString(3, dataSemFim);
            
            ResultSet rs = prepStatement.executeQuery();
            
            //RETORNAR O QUE?
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
        }
    }

    @Override
    public void hrsTrabByBsp(String bsp, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT cadastra_horas.id,cadastra_horas.id_func, funcionario.nome,"+
                         "cadastra_horas.data_semana, cadastra_horas.horas_dom, cadastra_horas.horas_seg, "+
                         "cadastra_horas.horas_ter, cadastra_horas.horas_qua, cadastra_horas.horas_qui, "+
                         "cadastra_horas.horas_sex, cadastra_horas.horas_sab " +
                         "FROM cadastra_horas" +
                         "INNER JOIN funcionario ON cadastra_horas.id_func = funcionario.id" +
                         "INNER JOIN tarefas ON cadastra_horas.id_tarefa = tarefas.id" +
                         "WHERE tarefas.bsp = ?" +
                         "AND cadastra_horas.data_semana > ?" +
                         "AND cadastra_horas.data_semana < ?";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,bsp);
            prepStatement.setString(2,dataSemIni);
            prepStatement.setString(3, dataSemFim);
            
            ResultSet rs = prepStatement.executeQuery();
            
            //RETORNAR O QUE?
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
        }
    }

    @Override
    public void hrsTrabByTaskNumber(String taskNumber, String dataSemIni, String dataSemFim) {
       try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT cadastra_horas.id,cadastra_horas.id_func, funcionario.nome,"+
                         "cadastra_horas.data_semana, cadastra_horas.horas_dom, cadastra_horas.horas_seg, "+
                         "cadastra_horas.horas_ter, cadastra_horas.horas_qua, cadastra_horas.horas_qui, "+
                         "cadastra_horas.horas_sex, cadastra_horas.horas_sab " +
                         "FROM cadastra_horas" +
                         "INNER JOIN funcionario ON cadastra_horas.id_func = funcionario.id" +
                         "INNER JOIN tarefas ON cadastra_horas.id_tarefa = tarefas.id" +
                         "WHERE tarefas.task_number = ?" +
                         "AND cadastra_horas.data_semana > ?" +
                         "AND cadastra_horas.data_semana < ?";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,taskNumber);
            prepStatement.setString(2,dataSemIni);
            prepStatement.setString(3, dataSemFim);
            
            ResultSet rs = prepStatement.executeQuery();
            
            //RETORNAR O QUE?
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
        }
    }

    @Override
    public void hrsTrabByNavio(String navio, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT cadastra_horas.id,cadastra_horas.id_func, funcionario.nome,"+
                         "cadastra_horas.data_semana, cadastra_horas.horas_dom, cadastra_horas.horas_seg, "+
                         "cadastra_horas.horas_ter, cadastra_horas.horas_qua, cadastra_horas.horas_qui, "+
                         "cadastra_horas.horas_sex, cadastra_horas.horas_sab " +
                         "FROM cadastra_horas" +
                         "INNER JOIN funcionario ON cadastra_horas.id_func = funcionario.id" +
                         "INNER JOIN tarefas ON cadastra_horas.id_tarefa = tarefas.id" +
                         "WHERE tarefas.navio = ?" +
                         "AND cadastra_horas.data_semana > ?" +
                         "AND cadastra_horas.data_semana < ?";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,navio);
            prepStatement.setString(2,dataSemIni);
            prepStatement.setString(3, dataSemFim);
            
            ResultSet rs = prepStatement.executeQuery();
            
            //RETORNAR O QUE?
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REALIZAR CONSULTA!");
        }
    }
    
}
