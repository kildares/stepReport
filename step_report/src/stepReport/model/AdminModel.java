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
    private static AdminModel instance = null;
   
    private AdminModel(){
        
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
            if(data.get(1).equals(password)){
                this.setSenha(data.get(1));
                this.setUsuario(data.get(0));
                return true;
            }
        }
        return false;
    }

    public void registerUser(String user,String pass) {
        
    }
    
    
    public boolean isValidPassword(String oldPass) {
        return this.getSenha().equals(oldPass);
    }

    public boolean updatePassword(String user, String pass) {
        AdminDAO conn = new AdminDAOJDBCImpl();
        return conn.updatePassword(user, pass);
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

    
    
}
