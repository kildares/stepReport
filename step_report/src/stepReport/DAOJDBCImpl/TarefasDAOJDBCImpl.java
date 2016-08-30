/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAOJDBCImpl;
import java.sql.*;
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
    public void create(int id_func, String bsp, String task_number, String navio) {
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
            prepStatement.setInt(5, id_func);
            
            prepStatement.executeUpdate();
          
            JOptionPane.showMessageDialog(new JFrame(), "DADOS DE FUNCIONARIO CADASTRADO COM SUCESSO!");
          
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO CADASTRAR FUNCIONARIO!");
        }
    }
    
    @Override
    public int findCurrentByIdFunc(int id_func) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * FROM tarefas(bsp,task_number,navio,status_tarefa,id_func) "+
                         "WHERE id_func=?"+
                         "AND status_tarefa=?";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setInt(1, id_func);
            prepStatement.setString(2, "CURRENT");
            ResultSet rs = prepStatement.executeQuery();
            conexao.close();
            if(rs.next()){
                return rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "DADOS DE FUNCIONARIO NAO ENCONTRADOS!");
        }
        return -1;
    }

    @Override
    public void changeStatusToOld(int id) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "UPDATE tarefas"+
                         "SET status_tarefa=?"+
                         "WHERE id=?";
            
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, "CURRENT");
            prepStatement.setInt(2, id);
            prepStatement.executeUpdate();
            conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO ATUALIZAR STATUS DE TAREFA DE FUNCIONARIO!");
        }
    }
}
