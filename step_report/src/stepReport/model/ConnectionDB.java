/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriela
 */
public class ConnectionDB {
    
    public ConnectionDB(){
    }
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String serverName = "127.0.0.1:3306";     //caminho do servidor do BD
    private static String dbName = "db_report";         //nome do BD
    private static String url = "jdbc:mysql://"+ serverName + "/" + dbName;
    private static String user = "root";
    private static String password = "123456";    //ENCONTRAR PARAMETRO PARA ATUALIZAR USUARIO E SENHA
    private Connection newConnection;
    
    
    public static void setInfoDB(String driverName, String serverName, String dbName, String user, String password){
        ConnectionDB.driverName = driverName;
        ConnectionDB.serverName = serverName;
        ConnectionDB.dbName = dbName;
        ConnectionDB.url = "jdbc:mysql://" + serverName + "/" + dbName;
        ConnectionDB.user = user;
        ConnectionDB.password = password;
    }
    public Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName(driverName);
            newConnection = DriverManager.getConnection(url, user, password);
            return newConnection;
        }
        catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "O driver especificado não foi encontrado");
            return null;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro ao acessar banco de dados.");
            return null;
        }
    }
}
