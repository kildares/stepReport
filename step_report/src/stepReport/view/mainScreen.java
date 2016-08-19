/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import stepReport.control.AdminControl;
import stepReport.control.TarefasControl;
import stepReport.control.FuncionarioControl;
import stepReport.control.PeriodoControl;
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
    private PeriodoControl periodo;
    private TarefasControl tarefasFuncionario;
    
    private static JPanel active;
    
    public mainScreen() {
        initComponents();
        this.setLogin(new loginControl(this));
        this.setFuncionario(new FuncionarioControl(this));
        this.setAdmin(new AdminControl(this));
        this.setPeriodo(new PeriodoControl(this));
        this.setTarefasFuncionario(new TarefasControl(this));
        
        this.add(this.getLogin().getView());
        this.add(this.getFuncionario().getView());
        this.add(this.getAdmin().getView());
        this.add(this.getPeriodo().getView());
        this.add(this.getTarefasFuncionario().getView());
        
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
        funcMenu = new javax.swing.JMenu();
        buscarFuncMenuItem = new javax.swing.JMenuItem();
        CadastroFuncMenuItem = new javax.swing.JMenuItem();
        searchTarefaMenuItem = new javax.swing.JMenuItem();
        tarefasMenuItem = new javax.swing.JMenuItem();
        searchHorasMenuItem = new javax.swing.JMenuItem();
        RegistroMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        userMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        userMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Arquivo");

        jMenuItem3.setText("Salvar");
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Imprimir");
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Toolbar.add(jMenu1);

        funcMenu.setText("Funcionário");
        funcMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcMenuActionPerformed(evt);
            }
        });

        buscarFuncMenuItem.setText("Buscar");
        buscarFuncMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFuncMenuItemActionPerformed(evt);
            }
        });
        funcMenu.add(buscarFuncMenuItem);

        CadastroFuncMenuItem.setText("Cadastrar");
        CadastroFuncMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFuncMenuItemActionPerformed(evt);
            }
        });
        funcMenu.add(CadastroFuncMenuItem);

        searchTarefaMenuItem.setText("Visualizar Tarefa");
        searchTarefaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTarefaMenuItemActionPerformed(evt);
            }
        });
        funcMenu.add(searchTarefaMenuItem);

        tarefasMenuItem.setText("Registro de Tarefa");
        tarefasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarefasMenuItemActionPerformed(evt);
            }
        });
        funcMenu.add(tarefasMenuItem);

        searchHorasMenuItem.setText("Visualizar Horas");
        searchHorasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHorasMenuItemActionPerformed(evt);
            }
        });
        funcMenu.add(searchHorasMenuItem);

        RegistroMenuItem.setText("Registro de horas");
        RegistroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroMenuItemActionPerformed(evt);
            }
        });
        funcMenu.add(RegistroMenuItem);

        Toolbar.add(funcMenu);

        jMenu3.setText("Relatório");
        Toolbar.add(jMenu3);

        userMenu.setText("Usuário");

        jMenuItem4.setText("Cadastrar Usuário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        userMenu.add(jMenuItem4);

        userMenuItem.setText("Mudar senha");
        userMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMenuItemActionPerformed(evt);
            }
        });
        userMenu.add(userMenuItem);

        Toolbar.add(userMenu);

        setJMenuBar(Toolbar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMenuItemActionPerformed
        // TODO add your handling code here:
        
        mainScreen.active.setVisible(false);
        this.getAdmin().initView();
    }//GEN-LAST:event_userMenuItemActionPerformed

    private void RegistroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroMenuItemActionPerformed
        // TODO add your handling code here:
          
        mainScreen.active.setVisible(false);
        this.getPeriodo().initSearchView();
        
        
    }//GEN-LAST:event_RegistroMenuItemActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        mainScreen.active.setVisible(false);
        this.getAdmin().initNewView();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void buscarFuncMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFuncMenuItemActionPerformed
        // TODO add your handling code here:
        mainScreen.active.setVisible(false);
        this.getFuncionario().initSearchView();
    }//GEN-LAST:event_buscarFuncMenuItemActionPerformed

    private void CadastroFuncMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFuncMenuItemActionPerformed
        // TODO add your handling code here:
        mainScreen.active.setVisible(false);
        this.getFuncionario().initNewView();
    }//GEN-LAST:event_CadastroFuncMenuItemActionPerformed

    private void funcMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcMenuActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_funcMenuActionPerformed

    private void searchTarefaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTarefaMenuItemActionPerformed
        // TODO add your handling code here:
        
        mainScreen.active.setVisible(false);
        this.getTarefasFuncionario().initSearchView();
    }//GEN-LAST:event_searchTarefaMenuItemActionPerformed

    private void tarefasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarefasMenuItemActionPerformed
        // TODO add your handling code here:

        mainScreen.active.setVisible(false);
        this.getTarefasFuncionario().initNewView();
        
    }//GEN-LAST:event_tarefasMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void searchHorasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHorasMenuItemActionPerformed
        // TODO add your handling code here:
        mainScreen.active.setVisible(false);
        this.getPeriodo().initSearchView();
        

    }//GEN-LAST:event_searchHorasMenuItemActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JMenuItem CadastroFuncMenuItem;
    private javax.swing.JMenuItem RegistroMenuItem;
    private javax.swing.JMenuBar Toolbar;
    private javax.swing.JMenuItem buscarFuncMenuItem;
    private javax.swing.JMenu funcMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem searchHorasMenuItem;
    private javax.swing.JMenuItem searchTarefaMenuItem;
    private javax.swing.JMenuItem tarefasMenuItem;
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
    
    public void setPeriodo(PeriodoControl control){
        this.periodo = control;
        
    }
    public PeriodoControl getPeriodo(){
        return this.periodo;
    }
    
     public TarefasControl getTarefasFuncionario() {
        return tarefasFuncionario;
    }

    public void setTarefasFuncionario(TarefasControl dadosFuncionario) {
        this.tarefasFuncionario = dadosFuncionario;
    }
    
}
