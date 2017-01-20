/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAOJDBCImpl;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
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
    public boolean update(String id, String nome, String nacionalidade, String profissao) {
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
            prepStatement.setString(4, id);
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
            
            
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO REMOVER FUNCIONARIO!");
        }
    }

    @Override
    public ArrayList<String> findByID(String id) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT * FROM funcionario "+
                               "WHERE id=?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, id);
            ResultSet rs = prepStatement.executeQuery();
            
            
            if(rs.next()){
                ArrayList<String> func = new ArrayList<String>();
                func.add(rs.getString("nome"));
                func.add(rs.getString("nacionalidade"));
                func.add(rs.getString("Profissao"));
                System.out.println("ResultSet: "+func.get(0)+" "+func.get(1)+" "+func.get(2));
                conexao.close();
                return func;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<FuncionarioModel> findAll() {
      //TODO  
      
      return null;
    }

    @Override
    public String findNomeByID(String id) {
       try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT nome FROM funcionario "+
                               "WHERE id=?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, id);
            ResultSet rs = prepStatement.executeQuery();
            
            if(rs.next()){
                String nFunc = rs.getString("nome");
                conexao.close();
                return nFunc;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String findProfissaoByID(String id) {
       try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT profissao FROM funcionario "+
                               "WHERE id=?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setString(1, id);
            ResultSet rs = prepStatement.executeQuery();
            
            if(rs.next()){
                String nFunc = rs.getString("profissao");
                conexao.close();
                return nFunc;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Map<String,String> getAllNomeID(){
         try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String sql = "SELECT f.nome, f.id FROM funcionario as f ORDER BY f.nome ASC";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);

            ResultSet rs = prepStatement.executeQuery();
            Map<String,String> map = new LinkedHashMap<String,String>();
            while(rs.next())
            {
                map.put(rs.getString("nome"), rs.getString("id"));
            }
            rs.close();
            return map;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean removeFuncionario(String idUser) 
    {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "DELETE FROM funcionario "+
                               "WHERE id =?";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setInt(1, Integer.parseInt(idUser));
            prepStatement.executeUpdate();
            conexao.close();
            return true;  
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
