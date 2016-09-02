/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import java.util.ArrayList;
import stepReport.model.FuncionarioModel;
import stepReport.model.TarefasModel;
import stepReport.view.TarefasView;
import stepReport.view.mainScreen;

/**
 *
 * @author Kildare
 */
public final class TarefasControl {
 
    private mainScreen screen;
    private TarefasModel model;
    private TarefasView view;
    
    public TarefasControl(mainScreen screen){
        this.setScreen(screen);
        this.setModel(TarefasModel.getInstance(this));
        this.setView(new TarefasView(this));
        this.getModel().setControl(this);
        
        
        this.getView().setVisible(false);
    }
    
    public mainScreen getScreen() {
        return screen;
    }

    public void setScreen(mainScreen screen) {
        this.screen = screen;
    }

    public TarefasModel getModel() {
        return model;
    }

    public void setModel(TarefasModel model) {
        this.model = model;
    }

    public TarefasView getView() {
        return view;
    }

    public void setView(TarefasView view) {
        this.view = view;
    }

    public void initSearchView() {
        
        this.getView().loadSearchView();
        mainScreen.setActive(this.getView());
        this.getView().setBounds(0, 0, 800, 500);
        this.getView().setVisible(true);
    }

    public ArrayList<String> searchTarefas(String numero) {
        return this.getModel().searchTarefas(numero);
        
    }

    public boolean editTarefa(String idFunc, String bsp, String navio, String task) {
        return this.getModel().editTarefa(idFunc,bsp,navio,task);
    }
            
    public void initNewView() {
        this.getView().loadNewView();
        mainScreen.setActive(this.getView());
        this.getView().setBounds(0, 0, 800, 500);
        this.getView().setVisible(true);
    }
}
