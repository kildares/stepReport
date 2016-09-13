/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAOJDBCImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import stepReport.DAO.LogDAO;
import stepReport.model.ConnectionDB;
/**
 *
 * @author gabriela
 */
public class LogDAOJDBCImpl implements LogDAO{

    @Override
    public boolean create(String usuario, String nomeTabela, String idTabela, String dados) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "INSERT INTO log(usuario,nomeTabela,idTabela,dados) "+
                               "VALUES (?,?,?,?)";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setString(1,usuario);
            prepStatement.setString(2, nomeTabela);
            prepStatement.setString(3, idTabela);
            prepStatement.setString(4, dados);
            
            prepStatement.executeUpdate();
            conexao.close();
     
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}

