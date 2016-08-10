/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import javax.swing.JFrame;
import stepReport.model.loginModel;
import stepReport.view.loginView;
import stepReport.view.mainScreen;

/**
 *
 * @author Kildare
 */
public final class loginControl {
    
    private loginView view;
    private loginModel model;
    private mainScreen screen;

    public mainScreen getScreen() {
        return screen;
    }

    public void setScreen(mainScreen screen) {
        this.screen = screen;
    }
   
    public loginControl(mainScreen screen){
        this.view = new loginView(this);
        this.model = new loginModel();
        this.setScreen(screen);
    }
    
    
    public void renderLoginScreen()
    {
        this.getView().setVisible(true);
    }
    
    
    
    public boolean validateLogin(String user,String password)
    {
        
        if(this.getModel().validateLogin(user,password))
        {
            this.getView().setVisible(false);
            this.getScreen().loadFuncionario();
        }
       
        
        return true;
    }
    
     public loginView getView() {
        return view;
    }

    public void setView(loginView view) {
        this.view = view;
    }
    
     public loginModel getModel() {
        return model;
    }

    public void setModel(loginModel model) {
        this.model = model;
    }
    
   
   
    
}
