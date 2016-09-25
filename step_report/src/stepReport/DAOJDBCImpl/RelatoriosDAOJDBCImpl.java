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
import stepReport.DAO.RelatoriosDAO;
import stepReport.Util.FuncionarioHoras;
import stepReport.model.ConnectionDB;
/**
 *
 * @author gabriela
 */
public class RelatoriosDAOJDBCImpl implements RelatoriosDAO {


    @Override
    public List<FuncionarioHoras> hrsPeriodo(String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * from cadastra_horas " +
                         "WHERE data_semana >= ? "+
                         "AND data_semana <= ?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,dataSemIni);
            prepStatement.setString(2, dataSemFim);
            ResultSet rs = prepStatement.executeQuery();
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                FuncionarioHoras info = new FuncionarioHoras(rs.getString("id"),rs.getString("id_func"),
                                        rs.getString("data_semana"),rs.getString("dia_semana"),rs.getString("horas"),
                                        rs.getString("task_number"),rs.getString("nam"),rs.getString("bsp"),
                                        rs.getString("unidade"));
                list.add(info);
            }
            conexao.close();

            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public List<FuncionarioHoras> hrsPeriodoByFunc(String idFunc, String dataSemIni, String dataSemFim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FuncionarioHoras> hrsPeriodoByTaskNumber(String taskNumber, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * from cadastra_horas " +
                         "WHERE data_semana >= ? "+
                         "AND data_semana <= ? "+
                         "AND task_number = ? ";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,dataSemIni);
            prepStatement.setString(2, dataSemFim);
            prepStatement.setString(3,taskNumber);
            ResultSet rs = prepStatement.executeQuery();
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                FuncionarioHoras info = new FuncionarioHoras(rs.getString("id"),rs.getString("id_func"),
                                        rs.getString("data_semana"),rs.getString("dia_semana"),rs.getString("horas"),
                                        rs.getString("task_number"),rs.getString("nam"),rs.getString("bsp"),
                                        rs.getString("unidade"));
                list.add(info);
            }
            conexao.close();

            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<FuncionarioHoras> hrsPeriodoByNam(String nam, String dataSemIni, String dataSemFim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FuncionarioHoras> hrsPeriodoByBsp(String bsp, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * from cadastra_horas " +
                         "WHERE data_semana >= ? "+
                         "AND data_semana <= ? "+
                         "AND bsp = ? ";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,dataSemIni);
            prepStatement.setString(2, dataSemFim);
            prepStatement.setString(3,bsp);
            ResultSet rs = prepStatement.executeQuery();
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                FuncionarioHoras info = new FuncionarioHoras(rs.getString("id"),rs.getString("id_func"),
                                        rs.getString("data_semana"),rs.getString("dia_semana"),rs.getString("horas"),
                                        rs.getString("task_number"),rs.getString("nam"),rs.getString("bsp"),
                                        rs.getString("unidade"));
                list.add(info);
            }
            conexao.close();

            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<FuncionarioHoras> hrsPeriodoByUnidade(String unidade, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * from cadastra_horas " +
                         "WHERE data_semana >= ? "+
                         "AND data_semana <= ? "+
                         "AND unidade = ? ";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,dataSemIni);
            prepStatement.setString(2, dataSemFim);
            prepStatement.setString(3,unidade);
            ResultSet rs = prepStatement.executeQuery();
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                FuncionarioHoras info = new FuncionarioHoras(rs.getString("id"),rs.getString("id_func"),
                                        rs.getString("data_semana"),rs.getString("dia_semana"),rs.getString("horas"),
                                        rs.getString("task_number"),rs.getString("nam"),rs.getString("bsp"),
                                        rs.getString("unidade"));
                list.add(info);
            }
            conexao.close();

            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<FuncionarioHoras> hrsPeriodoByNacionalidade(String nacionalidade, String dataSemIni, String dataSemFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * FROM cadastra_horas, funcionario "+
                        "WHERE cadastra_horas.data_semana >= ? " +
                        "AND cadastra_horas.data_semana <= ? " +
                        "AND funcionario.nacionalidade = ? " +
                       "GROUP BY cadastra_horas.id " +
                        "ORDER BY cadastra_horas.data_semana ASC, cadastra_horas.id_func ASC";
                    
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1,dataSemIni);
            prepStatement.setString(2, dataSemFim);
            prepStatement.setString(3, nacionalidade);
            ResultSet rs = prepStatement.executeQuery();
            List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
            while(rs.next()){
                FuncionarioHoras info = new FuncionarioHoras(rs.getString("id"),rs.getString("id_func"),
                                        rs.getString("data_semana"),rs.getString("dia_semana"),rs.getString("horas"),
                                        rs.getString("task_number"),rs.getString("nam"),rs.getString("bsp"),
                                        rs.getString("unidade"));
                list.add(info);
            }
            conexao.close();

            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
