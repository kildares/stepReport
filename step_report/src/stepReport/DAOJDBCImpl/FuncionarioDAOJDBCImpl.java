/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAOJDBCImpl;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stepReport.DAO.FuncionarioDAO;
import stepReport.model.ConnectionDB;
import stepReport.model.FuncionarioModel;
/**
 *
 * @author gabriela
 */
public class FuncionarioDAOJDBCImpl implements FuncionarioDAO{

    @Override
    public int create(String nome, String nacionalidade, String profissao) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "INSERT INTO funcionario(nome,nacionalidade,profissao) "+
                               "VALUES (?,?,?)";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL,Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1,nome);
            prepStatement.setString(2, nacionalidade);
            prepStatement.setString(3, profissao);
            prepStatement.executeUpdate();
            ResultSet rs = prepStatement.getGeneratedKeys();
            if(rs.next()){
                int result = rs.getInt(1);
                conexao.close();
                return result;
            }  
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public boolean update(int id, String nome, String nacionalidade, String profissao) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String updateSQL = "UPDATE funcionario "+
                               "SET nome=?,nacionalidade=?,profissao=? "+
                               "WHERE id=?";
            PreparedStatement prepStatement = conexao.prepareStatement(updateSQL);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, nacionalidade);
            prepStatement.setString(3, profissao);
            prepStatement.setInt(4, id);
            prepStatement.executeUpdate();
            
            conexao.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void remove(int id) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String deleteSQL = "DELETE FROM funcionario "+
                               "WHERE id=?";
            PreparedStatement prepStatement = conexao.prepareStatement(deleteSQL);
            prepStatement.setInt(1, id);
            prepStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(new JFrame(), "FUNCIONARIO REMOVIDO COM SUCESSO!");
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REMOVER FUNCIONARIO!");
        }
    }

    @Override
    public FuncionarioModel findByID(int id) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String updateSQL = "SELECT * FROM funcionario "+
                               "WHERE id=?";
            PreparedStatement prepStatement = conexao.prepareStatement(updateSQL);
            prepStatement.setInt(1, id);
            ResultSet rs = prepStatement.executeQuery();
            conexao.close();
            
            if(rs.next()){
                return new FuncionarioModel(rs.getString("nome"),rs.getString("nacionalidade"), rs.getString("profissao"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "FUNCIONARIO NAO ENCONTRADO!");
        }
        return null;
    }

    @Override
    public List<FuncionarioModel> findAll() {
      //TODO  
      
      return null;
    }
    
    
    
}
