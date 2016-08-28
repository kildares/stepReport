/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import stepReport.Util.FuncionarioData;
import stepReport.control.ReportControl;

/**
 *
 * @author Queiroz Avila Contab
 */
public final class ReportUnidadeView extends javax.swing.JPanel {

    private ReportControl Control;
    private JDatePickerImpl InitDatePicker;
    private JDatePickerImpl FimDatePicker;

    private static int state;
    
    private static final int BUSCA = 1;  
    
    /**
     * Creates new form ReportBSPView
     * @param Control
     */
    public ReportUnidadeView(ReportControl Control) {
        initComponents();
        this.setControl(Control);
        this.insertDatePicker();
        this.buttonGroup1.add(this.anualRadioButton);
        this.buttonGroup1.add(this.mensalRadionButton);
        this.buttonGroup1.add(this.personRadionButton);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        taskLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        taskTextField = new javax.swing.JFormattedTextField();
        periodoLabel = new javax.swing.JLabel();
        anualRadioButton = new javax.swing.JRadioButton();
        mensalRadionButton = new javax.swing.JRadioButton();
        personRadionButton = new javax.swing.JRadioButton();
        periodoPanel = new javax.swing.JPanel();
        periodo2Label = new javax.swing.JLabel();
        periodo2TextField = new javax.swing.JFormattedTextField();
        periodo1Label = new javax.swing.JLabel();
        periodo1TextField = new javax.swing.JFormattedTextField();
        reportScrollPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        confirmarButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taskLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        taskLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        taskLabel.setText("Task Number:");
        add(taskLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, 170, -1));

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setText("Relatório por Unidade");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 13, -1, -1));

        taskTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(taskTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 390, -1));

        periodoLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        periodoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        periodoLabel.setText("Período:");
        add(periodoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, -1));

        anualRadioButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        anualRadioButton.setText("Anual");
        anualRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anualRadioButtonActionPerformed(evt);
            }
        });
        add(anualRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 155, -1, -1));

        mensalRadionButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        mensalRadionButton.setText("Mensal");
        mensalRadionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensalRadionButtonActionPerformed(evt);
            }
        });
        add(mensalRadionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 155, -1, -1));

        personRadionButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        personRadionButton.setText("Personalizado");
        personRadionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personRadionButtonActionPerformed(evt);
            }
        });
        add(personRadionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 155, -1, -1));

        periodoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        periodo2Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        periodo2Label.setText("Ano:");
        periodoPanel.add(periodo2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        periodo2TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        periodo2TextField.setText("34234");
        periodo2TextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        periodoPanel.add(periodo2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 55, 140, -1));

        periodo1Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        periodo1Label.setText("Ano:");
        periodoPanel.add(periodo1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        periodo1TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        periodo1TextField.setText("34234");
        periodo1TextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        periodoPanel.add(periodo1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 15, 140, -1));

        add(periodoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 520, 110));

        reportTable.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Funcionário", "Total de Horas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        reportScrollPane.setViewportView(reportTable);

        add(reportScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 670, 110));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, 45));
    }// </editor-fold>//GEN-END:initComponents

    private void anualRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anualRadioButtonActionPerformed
        // TODO add your handling code here:
        this.InitDatePicker.setVisible(false);
        this.FimDatePicker.setVisible(false);
        this.periodo1Label.setText("Ano:");
        this.periodo1TextField.setText("");
        this.periodo2Label.setVisible(false);
        this.periodo2TextField.setVisible(false);
        this.periodo1Label.setVisible(true);
        this.periodo1TextField.setVisible(true);
        this.periodoPanel.setVisible(true);
    }//GEN-LAST:event_anualRadioButtonActionPerformed

    private void mensalRadionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensalRadionButtonActionPerformed
        // TODO add your handling code here:
        this.periodo1Label.setText("Mês:");
        this.periodo1TextField.setText("");
        this.periodo2Label.setText("Ano:");
        this.periodo2TextField.setText("");
        this.periodo1Label.setVisible(true);
        this.periodo1TextField.setVisible(true);
        this.periodo2Label.setVisible(true);
        this.periodo2TextField.setVisible(true);
        this.periodoPanel.setVisible(true);
        this.InitDatePicker.setVisible(false);
        this.FimDatePicker.setVisible(false);
    }//GEN-LAST:event_mensalRadionButtonActionPerformed

    private void personRadionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personRadionButtonActionPerformed
        // TODO add your handling code here:
        this.periodo1TextField.setVisible(false);
        this.periodo2TextField.setVisible(false);
        this.periodo1Label.setText("Início:");
        this.periodo2Label.setText("Fim:");
        this.InitDatePicker.getJFormattedTextField().setText("");
        this.InitDatePicker.setVisible(true);
        this.FimDatePicker.getJFormattedTextField().setText("");
        this.FimDatePicker.setVisible(true);
        this.periodo1Label.setVisible(true);
        this.periodoPanel.setVisible(true);
    }//GEN-LAST:event_personRadionButtonActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        // TODO add your handling code here:
        if(ReportUnidadeView.state == ReportUnidadeView.BUSCA){
            if(this.anualRadioButton.isSelected())
            {
                String ano = this.periodo1TextField.getText();
                if(!ano.equals("") && Integer.parseInt(ano) > 1900){
                    HashMap<String,String> horas = this.getControl().getHorasNation(this.periodo1TextField.getText(), ano);
                    this.loadTable(horas);
                }
            }
            else if(this.mensalRadionButton.isSelected())
            {

            }
            else if(this.personRadionButton.isSelected())
            {

            }

        }

    }//GEN-LAST:event_confirmarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton anualRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JRadioButton mensalRadionButton;
    private javax.swing.JLabel periodo1Label;
    private javax.swing.JFormattedTextField periodo1TextField;
    private javax.swing.JLabel periodo2Label;
    private javax.swing.JFormattedTextField periodo2TextField;
    private javax.swing.JLabel periodoLabel;
    private javax.swing.JPanel periodoPanel;
    private javax.swing.JRadioButton personRadionButton;
    private javax.swing.JScrollPane reportScrollPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JLabel taskLabel;
    private javax.swing.JFormattedTextField taskTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    
     public void insertDatePicker(){
        
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        this.InitDatePicker = new JDatePickerImpl(datePanel);
        this.InitDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        this.periodoPanel.add(InitDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 22));
        
        UtilDateModel model2 = new UtilDateModel();
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2);
        this.FimDatePicker = new JDatePickerImpl(datePanel2);
        this.FimDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        this.periodoPanel.add(FimDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 62));   
    }
    

    public ReportControl getControl() {
        return Control;
    }

    public void setControl(ReportControl Control) {
        this.Control = Control;
    }    

    private void loadTable(HashMap<String, String> horas) {
        String[] str = {"Funcionário","Horas"};
        DefaultTableModel model = new DefaultTableModel(str,2);
        this.reportTable.setModel(model);
        int cont=0;
        for(String func : horas.keySet()){
            this.reportTable.setValueAt(func, cont, 0);
            this.reportTable.setValueAt(horas.get(func), cont, 1);
            cont++;
        }
        this.reportScrollPane.setVisible(true);
    }

    public void loadTaskReport() {
        this.titleLabel.setText("Relatório de Unidade");
        this.confirmarButton.setText("Gerar");
        this.InitDatePicker.getJFormattedTextField().setText("");
        this.InitDatePicker.getJFormattedTextField().setEditable(true);
        
        this.FimDatePicker.getJFormattedTextField().setText("");
        this.FimDatePicker.getJFormattedTextField().setEditable(true);
        
        this.InitDatePicker.setVisible(false);
        this.FimDatePicker.setVisible(false);
        this.periodoPanel.setVisible(false);
        this.reportScrollPane.setVisible(false);
        ReportUnidadeView.state = ReportUnidadeView.BUSCA;
    }

    public List<FuncionarioData> getPDFData() {
        
        List<FuncionarioData> func = new ArrayList<FuncionarioData>();
        
        int numRow = this.reportTable.getRowCount();
        for(int i=0;i<numRow;i++){
            func.add(new FuncionarioData((String)this.reportTable.getValueAt(i, 0),(String)this.reportTable.getValueAt(i, 1),(String)this.reportTable.getValueAt(i, 2)));
        }
        return func;
    }
}
