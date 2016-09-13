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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stepReport.DAO.CadastraHorasDAO;
import stepReport.Util.FuncionarioHoras;
import stepReport.model.ConnectionDB;
/**
 *
 * @author gabriela
 */
public class CadastraHorasDAOJDBCImpl implements CadastraHorasDAO{

    @Override
    public boolean create(String dataSemana, String diaSemana, int horas, String taskNumber, String nam, String bsp, String unidade, String idFunc) {
    try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "INSERT INTO cadastra_horas(data_semana,dia_semana,horas,task_number, "+
                               "nam,bsp,unidade,id_func) "+
                               "VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setString(1,dataSemana);
            prepStatement.setString(2, diaSemana);
            prepStatement.setInt(3, horas);
            prepStatement.setString(4, taskNumber);
            prepStatement.setString(5, nam);
            prepStatement.setString(6, bsp);
            prepStatement.setString(7, unidade);
            prepStatement.setString(8, idFunc);
            
            prepStatement.executeUpdate();
            conexao.close();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    @Override
    public ArrayList<FuncionarioHoras> findCadastro(String idFunc, String dataSemana) {
        try{
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            String sql = "SELECT * FROM cadastra_horas "+
                               "WHERE id_func = ? "+
                               "AND data_semana = ?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, idFunc);
            prepStatement.setString(2,dataSemana);
            
            ResultSet rs = prepStatement.executeQuery();
            ArrayList<FuncionarioHoras> result = new ArrayList<FuncionarioHoras>();
            if(rs.next()){
                FuncionarioHoras info = new FuncionarioHoras(rs.getString("id"),rs.getString("id_func"),
                                                   rs.getString("data_semana"),rs.getString("dia_semana"),rs.getString("horas"),
                                                   rs.getString("task_number"),rs.getString("nam"),rs.getString("bsp"),rs.getString("unidade"));
                result.add(info);
                conexao.close();
                return result;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }

    @Override
    public boolean update(String id, int horas, String taskNumber, String nam, String bsp, String unidade) {
       try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "UPDATE cadastra_horas "+
                               "SET horas = ?, task_number= ?, nam = ?, bsp = ?,unidade = ? "+
                               "WHERE id =?";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setInt(1, horas);
            prepStatement.setString(2, taskNumber);
            prepStatement.setString(3, nam);
            prepStatement.setString(4, bsp);
            prepStatement.setString(5, unidade);
            prepStatement.setString(6, id);
            
            prepStatement.executeUpdate();
            conexao.close();
            
            return true;  
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
