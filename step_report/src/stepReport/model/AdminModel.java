/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

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

   
    public AdminModel(){
        
    }
    
    public AdminModel(String usuario, String senha) {
        this.Usuario = usuario;
        this.Senha = senha;
    }
    
    
    /**
     * @param user
     * @param password
     * @return true if valid login. False if !valid login
     */
    public boolean validateLogin(String user,String password){
        return true;
    }

    public void registerUser(String user,String pass) {
        
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
