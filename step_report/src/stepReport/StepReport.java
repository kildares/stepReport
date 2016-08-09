/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport;

import stepReport.view.FuncionarioView;
import javax.swing.JFrame;
import stepReport.view.mainScreenView;

/**
 *
 * @author Kildare
 */
public class StepReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mainScreenView screen = new mainScreenView();
        
        screen.setBounds(200, 100, 800, 650);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
        
    }
    
}
