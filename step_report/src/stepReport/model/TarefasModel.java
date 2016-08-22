/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

import java.util.ArrayList;
import stepReport.control.TarefasControl;

/**
 *
 * @author Kildare
 */
public class TarefasModel {

    private TarefasControl control;

    
    private static TarefasModel instance = null;
    
    protected TarefasModel(){
        
    }
    
    
    public static TarefasModel getInstance(TarefasControl control){
        if(TarefasModel.instance == null){
            instance = new TarefasModel();
        }
        TarefasModel.instance.setControl(control);
        
        return TarefasModel.instance;
    }
    
    
    public ArrayList<String> searchTarefas(String numero) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        list.add("");
        list.add("");
        return list;
        
    }
    
    public boolean editTarefa(String bsp, String navio, String task) {
        return true;
    }
    
    
    public TarefasControl getControl() {
        return control;
    }

    public void setControl(TarefasControl control) {
        this.control = control;
    }
    
    
}
