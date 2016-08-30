/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAOJDBCImpl;
import stepReport.DAO.*;
import stepReport.model.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriela
 */ 
public class AdminDAOJDBCImpl implements AdminDAO {

    @Override
    public void create(String user, String password) {
        
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "INSERT INTO login(usuario, senha) VALUES (?,?)";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setString(1,user);
            prepStatement.setString(2, password);
            prepStatement.executeUpdate();
                        
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO CADASTRAR USUARIO!");
        }
    }

    @Override
    public void updatePassword(String user, String password) {
       try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String updateSQL = "UPDATE login "+
                               "SET senha=? "+
                               "WHERE usuario=?";
            PreparedStatement prepStatement = conexao.prepareStatement(updateSQL);
            prepStatement.setString(1, password);
            prepStatement.setString(2, user);
            prepStatement.executeUpdate();
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO ATUALIZAR USUARIO!");
        }
    }
    
    @Override
    public AdminModel findByUser(String user){
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String updateSQL = "SELECT * FROM login "+
                               "WHERE usuario=?";
            PreparedStatement prepStatement = conexao.prepareStatement(updateSQL);
            prepStatement.setString(1, user);
            ResultSet rs = prepStatement.executeQuery();
            if(rs.next()){
                AdminModel md = new AdminModel(rs.getString("usuario"),rs.getString("senha"));
                conexao.close();
                return md;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "USUARIO NAO ENCONTRADO!");
        }
        return null;
    }
    
    @Override
    public void remove(String user){
       try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String deleteSQL = "DELETE FROM login "+
                               "WHERE usuario=?";
            PreparedStatement prepStatement = conexao.prepareStatement(deleteSQL);
            prepStatement.setString(1, user);
            prepStatement.executeUpdate();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REMOVER USUARIO!");
        }
    }
    
}
