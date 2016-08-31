/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.view;


import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import stepReport.control.PeriodoControl;


/**
 *
 * @author Kildare
 */
public final class PeriodoView extends javax.swing.JPanel {

    /**
     * Creates new form PeriodoView
     */
    private PeriodoControl Control;
    private JDatePickerImpl DatePicker;
    
    private static int state;
    private static final int CADASTRO = 1;        
    private static final int BUSCA = 2;
    private static final int EDIT = 3;
    private static final int REMOVE = 4; 
    
    
    public PeriodoView(PeriodoControl control) {
        initComponents();
        
        this.setControl(control);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        titleLabel = new javax.swing.JLabel();
        dataLabel = new javax.swing.JLabel();
        confirmarButton = new javax.swing.JButton();
        nomeLabel1 = new javax.swing.JLabel();
        diasPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SabadoTextField = new javax.swing.JFormattedTextField();
        DomingoTextField = new javax.swing.JFormattedTextField();
        SegundaTextField = new javax.swing.JFormattedTextField();
        TercaTextField = new javax.swing.JFormattedTextField();
        QuartaTextField = new javax.swing.JFormattedTextField();
        QuintaTextField = new javax.swing.JFormattedTextField();
        SextaTextField = new javax.swing.JFormattedTextField();
        numeroTextField = new javax.swing.JFormattedTextField();

        jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jFormattedTextField5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setText("Registrar Hora");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 13, -1, -1));

        dataLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        dataLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataLabel.setText("Data da semana:");
        add(dataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 219, -1));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("Registrar");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, 40));

        nomeLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nomeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeLabel1.setText("Número do trabalhador:");
        add(nomeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 219, -1));

        diasPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        diasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Terça-Feira:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        diasPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Domingo:");
        diasPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sábado:");
        diasPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Quarta-Feira:");
        diasPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Quinta-Feira:");
        diasPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Sexta-Feira:");
        diasPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Segunda-Feira:");
        diasPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        SabadoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        SabadoTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        diasPanel.add(SabadoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 490, -1));

        DomingoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        DomingoTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        diasPanel.add(DomingoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 490, -1));

        SegundaTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        SegundaTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        diasPanel.add(SegundaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 490, -1));

        TercaTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        TercaTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        diasPanel.add(TercaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 490, -1));

        QuartaTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        QuartaTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        diasPanel.add(QuartaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 490, -1));

        QuintaTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        QuintaTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        diasPanel.add(QuintaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 490, -1));

        SextaTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        SextaTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        diasPanel.add(SextaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 490, -1));

        add(diasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 730, 310));

        numeroTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        numeroTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(numeroTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 420, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        // TODO add your handling code here:
        
        if(PeriodoView.state == PeriodoView.BUSCA){
            
            String numeroFunc = this.numeroTextField.getText();
            String data = this.DatePicker.getJFormattedTextField().getText();
            
            if(numeroFunc.equals("")){
                JOptionPane.showMessageDialog(new JFrame(), "Fornecer número do funcionário");
            }
            else if(data.equals("")){
                JOptionPane.showMessageDialog(new JFrame(), "Fornecer data da semana");
            }
            else{ 
                //TODO fazer tratamento da data
                //Calendar c = Calendar.getInstance();
                //c.
                
                ArrayList<String> resultado = this.getControl().searchTarefa(numeroFunc,data.replace("/",""));
                if(resultado != null){
                    this.titleLabel.setText("Editar horas da semana");
                    this.DomingoTextField.setText(resultado.get(0));
                    this.SegundaTextField.setText(resultado.get((1)));
                    this.TercaTextField.setText(resultado.get(2));
                    this.QuartaTextField.setText(resultado.get(3));
                    this.QuintaTextField.setText(resultado.get(4));
                    this.SextaTextField.setText(resultado.get(5));
                    this.SabadoTextField.setText(resultado.get(6));
                    this.diasPanel.setVisible(true);
                
                    this.confirmarButton.setText("Confirmar");
                    PeriodoView.state = PeriodoView.EDIT;
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(), "O funcionário fornecido não está registrado para este período");
                }
            }
        }
        
        else if(PeriodoView.state == PeriodoView.EDIT){
            String numeroFunc = this.numeroTextField.getText();
            String data = this.DatePicker.getJFormattedTextField().getText();
            String hrDom = this.DomingoTextField.getText();
            String hrSeg = this.SegundaTextField.getText();
            String hrTer = this.TercaTextField.getText();
            String hrQua = this.QuartaTextField.getText();
            String hrQui= this.QuintaTextField.getText();
            String hrSex = this.SextaTextField.getText();
            String hrSab = this.SabadoTextField.getText();
            
            if(numeroFunc.equals("")){
                JOptionPane.showMessageDialog(new JFrame(), "Fornecer número do funcionário");
            }
            else if(data.equals("")){
                JOptionPane.showMessageDialog(new JFrame(), "Fornecer data da semana");
            }
            else{ 
                //TODO fazer tratamento da data
                //Calendar c = Calendar.getInstance();
                //c.
                
                ArrayList<String> resultado = this.getControl().searchTarefa(numeroFunc,data.replace("/",""));
                if(resultado != null){
                  String idCadastro = resultado.get(7);
                  if(this.getControl().updateCadastro(idCadastro,hrDom, hrSeg, hrTer, hrQua, hrQui, hrSex, hrSab)){
                      JOptionPane.showMessageDialog(new JFrame(), "Cadastro de horas atualizado com sucesso");
                  }
                  else{
                      JOptionPane.showMessageDialog(new JFrame(), "Erro na atualização do cadastro de horas");
                  }
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(), "Cadastro de horas não encontrado");
                }
                
                
            }
        }
        
        else if(PeriodoView.state == PeriodoView.CADASTRO){
            
        }
        
        
    }//GEN-LAST:event_confirmarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DomingoTextField;
    private javax.swing.JFormattedTextField QuartaTextField;
    private javax.swing.JFormattedTextField QuintaTextField;
    private javax.swing.JFormattedTextField SabadoTextField;
    private javax.swing.JFormattedTextField SegundaTextField;
    private javax.swing.JFormattedTextField SextaTextField;
    private javax.swing.JFormattedTextField TercaTextField;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JPanel diasPanel;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JFormattedTextField numeroTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public void insertDatePicker(){
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        this.DatePicker = new JDatePickerImpl(datePanel);
        this.DatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        this.add(DatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140));
        
        //datePicker.setB
        //JFrame j = new JFrame();
        //j.add(datePicker);
        //j.setVisible(true);
        //j.setBounds(0, 0, 100, 100);
    }

    public void initSearchView() {
        
        this.DatePicker.getJFormattedTextField().setText("");
        this.DatePicker.setVisible(true);
        this.titleLabel.setText("Ver Hora");
        this.numeroTextField.setText("");
        this.numeroTextField.setEditable(true);
        this.diasPanel.setVisible(false);
        PeriodoView.state = PeriodoView.BUSCA;
        
        
    }
    
    
    
     public PeriodoControl getControl() {
        return Control;
    }

    public void setControl(PeriodoControl Control) {
        this.Control = Control;
    }
}

