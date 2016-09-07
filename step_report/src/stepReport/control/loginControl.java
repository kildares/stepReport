/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import stepReport.model.AdminModel;
import stepReport.view.loginView;
import stepReport.view.mainScreen;

/**
 *
 * @author Kildare
 */
public final class loginControl {
    
    private loginView view;
    private AdminModel model;
    private mainScreen screen;

    public mainScreen getScreen() 
    {
        return screen;
    }

    public void setScreen(mainScreen screen) 
    {
        this.screen = screen;
    }
   
    public loginControl(mainScreen screen){
        this.view = new loginView(this);
        this.view.setVisible(false);
        this.model = AdminModel.getInstance();
        this.setScreen(screen);
    }
    
    
    public void renderLoginScreen()
    {
        mainScreen.setActive(this.getView());
        this.getView().setVisible(true);
    }
    
    
    
    public boolean validateLogin(String user,String password)
    {   
        if(this.getModel().validateLogin(user,password))
        {
            this.getScreen().remove(this.getView());
            this.getScreen().showNextScreen();
            return true;
        }
        return false;
    }
    
     public loginView getView() {
        return view;
    }

    public void setView(loginView view) {
        this.view = view;
    }
    
     public AdminModel getModel() {
        return model;
    }

    public void setModel(AdminModel model) {
        this.model = model;
    }

    public boolean userLogged() {
        return this.getModel().isLogged();
        
    }
    
   
   
    
}
