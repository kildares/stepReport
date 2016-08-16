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
public final class TarefasModel {

    private TarefasControl Control;

    public TarefasModel(TarefasControl control) {
        this.setControl(control);
    }

    public ArrayList<String> searchTarefas(String numero) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        list.add("");
        list.add("");
        return list;
        
    }
    
    public TarefasControl getControl() {
        return Control;
    }

    public void setControl(TarefasControl control) {
        this.Control = control;
    }

    public boolean editTarefa(String bsp, String navio, String task) {
        return true;
    }
    
    
}
