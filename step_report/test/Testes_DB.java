/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import stepReport.model.ConnectionDB;
/**
 *
 * @author gabriela
 */
public class Testes_DB {
    
    public static void main(String args[]){
        ConnectionDB con = new ConnectionDB();
        Connection con2 = con.getConnection();
    }
}
