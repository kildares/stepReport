/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import java.util.ArrayList;
import stepReport.model.PeriodoModel;
import stepReport.view.PeriodoView;
import stepReport.view.mainScreen;

/**
 *
 * @author Kildare
 */
public final class PeriodoControl {
    
    private mainScreen Screen;
    private PeriodoView View;

   
    private PeriodoModel Model;
    
    public PeriodoControl(mainScreen screen){
        
        this.Screen = screen;
        this.View = new PeriodoView(this);
        this.Model = new PeriodoModel();
        
        this.getView().insertDatePicker();
        
        this.getView().setVisible(false);
    }

    public void initSearchView() {
        
        this.getView().initSearchView();
        mainScreen.setActive(this.getView());
        this.getView().setBounds(0, 0, 800, 500);
        this.getView().setVisible(true);
    }
    
    public void initRegisterView() {
        this.getView().initRegisterView();
        mainScreen.setActive(this.getView());
        this.getView().setBounds(0, 0, 800, 500);
        this.getView().setVisible(true);    
    }
    
     public mainScreen getScreen() {
        return Screen;
    }

    public void setScreen(mainScreen Screen) {
        this.Screen = Screen;
    }

    public PeriodoView getView() {
        return View;
    }

    public void setView(PeriodoView View) {
        this.View = View;
    }

    public PeriodoModel getModel() {
        return Model;
    }

    public void setModel(PeriodoModel Model) {
        this.Model = Model;
    }

    public ArrayList<String> searchTarefa(String numeroFunc, String replace) {
        //return this.getModel().searchTarefa(numeroFunc,replace);
        return null;
    }
    public boolean updateCadastro(String idCadastro, String hrDom, String hrSeg, String hrTer, String hrQua, String hrQui,
                                String hrSex, String hrSab) {
        //return this.getModel().updateCadastro(idCadastro, hrDom, hrSeg, hrTer, hrQua, hrQui, hrSex, hrSab);
        return false;
    }
    
    public boolean createCadastro(String idFunc, String dataSemana, String hrDom, String hrSeg, String hrTer, String hrQua, String hrQui,
                                String hrSex, String hrSab) {
        //return this.getModel().createCadastro(idFunc, dataSemana, hrDom, hrSeg, hrTer, hrQua, hrQui, hrSex, hrSab);
        return false;
    }
    
}
