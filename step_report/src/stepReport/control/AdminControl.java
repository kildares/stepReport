/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import Exceptions.alreadyExistsException;
import Exceptions.notFoundException;
import java.util.ArrayList;
import java.util.List;
import stepReport.DAO.AdminDAO;
import stepReport.DAOJDBCImpl.AdminDAOJDBCImpl;
import stepReport.model.AdminModel;
import stepReport.view.AdminView;
import stepReport.view.mainScreen;

/**
 *
 * @author Kildare
 */
public final class AdminControl{

    private AdminView View;
    private mainScreen screen;
    private AdminModel model;

    public AdminControl(mainScreen screen) {
        this.setView(new AdminView(this));
        this.setScreen(screen);
        this.setModel(new AdminModel());
        
        this.getView().setVisible(false);
    }
    
    public AdminView getView() {
        return View;
    }

    public void setView(AdminView View) {
        this.View = View;
    }

    public mainScreen getScreen() {
        return screen;
    }

    public void setScreen(mainScreen screen) {
        this.screen = screen;
    }

    public AdminModel getModel() {
        return model;
    }
    
     public void setModel(AdminModel model) {
        this.model = model;
    }

    public void initView() {
        
        
        this.getView().loadSearchView();
        mainScreen.setActive(this.getView());
        this.getView().setBounds(0, 0, 800, 500);
        this.getView().setVisible(true);
    }

    public void initNewView() {
        this.getView().loadNewView();
        mainScreen.setActive(this.getView());
        this.getView().setBounds(0, 0, 800, 500);
        this.getView().setVisible(true);
    }

    public void registerUser(String user, String pass) throws alreadyExistsException 
    {
        AdminDAO conn = new AdminDAOJDBCImpl();
        AdminModel modelo = conn.findByUser(user);
        if(modelo == null)
            conn.create(user, pass);
        else
            throw new alreadyExistsException("Usuario já existe");
    }
    public boolean findUser(String username) throws notFoundException{
        AdminDAO conn = new AdminDAOJDBCImpl();
        AdminModel adm = conn.findByUser(username);
        if(adm == null)
            throw new notFoundException("Usuário não existe");
        else{ 
            this.setModel(adm);
            return true;
        }
    }

    public boolean isValidPassword(String oldPass) {
        return oldPass.equals(this.getModel().getSenha());
            
    }
    
    public void updatePassword(String user,String pass){
        AdminDAO conn = new AdminDAOJDBCImpl();
        conn.updatePassword(user, pass);
    }
    
}
