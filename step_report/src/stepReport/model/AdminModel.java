/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

import java.util.List;
import stepReport.DAO.AdminDAO;
import stepReport.DAOJDBCImpl.AdminDAOJDBCImpl;
import stepReport.control.AdminControl;

/**
 *
 * @author Kildare
 */
public class AdminModel {

    private String Usuario, Senha;
    private AdminControl Control;
    private boolean Logged;


    private static AdminModel instance = null;
   
    private AdminModel(){
        this.Logged = false;
    }
    
    public static AdminModel getInstance(String usuario,String senha)
    {
        if(AdminModel.instance == null){
            AdminModel.instance = new AdminModel(usuario,senha);
        }
        else
        {
            AdminModel.instance.setSenha(senha);
            AdminModel.instance.setUsuario(usuario);
        }
        return AdminModel.instance;
    }
    
    
    public static AdminModel getInstance()
    {
        if(AdminModel.instance == null){
            AdminModel.instance = new AdminModel();
        }
        return AdminModel.instance;
    }
    
    
    private AdminModel(String usuario, String senha) {
        this.Usuario = usuario;
        this.Senha = senha;
        this.Logged = false;
    }
    
    
    /**
     * @param user
     * @param password
     * @return true if valid login. False if !valid login
     */
    public boolean validateLogin(String user,String password){
        AdminDAO conn = new AdminDAOJDBCImpl();
        List<String> data = conn.findByUser(user);
        if(data != null){
            if(data.get(1).equals(password))
            {
                //TODO inserir log de login realizado no sistemas
                this.setSenha(data.get(1));
                this.setUsuario(data.get(0));
                this.setLogged(true);
                return true;
            }
        }
        return false;
    }

    public void registerUser(String user,String pass) {
        
    }
    
    
    public boolean isValidPassword(String user,String oldPass) {
        AdminDAO adm = new AdminDAOJDBCImpl();
        List<String> credent = adm.findByUser(user);
        return credent.get(1).equals(oldPass);
    }

    public boolean updatePassword(String user, String pass) {
        AdminDAO conn = new AdminDAOJDBCImpl();
        if(conn.updatePassword(user, pass)){
            logModel log = new logModel("login");
            log.logData("Alter User: "+user);
        }
        return true;
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
     public AdminControl getControl() {
        return Control;
    }

    public void setControl(AdminControl Control) {
        this.Control = Control;
    }
    
    public boolean isLogged() {
        return Logged;
    }

    public void setLogged(boolean Logged) {
        this.Logged = Logged;
    }

    
}
