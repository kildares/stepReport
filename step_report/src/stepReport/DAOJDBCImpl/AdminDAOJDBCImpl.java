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
            JOptionPane.showMessageDialog(new JFrame(), "Usuário cadastrado com sucesso");
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "Erro ao cadastrar usuário");
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
            
            JOptionPane.showMessageDialog(new JFrame(), "Senha alterada com sucesso");
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "Erro ao atualizar usuario");
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
            JOptionPane.showMessageDialog(new JFrame(), "Usuário não encontrado");
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
            
            JOptionPane.showMessageDialog(new JFrame(), "Usuário removido com sucesso");
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "Erro ao remover usuário");
        }
    }
    
}
