/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stepReport.control.loginControl;

/**
 *
 * @author Kildare
 */
public final class loginView extends javax.swing.JPanel {

    /**
     * Creates new form loginView
     */
    private loginControl control;

    
    
    public loginView() {
        initComponents();
    }

    public loginView(loginControl control) {
        initComponents();
        this.setControl(control);
    }
    
    
    public loginControl getControl() {
        return control;
    }

    public void setControl(loginControl control) {
        this.control = control;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        passTextField = new javax.swing.JPasswordField();
        loginButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        passwordLabel.setText("Senha:");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 62, -1, -1));

        userLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        userLabel.setText("Usuário:");
        add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        userTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 13, 150, -1));

        passTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(passTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 60, 150, -1));

        loginButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        loginButton1.setText("ENTRAR");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:
         String user;
        user = this.userTextField.getText();
        String password = new String(this.passTextField.getPassword());
        if(user.equals("")&&password.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Campos Usuário e Senha não podem ser vazios");
        }
        else if(user.equals(""))
            JOptionPane.showMessageDialog(new JFrame(), "Campo Usuário não pode ser vazio");
        else if(password.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Campo Senha não pode ser vazio");
        }
        else
            if(!this.getControl().validateLogin(user, password)){
                JOptionPane.showMessageDialog(new JFrame(), "Usuário não encontrado");
            }
    }//GEN-LAST:event_loginButton1ActionPerformed

    public void setGroupVisible(boolean isVisible){
        
            this.passTextField.setVisible(isVisible);
            this.passwordLabel.setVisible(isVisible);
            this.userTextField.setVisible(isVisible);
            this.userLabel.setVisible(isVisible);
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton1;
    private javax.swing.JPasswordField passTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
