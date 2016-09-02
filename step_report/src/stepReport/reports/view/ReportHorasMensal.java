/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang3.StringUtils;
import stepReport.Util.FuncionarioHoras;
import stepReport.control.ReportControl;

/**
 *
 * @author Kildare
 */
public class ReportHorasMensal extends javax.swing.JPanel {

    
    private ReportControl Control;



    private static int state;
    
    private static final int BUSCA = 1;  
    
    
    /**
     * Creates new form ReportHorasMensal
     */
    public ReportHorasMensal(ReportControl Control) {
        initComponents();
        this.setControl(Control);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        nacionalidadeLabel1 = new javax.swing.JLabel();
        nacionalidadeLabel2 = new javax.swing.JLabel();
        reportScrollPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        periodo1TextField = new javax.swing.JFormattedTextField();
        periodo2TextField = new javax.swing.JFormattedTextField();
        confirmarButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setText("Relatório de Nacionalidade");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 13, -1, -1));

        nacionalidadeLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nacionalidadeLabel1.setText("Ano:");
        add(nacionalidadeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, -1));

        nacionalidadeLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nacionalidadeLabel2.setText("Mês:");
        add(nacionalidadeLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, 170, -1));

        reportTable.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
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

        add(reportScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 670, 220));

        periodo1TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        periodo1TextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(periodo1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 140, -1));

        periodo2TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        periodo2TextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(periodo2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 145, 140, -1));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, 45));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        
        if(ReportHorasMensal.state == ReportHorasMensal.BUSCA){
            String ano = this.periodo2TextField.getText();
            String mes = this.periodo1TextField.getText();
            if(!ano.equals("")&&!mes.equals("")&& Integer.parseInt(ano) > 1900 && Integer.parseInt(mes) > 0 && Integer.parseInt(mes) < 13){
                mes = StringUtils.leftPad(mes, 2, "0");
                List<FuncionarioHoras> func = this.getControl().getHorasTotaisMes("01/"+mes+"/"+ano);
                if(func.size()>0)
                this.loadTable(func);
                else
                    JOptionPane.showMessageDialog(this.getControl().getScreen(), "Nenhum funcionário encontrado");
            }
            else
                JOptionPane.showMessageDialog(this.getControl().getScreen(), "Dados Inválidos");
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel nacionalidadeLabel1;
    private javax.swing.JLabel nacionalidadeLabel2;
    private javax.swing.JFormattedTextField periodo1TextField;
    private javax.swing.JFormattedTextField periodo2TextField;
    private javax.swing.JScrollPane reportScrollPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public ReportControl getControl() {
        return Control;
    }

    public void setControl(ReportControl Control) {
        this.Control = Control;
    }
    
    
      private void loadTable(List<FuncionarioHoras> horas) {
        String[] str = {"Funcionário","Horas","Período"};
        DefaultTableModel model = new DefaultTableModel(str,horas.size());
        this.reportTable.setModel(model);
        int cont=0;
        for(FuncionarioHoras x : horas){
            this.reportTable.setValueAt(x.getIdFunc(), cont, 0);
            this.reportTable.setValueAt(x.getTotalHoras(), cont, 1);
            this.reportTable.setValueAt(x.getFormattedDataSemana(), cont, 2);
            cont++;
        }
        this.reportTable.setEnabled(false);
        this.reportScrollPane.setVisible(true);
    }

    public void loadMensalReport() {
        this.titleLabel.setText("Relatório mensal de funcionários");
        this.confirmarButton.setText("Gerar");
        this.periodo1TextField.setText("");
        this.periodo2TextField.setText("");
        this.reportScrollPane.setVisible(false);
        ReportHorasMensal.state = ReportHorasMensal.BUSCA;
    }

    public List<FuncionarioHoras> getPDFData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

