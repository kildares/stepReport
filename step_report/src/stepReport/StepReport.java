/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport;

import stepReport.view.FuncionarioView;
import javax.swing.JFrame;

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
        
        JFrame screen = new JFrame();
        FuncionarioView view = new FuncionarioView();
        screen.add(view);
        screen.setBounds(0, 0, 800, 630);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
        
    }
    
}
