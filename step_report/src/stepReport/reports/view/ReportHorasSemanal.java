/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.view;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import stepReport.Util.FuncionarioHoras;
import stepReport.Util.FuncionarioHorasSemana;
import stepReport.control.ReportControl;

/**
 *
 * @author Kildare
 */
public final class ReportHorasSemanal extends javax.swing.JPanel {

    
    private ReportControl Control;
    private JDatePickerImpl InitDatePicker;
    private JDatePickerImpl FimDatePicker;


    private static int state;
    
    private static final int BUSCA = 1;  
    
    
    /**
     * Creates new form ReportHorasMensal
     */
    public ReportHorasSemanal(ReportControl Control) {
        initComponents();
        this.setControl(Control);
        
        this.insertDatePicker();
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
        semana2Label = new javax.swing.JLabel();
        semana1Label = new javax.swing.JLabel();
        reportScrollPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        confirmarButton = new javax.swing.JButton();
        totalHorasLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setText("Relatório de Período");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 13, -1, -1));

        semana2Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semana2Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semana2Label.setText("Semana Final:");
        add(semana2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, -1));

        semana1Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semana1Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semana1Label.setText("Semana Inicial:");
        add(semana1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, 170, -1));

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
        reportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportTableMouseClicked(evt);
            }
        });
        reportScrollPane.setViewportView(reportTable);

        add(reportScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 670, 220));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, 45));

        totalHorasLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        totalHorasLabel.setText("Funcionário:");
        add(totalHorasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 260, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        
        if(ReportHorasSemanal.state == ReportHorasSemanal.BUSCA){
            if(this.validDate())              
            {
                String dataIni = this.InitDatePicker.getJFormattedTextField().getText();
                String dataFim = this.FimDatePicker.getJFormattedTextField().getText();
                List<FuncionarioHoras> func = this.getControl().getHorasTotaisSemanal(dataIni,dataFim);
                if(func.size()>0)
                    this.loadTable(func);
                else
                    JOptionPane.showMessageDialog(new JFrame(), "Nenhum funcionário encontrado");
            }
            else
                JOptionPane.showMessageDialog(this.getControl().getScreen(), "Datas fornecidas são inválidas");
            
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void reportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseClicked
        // TODO add your handling code here:
        String nome = (String) this.reportTable.getValueAt(this.reportTable.getSelectedRow(), 0);
        String profissao = (String) this.reportTable.getValueAt(this.reportTable.getSelectedRow(), 1);
        
        int cont=0;
        for(int i=0;i<this.reportTable.getRowCount();i++){
            if(this.reportTable.getValueAt(i, 0).equals(nome) && this.reportTable.getValueAt(i, 1).equals(profissao)){
                cont+= Integer.parseInt((String) this.reportTable.getValueAt(i, 3));
            }
        }
        
        String text = "<html>Funcionário: "+ nome +"<br/>Total de horas: " + Integer.toString(cont)+"</html>";
        this.totalHorasLabel.setText(text);
        this.totalHorasLabel.setVisible(true);
    }//GEN-LAST:event_reportTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton;
    private javax.swing.JScrollPane reportScrollPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JLabel semana1Label;
    private javax.swing.JLabel semana2Label;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel totalHorasLabel;
    // End of variables declaration//GEN-END:variables

    public ReportControl getControl() {
        return Control;
    }

    public void setControl(ReportControl Control) {
        this.Control = Control;
    }
    
       public void insertDatePicker(){
        
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        this.InitDatePicker = new JDatePickerImpl(datePanel);
        this.InitDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        
        
        UtilDateModel model2 = new UtilDateModel();
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2);
        this.FimDatePicker = new JDatePickerImpl(datePanel2);
        this.FimDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        
        this.add(this.InitDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105));
        this.add(this.FimDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150));
    }
    
    
    private void loadTable(List<FuncionarioHoras> horas) {
          
        List<FuncionarioHorasSemana> horasSemana = FuncionarioHorasSemana.parseFuncionarioHorasSemana(horas);
        horasSemana = this.getControl().setHoras(horasSemana);
        String[] str = {"Funcionário","Profissão","Semana","Horas"};
        DefaultTableModel model = new DefaultTableModel(str,horasSemana.size());
        this.reportTable.setModel(model);
        int cont=0;
        for(FuncionarioHorasSemana x : horasSemana){
            this.reportTable.setValueAt(x.getNome(), cont, 0);
            this.reportTable.setValueAt(x.getProfissao(), cont, 1);
            this.reportTable.setValueAt(FuncionarioHorasSemana.getFormattedDataSemana(x.getDataSemana()), cont, 2);
            this.reportTable.setValueAt(x.getNumHoras(), cont, 3);
            cont++;
        }
        this.reportTable.setEnabled(true);
        this.reportScrollPane.setVisible(true);
    }

    public void loadMensalReport() {
        this.titleLabel.setText("Relatório semanal de funcionário");
        this.confirmarButton.setText("Gerar");
        this.reportScrollPane.setVisible(false);
        
        this.InitDatePicker.getJFormattedTextField().setText("");
        this.InitDatePicker.getJFormattedTextField().setEditable(true);
        
        this.FimDatePicker.getJFormattedTextField().setText("");
        this.FimDatePicker.getJFormattedTextField().setEditable(true);
        this.totalHorasLabel.setText("");
        this.totalHorasLabel.setVisible(false);
        
        ReportHorasSemanal.state = ReportHorasSemanal.BUSCA;
    }
    
    private boolean validDate() {
        String ini = this.InitDatePicker.getJFormattedTextField().getText();
        String fim = this.FimDatePicker.getJFormattedTextField().getText();
        if(ini.equals("")||fim.equals(""))
            return false;
        
        String fmtIni = ini.substring(6, 10) + ini.substring(3, 5) + ini.substring(0, 2);
        String fmtFim = fim.substring(6, 10) + fim.substring(3, 5) + fim.substring(0, 2);
        
        if(Integer.parseInt(fmtFim) < Integer.parseInt(fmtIni))
            return false;
        
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(ini.substring(6, 10)), Integer.parseInt(ini.substring(3, 5))-1, Integer.parseInt(ini.substring(0, 2)));
        if(c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
            return false;
        c.set(Integer.parseInt(fim.substring(6, 10)), Integer.parseInt(fim.substring(3, 5))-1, Integer.parseInt(fim.substring(0, 2)));
        if(c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
            return false;

        return true;
        
    }

    public Map<String,List<FuncionarioHorasSemana>> getPDFData() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

