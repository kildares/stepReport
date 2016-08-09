/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import stepReport.model.loginModel;
import stepReport.view.loginView;

/**
 *
 * @author Kildare
 */
public class loginControl {
    
    private loginView view;
    private loginModel model;

   
    public loginControl(){
        this.view = new loginView(this);
        this.model = new loginModel();
    }
    
    public void renderLoginScreen()
    {
        this.getView().setVisible(true);
    }
    
    
    
    public boolean validateLogin(String user,String password)
    {
        return this.getModel().validateLogin(user,password);
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
