/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
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
        loginButton = new javax.swing.JButton();
        passTextField = new javax.swing.JPasswordField();

        passwordLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        passwordLabel.setText("Senha:");

        userLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        userLabel.setText("Usuário:");

        userTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        loginButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        loginButton.setText("ENTRAR");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userLabel)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginButton)
                    .addComponent(userTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(passTextField))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(loginButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String user, password;
        user = this.userTextField.getText();
        password = this.passTextField.getText();
        if(user.equals("")&&password.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Campos Usuário e Senha não podem ser vazios");
        }
        else if(user.equals(""))
            JOptionPane.showMessageDialog(new JFrame(), "Campo Usuário não pode ser vazio");
        else if(password.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Campo Senha não pode ser vazio");
        }
        else{
            
            this.getControl().validateLogin(user, password);
            
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    public void setGroupVisible(boolean isVisible){
        
            this.passTextField.setVisible(isVisible);
            this.passwordLabel.setVisible(isVisible);
            this.userTextField.setVisible(isVisible);
            this.userLabel.setVisible(isVisible);
            this.loginButton.setVisible(isVisible);
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
