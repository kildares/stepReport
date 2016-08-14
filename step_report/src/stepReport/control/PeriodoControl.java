/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

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
        this.getView().setVisible(false);
    }

    public void initView() {
        
        this.View.setVisible(true);
        mainScreen.setActive(this.getView());
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
    
}
