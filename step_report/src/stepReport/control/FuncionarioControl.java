/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import stepReport.view.FuncionarioView;
import stepReport.view.mainScreen;

/**
 *
 * @author Kildare
 */
public final class FuncionarioControl {

    private mainScreen Screen;
    private FuncionarioView View;
    private FuncionarioModel Model;

    public FuncionarioModel getModel() {
        return Model;
    }

    public void setModel(FuncionarioModel model) {
        this.Model = model;
    }
    
    public FuncionarioControl(mainScreen Screen){
       
        this.setScreen(Screen);
        this.setView(new FuncionarioView());
        
    }
    
    
    public void loadFuncionario() 
    {
        this.getScreen().setBounds(100, 50, 800, 600);
        this.getView().setVisible(true);
    }
    
    
    public mainScreen getScreen() {
        return Screen;
    }

    public void setScreen(mainScreen Screen) {
        this.Screen = Screen;
    }

    public FuncionarioView getView() {
        return View;
    }

    public void setView(FuncionarioView view) {
        this.View = view;
    }
    
}
