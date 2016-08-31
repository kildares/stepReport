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
import stepReport.model.ConnectionDB;
/**
 *
 * @author gabriela
 */
public class CadastraHorasDAOJDBCImpl implements CadastraHorasDAO{

    @Override
    public void create(String dataSemana, int hrDom, int hrSeg, int hrTer, int hrQua, int hrQui, int hrSex, int hrSab, int idFunc, int idTarefa) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "INSERT INTO cadastra_horas(data_semana,horas_dom,horas_seg,horas_ter,horas_qua,horas_qui,horas_sex,horas_sab,id_func,id_tarefa)"+
                               "VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setString(1,dataSemana);
            prepStatement.setInt(2, hrDom);
            prepStatement.setInt(3, hrSeg);
            prepStatement.setInt(4, hrTer);
            prepStatement.setInt(5, hrQua);
            prepStatement.setInt(6, hrQui);
            prepStatement.setInt(7, hrSex);
            prepStatement.setInt(8, hrSab);
            prepStatement.setInt(9, idFunc);
            prepStatement.setInt(10, idTarefa);
            
            prepStatement.executeUpdate();
            conexao.close();
            
            JOptionPane.showMessageDialog(new JFrame(), "HORAS CADASTRADAS COM SUCESSO!");
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO CADASTRAR HORAS!");
        }
    }

    @Override
    public ArrayList<String> findCadastro(int idFunc, String dataSemana) {
        try{
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            String sql = "SELECT * FROM cadastra_horas "+
                               "WHERE id_func = ? "+
                               "AND data_semana = ?";
            PreparedStatement prepStatement = conexao.prepareStatement(sql);
            prepStatement.setInt(0, idFunc);
            prepStatement.setString(1,dataSemana);
            
            ResultSet rs = prepStatement.executeQuery();
            if(rs.next()){
                ArrayList<String> info = new ArrayList<String>();
                info.add(Integer.toString(rs.getInt("horas_dom")));
                info.add(Integer.toString(rs.getInt("horas_seg")));
                info.add(Integer.toString(rs.getInt("horas_ter")));
                info.add(Integer.toString(rs.getInt("horas_qua")));
                info.add(Integer.toString(rs.getInt("horas_qui")));
                info.add(Integer.toString(rs.getInt("horas_sex")));
                info.add(Integer.toString(rs.getInt("horas_sab")));
                info.add(Integer.toString(rs.getInt("id")));
                conexao.close();
                return info;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "ERRO AO CADASTRAR HORAS!");
        }
        return null; 
    }
    @Override
    public boolean update(int id,int hrDom, int hrSeg, int hrTer, int hrQua, int hrQui, int hrSex, int hrSab) {
        try {
            ConnectionDB conn = new ConnectionDB();
            Connection conexao = conn.getConnection();
            
            String createSQL = "UPDATE cadastra_horas "+
                               "SET horas_dom = ?, horas_seg = ?, horas_ter = ?, horas_qua = ?, "+
                               "horas_qui = ?, horas_sex = ?, horas_sab = ? "+
                               "WHERE id =?";
            PreparedStatement prepStatement = conexao.prepareStatement(createSQL);
            prepStatement.setInt(1, hrDom);
            prepStatement.setInt(2, hrSeg);
            prepStatement.setInt(3, hrTer);
            prepStatement.setInt(4, hrQua);
            prepStatement.setInt(5, hrQui);
            prepStatement.setInt(6, hrSex);
            prepStatement.setInt(7, hrSab);
            prepStatement.setInt(8, id);
            
            prepStatement.executeUpdate();
            conexao.close();
            
            return true;  
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
