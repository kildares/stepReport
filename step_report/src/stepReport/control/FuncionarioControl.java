/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import java.awt.List;
import java.util.ArrayList;
import stepReport.view.FuncionarioView;
import stepReport.view.mainScreen;
import stepReport.model.FuncionarioModel;

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
        this.setModel(new FuncionarioModel());
        this.setScreen(Screen);
        this.setView(new FuncionarioView(this));
        this.getView().setVisible(false);
    }
    
    
    public void initFuncionario() 
    {
        this.setView(new FuncionarioView(this));
        this.getScreen().setBounds(50, 50, 800, 710);
        this.getScreen().add(this.getView());
        mainScreen.setActive(this.getView());
        this.getView().loadSearchView();
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

    /**
     *
     * @param numero
     * @return
     */
    public ArrayList<String> searchFuncionario(String numero) {
        return this.getModel().searchFuncionario(numero);
    }
    
}
