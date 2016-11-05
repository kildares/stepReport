/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.view;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import stepReport.Util.DateLabelFormatter;
import stepReport.Util.FuncionarioHoras;
import stepReport.Util.FuncionarioHorasSemana;
import stepReport.control.ReportControl;

/**
 *
 * @author Queiroz Avila Contab
 */
public final class ReportBSPView extends javax.swing.JPanel {

   

    private ReportControl Control;
    private JDatePickerImpl InitDatePicker;
    private JDatePickerImpl FimDatePicker;

    private static int state;
     private static List<FuncionarioHoras> horasFuncionarios;
    private static final int BUSCA = 1;  
    
    /**
     * Creates new form ReportBSPView
     * @param Control
     */
    public ReportBSPView(ReportControl Control) {
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

        bspLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        BSPTextField = new javax.swing.JFormattedTextField();
        reportScrollPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        confirmarButton = new javax.swing.JButton();
        semana1Label = new javax.swing.JLabel();
        semana2Label = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bspLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bspLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bspLabel.setText("BSP:");
        add(bspLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, 170, -1));

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setText("Relatório de BSP");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 13, -1, -1));

        BSPTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(BSPTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 390, -1));

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

        add(reportScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 670, 110));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, 45));

        semana1Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semana1Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semana1Label.setText("Semana Inicial:");
        add(semana1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, -1));

        semana2Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semana2Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semana2Label.setText("Semana Final:");
        add(semana2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
         if(ReportBSPView.state == ReportBSPView.BUSCA){
                String bsp = this.BSPTextField.getText();
                if(this.validDate() && !bsp.equals(""))              
                {
                    
                    String dataIni = this.InitDatePicker.getJFormattedTextField().getText();
                    String dataFim = this.FimDatePicker.getJFormattedTextField().getText();
                    List<FuncionarioHoras> func = this.getControl().getHorasBSPCustom(bsp,dataIni,dataFim);
                    ReportBSPView.horasFuncionarios = func;
                    if(func.size()>0)
                    {
                        this.loadTable();
                        this.getControl().isPrintable(true);
                    }
                    else
                        JOptionPane.showMessageDialog(this.getControl().getScreen(), "Nenhum funcionário encontrado");
                }
                else
                    JOptionPane.showMessageDialog(this.getControl().getScreen(), "Datas fornecidas são inválidas");
                
        }

    }//GEN-LAST:event_confirmarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField BSPTextField;
    private javax.swing.JLabel bspLabel;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JScrollPane reportScrollPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JLabel semana1Label;
    private javax.swing.JLabel semana2Label;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    
     public void insertDatePicker(){
        
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        this.InitDatePicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        this.InitDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        
        
        UtilDateModel model2 = new UtilDateModel();
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2);
        this.FimDatePicker = new JDatePickerImpl(datePanel2,new DateLabelFormatter());
        this.FimDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        
        this.add(InitDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150));
        this.add(FimDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190));
    }
    

    public ReportControl getControl() {
        return Control;
    }

    public void setControl(ReportControl Control) {
        this.Control = Control;
    }    

     private void loadTable() 
     {
        
        List<FuncionarioHorasSemana> horasSemana = FuncionarioHorasSemana.parseFuncionarioHorasSemana(ReportBSPView.horasFuncionarios);
        horasSemana = this.getControl().setHoras(horasSemana);
        Vector colunas = FuncionarioHorasSemana.getSemanas(horasSemana);
        
        colunas.add(0, "Profissão");
        colunas.add(0,"Nome");
        colunas.add(0,"Número");
        colunas.add("Total");
        
        DefaultTableModel model = new DefaultTableModel(colunas,horasSemana.size());
        this.reportTable.setModel(model);
        int nextRow =0;
        for(FuncionarioHorasSemana x : horasSemana){
            boolean isFound=false;
            int num=0;
            int rowCount =this.reportTable.getRowCount(); 
            for(int i=0;i<rowCount;i++)
            {
                String valueAt =(String) this.reportTable.getValueAt(i, 0);
                String idFunc = x.getIdFunc();
                String valueAt2 = (String) this.reportTable.getValueAt(i, 1);
                String nome = x.getNome();
                if(!(valueAt==null&&valueAt2==null)&&valueAt.equals(idFunc) && valueAt2.equals(nome)){
                    num=i;
                    isFound=true;
                }
            }
            if(!isFound)
            {
                this.reportTable.setValueAt(x.getIdFunc(), nextRow, 0);
                this.reportTable.setValueAt(x.getNome(), nextRow, 1);
                this.reportTable.setValueAt(x.getProfissao(), nextRow, 2);
                String fmtDataSemana = FuncionarioHorasSemana.getFormattedDataSemana(x.getDataSemana());
                int indexOf = colunas.indexOf(fmtDataSemana);
                this.reportTable.setValueAt(x.getNumHoras(), nextRow, indexOf);
                nextRow++;
            }
            else
                this.reportTable.setValueAt(x.getNumHoras(),num,colunas.indexOf(FuncionarioHorasSemana.getFormattedDataSemana(x.getDataSemana())));
        }
        this.reportTable.setEnabled(true);
        this.reportScrollPane.setVisible(true);
        
        for(int i=0;i<this.reportTable.getRowCount();i++)
        {
            int horas=0;
            for(int j=3;j<colunas.size()-1;j++){
                if(this.reportTable.getValueAt(i, j)!=null)
                    horas+= Integer.parseInt((String) this.reportTable.getValueAt(i, j));
            }
            this.reportTable.setValueAt(Integer.toString(horas), i, colunas.size()-1);
        }
        
        String teste[][]=this.getPDFData();
        int cont=0;
    }

  

    public void loadBSPReport() {
        
        this.titleLabel.setText("Relatório de BSP");
        this.confirmarButton.setText("Gerar");
        this.InitDatePicker.getJFormattedTextField().setText("");
        this.InitDatePicker.getJFormattedTextField().setEditable(true);
        
        this.FimDatePicker.getJFormattedTextField().setText("");
        this.FimDatePicker.getJFormattedTextField().setEditable(true);
        
        this.InitDatePicker.setVisible(true);
        this.FimDatePicker.setVisible(true);
        this.reportScrollPane.setVisible(false);
        ReportBSPView.state = ReportBSPView.BUSCA;
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

    public String[][] getPDFData() 
    {
        int rows = this.reportTable.getRowCount()+1;
        int column = this.reportTable.getColumnCount();
        String[][] table= new String[rows][column-1];
        for(int i=1;i<column;i++)
            table[0][i-1] = this.reportTable.getColumnName(i);
        
        for(int i=1;i<rows;i++){
            for(int j=1;j<column;j++){
                String val = (String) this.reportTable.getValueAt(i-1, j);
                table[i][j-1] = (val==null) ? "" : val;
            }
        }
        return table;
    }

    public int getNumWeeks() {
        Calendar c1 = Calendar.getInstance();
        String origem = this.InitDatePicker.getJFormattedTextField().getText();
        c1.set(Integer.parseInt(origem.substring(6, 10)), Integer.parseInt(origem.substring(3, 5)), Integer.parseInt(origem.substring(0, 2)));
        
        Calendar c2 = Calendar.getInstance();
        String destino = this.FimDatePicker.getJFormattedTextField().getText();
        c2.set(Integer.parseInt(destino.substring(6, 10)), Integer.parseInt(destino.substring(3, 5)), Integer.parseInt(destino.substring(0, 2)));
        
        c1.set(Calendar.MILLISECOND, 0);
        c1.set(Calendar.SECOND, 0);
        c1.set(Calendar.MINUTE, 0);
        c1.set(Calendar.HOUR_OF_DAY, 0);
        c2.set(Calendar.MILLISECOND, 0);
        c2.set(Calendar.SECOND, 0);
        c2.set(Calendar.MINUTE, 0);
        c2.set(Calendar.HOUR_OF_DAY, 0);
        int nbJours = 0;
        for (Calendar c = c1 ; c.before(c2) ; c.add(Calendar.DATE, +1))
        {
            nbJours++;
        }
        for (Calendar c = c1 ; c.after(c2) ; c.add(Calendar.DATE, -1))
        {
            nbJours--;
        }
        nbJours = nbJours/7;
       return nbJours;
    }
    
}
