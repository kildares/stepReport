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
import stepReport.DAO.LogDAO;
import stepReport.model.ConnectionDB;
import stepReport.Util.InfoLog;
/**
 *
 * @author gabriela
 */
public class LogDAOJDBCImpl implements LogDAO{

    @Override
    public boolean create(String usuario, String nomeTabela, String idTabela, String dados, String data) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "INSERT INTO log(usuario,nomeTabela,idTabela,dados,dataLog) "+
                               "VALUES (?,?,?,?,?)";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setString(1,usuario);
            prepStatement.setString(2, nomeTabela);
            prepStatement.setString(3, idTabela);
            prepStatement.setString(4, dados);
            prepStatement.setString(5, data);
            
            prepStatement.executeUpdate();
            conexao.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList<InfoLog> findBtwData(String dataIni, String dataFim) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "SELECT * FROM log "+
                               "WHERE dataLog <= ? "+
                               "AND dataLog >= ?";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setString(1,dataIni);
            prepStatement.setString(2,dataFim);
            
            ResultSet rs = prepStatement.executeQuery();
             ArrayList<InfoLog> result = new ArrayList<InfoLog>();
            while(rs.next()){
                InfoLog info = new InfoLog(rs.getString("id"),rs.getString("usuario"),rs.getString("nomeTabela"),
                               rs.getString("idTabela"),rs.getString("dados"),rs.getString("dataLog"));
                result.add(info);
            }
            conexao.close();
            return result;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

