/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAOJDBCImpl;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stepReport.DAO.TarefasDAO;
import stepReport.model.ConnectionDB;
import stepReport.model.TarefasModel;
/**
 *
 * @author gabriela
 */
public class TarefasDAOJDBCImpl implements TarefasDAO{

    @Override
    //cria tupla nova com id do func e status CURRENT
    public boolean create(String id_func, String bsp, String task_number, String navio) {
         try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "INSERT INTO tarefas(bsp,task_number,navio,status_tarefa,id_func) "+
                               "VALUES (?,?,?,?,?)";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setString(1,bsp);
            prepStatement.setString(2, task_number);
            prepStatement.setString(3, navio);
            prepStatement.setString(4, "CURRENT");
            prepStatement.setString(5, id_func);
            
            prepStatement.executeUpdate();
            conexao.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    @Override
    //retorna o id da tarefa com status=CURRENT relacionada ao funcionario com id=id_func
    public String findCurrentByIdFunc(String id_func) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * FROM tarefas "+
                         "WHERE id_func=? "+
                         "AND status_tarefa=? ";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, id_func);
            prepStatement.setString(2, "CURRENT");
            ResultSet rs = prepStatement.executeQuery();
            
            if(rs.next()){
                String id =  rs.getString("id");
                conexao.close();
                return id;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    //retorna todos os dados da tarefa com id informado
    public ArrayList<String> findById(String id) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * FROM tarefas "+
                         "WHERE id=?";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, id);
            ResultSet rs = prepStatement.executeQuery();
            if(rs.next()){
                ArrayList<String> info = new ArrayList<String>();
                info.add(Integer.toString(rs.getInt("id_func")));
                info.add(rs.getString("bsp"));
                info.add(rs.getString("task_number"));
                info.add(rs.getString("navio"));
                conexao.close();
                return info;    
            } 
        }catch (SQLException ex) {
            Logger.getLogger(TarefasDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    @Override
    //muda o status de uma tarefa CURRENT para OLD
    public boolean changeStatusToOld(String id) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "UPDATE tarefas "+
                         "SET status_tarefa=? "+
                         "WHERE id=?";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, "OLD");
            prepStatement.setString(2, id);
            prepStatement.executeUpdate();
            conexao.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}