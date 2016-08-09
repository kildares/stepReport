/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport;

import stepReport.view.FuncionarioView;
import javax.swing.JFrame;
import stepReport.control.loginControl;
import stepReport.view.loginView;
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
        
        loginControl control = new loginControl();
        
        
        JFrame frame = new JFrame();
        frame.add(control.getView());
        frame.setVisible(true);
        frame.setBounds(200, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
}
