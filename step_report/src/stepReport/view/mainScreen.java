/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import stepReport.control.AdminControl;
import stepReport.control.FuncionarioControl;
import stepReport.control.loginControl;

/**
 *
 * @author Kildare
 */
public final class mainScreen extends javax.swing.JFrame {

    /**
     * Creates new form mainScreenView
     */
    private loginControl login;
    private FuncionarioControl funcionario;
    private AdminControl admin;
    private static JPanel active;
    
    public mainScreen() {
        initComponents();
        this.setLogin(new loginControl(this));
        this.setFuncionario(new FuncionarioControl(this));
        this.setAdmin(new AdminControl(this));
        
        this.add(this.getLogin().getView());
        this.add(this.getFuncionario().getView());
        this.add(this.getAdmin().getView());
        
        
        mainScreen.setActive(this.getLogin().getView());
        this.getLogin().getView().setVisible(true);
        
        this.Toolbar.setVisible(false);
        
        
        this.getLogin().getView().setBounds(0, 0, 300, 160);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Toolbar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        userMenu = new javax.swing.JMenu();
        userMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Arquivo");

        jMenuItem3.setText("Salvar");
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Imprimir");
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Sair");
        jMenu1.add(jMenuItem1);

        Toolbar.add(jMenu1);

        userMenu.setText("Usuário");

        userMenuItem.setText("Editar Usuário");
        userMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMenuItemActionPerformed(evt);
            }
        });
        userMenu.add(userMenuItem);

        Toolbar.add(userMenu);

        jMenu3.setText("Relatório");
        Toolbar.add(jMenu3);

        setJMenuBar(Toolbar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMenuItemActionPerformed
        // TODO add your handling code here:
        
        mainScreen.active.setVisible(false);
        this.getAdmin().initView();
    }//GEN-LAST:event_userMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
            
                mainScreen ms = new mainScreen();
                ms.setVisible(true);
                ms.setBounds(300, 300, 300, 210);
                
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Toolbar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu userMenu;
    private javax.swing.JMenuItem userMenuItem;
    // End of variables declaration//GEN-END:variables

    
    public void showMain()
    {
        this.Toolbar.setVisible(true);
        
        
        this.getFuncionario().initFuncionario();
    }
    

    public loginControl getLogin() {
        return login;
    }

    public void setLogin(loginControl login) {
        this.login = login;
    }
   
     public FuncionarioControl getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioControl funcionario) {
        this.funcionario = funcionario;
    }

    public AdminControl getAdmin() {
        return admin;
    }

    public void setAdmin(AdminControl admin) {
        this.admin = admin;
    }    
    
    public static void setActive(JPanel panel){
        mainScreen.active = panel;
    }
    
}
