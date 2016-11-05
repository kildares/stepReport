/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAOJDBCImpl;
import stepReport.DAO.*;
import stepReport.model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriela
 */ 
public class AdminDAOJDBCImpl implements AdminDAO {

    @Override
    public boolean create(String user, String password) {
        
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "INSERT INTO login(usuario, senha) VALUES (?,?)";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setString(1,user);
            prepStatement.setString(2, password);
            prepStatement.executeUpdate();

            conexao.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false; 
        }
    }

    @Override
    public boolean updatePassword(String user, String password) {
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
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    @Override
    public ArrayList<String> findByUser(String user){
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String updateSQL = "SELECT * FROM login "+
                               "WHERE usuario=?";
            PreparedStatement prepStatement = conexao.prepareStatement(updateSQL);
            prepStatement.setString(1, user);
            ResultSet rs = prepStatement.executeQuery();
            if(rs.next())
            {    
                ArrayList<String> md = new ArrayList<String>();
                md.add(rs.getString("usuario"));
                md.add(rs.getString("senha"));
                
                conexao.close();
                return md;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public boolean remove(String user){
       try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "DELETE FROM login "+
                               "WHERE usuario=?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, user);
            prepStatement.executeUpdate();
            conexao.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);            
            return false;
        }
    }
    
}
