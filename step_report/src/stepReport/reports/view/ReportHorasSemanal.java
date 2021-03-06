/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
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
 * @author Kildare
 */
public final class ReportHorasSemanal extends javax.swing.JPanel {

    

    
    private ReportControl Control;
    private JDatePickerImpl InitDatePicker;
    private JDatePickerImpl FimDatePicker;


    private static int state;
    
    private static final int BUSCA = 1;  
    private static List<FuncionarioHoras> horasFuncionarios;
    
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
        diasScrollPane = new javax.swing.JScrollPane();
        diasTable = new javax.swing.JTable();
        funcionarioLabel = new javax.swing.JLabel();

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

        add(reportScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 670, 130));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, 45));

        totalHorasLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        totalHorasLabel.setText("Total de Horas:");
        add(totalHorasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 490, 30));

        diasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horas", "Task", "NAM", "BSP", "Unidade"
            }
        ));
        diasScrollPane.setViewportView(diasTable);

        add(diasScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 490, 150));

        funcionarioLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        funcionarioLabel.setText("Funcionário:");
        add(funcionarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 490, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        
        if(ReportHorasSemanal.state == ReportHorasSemanal.BUSCA){
            if(this.validDate())              
            {
                String dataIni = this.InitDatePicker.getJFormattedTextField().getText();
                String dataFim = this.FimDatePicker.getJFormattedTextField().getText();
                List<FuncionarioHoras> func = this.getControl().getHorasTotaisSemanal(dataIni,dataFim);
                ReportHorasSemanal.horasFuncionarios = func;
                if(func.size()>0){
                    this.loadTable();
                    this.getControl().isPrintable(true);
                }
                else
                    JOptionPane.showMessageDialog(new JFrame(), "Nenhum funcionário encontrado");
            }
            else
                JOptionPane.showMessageDialog(this.getControl().getScreen(), "Datas fornecidas são inválidas");
            
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void reportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseClicked
        // TODO add your handling code here:
        String nome = (String) this.reportTable.getValueAt(this.reportTable.getSelectedRow(), 1);
        String profissao = (String) this.reportTable.getValueAt(this.reportTable.getSelectedRow(), 2);
        
        int cont=0;
        for(int i=0;i<this.reportTable.getRowCount();i++){
            if(this.reportTable.getValueAt(i, 1).equals(nome) && this.reportTable.getValueAt(i, 2).equals(profissao)){
                cont+= Integer.parseInt((String) this.reportTable.getValueAt(i, 4));
            }
        }
        
         
        this.funcionarioLabel.setText("Funcionário: "+ nome +"");
        this.funcionarioLabel.setVisible(true);
        this.totalHorasLabel.setText("Total de Horas: "+Integer.toString(cont));
        this.totalHorasLabel.setVisible(true);
        
        String titulo[] = {"Horas","Task","NAM","BSP","Unidade"};
        DefaultTableModel model = new DefaultTableModel(titulo,7);
        this.diasTable.setModel(model);
        cont=0;
        
        for(FuncionarioHoras x : ReportHorasSemanal.horasFuncionarios)
        {
            String dataX = FuncionarioHorasSemana.getFormattedDataSemana(x.getDataSemana());
            String dataTable = (String) this.reportTable.getValueAt(this.reportTable.getSelectedRow(), 3);
            
            if(x.getIdFunc().equals(this.reportTable.getValueAt(this.reportTable.getSelectedRow(), 0))
             && dataX.equals(dataTable))
            {
                if(x.getDiaSemana().equals("seg")){
                    cont=0;
                    this.diasTable.setValueAt("Segunda",cont, 0);
                }
                if(x.getDiaSemana().equals("ter")){
                    cont=1;
                    this.diasTable.setValueAt("Terça",cont, 0);
                }
                if(x.getDiaSemana().equals("qua")){
                    cont=2;
                    this.diasTable.setValueAt("Quarta",cont, 0);
                }
                if(x.getDiaSemana().equals("qui")){
                    cont=3;
                    this.diasTable.setValueAt("Quinta",cont, 0);
                }
                if(x.getDiaSemana().equals("sex")){
                    cont=4;
                    this.diasTable.setValueAt("Sexta",cont, 0);
                }
                if(x.getDiaSemana().equals("sab")){
                    cont=5;
                    this.diasTable.setValueAt("Sabado",cont, 0);
                }
                if(x.getDiaSemana().equals("dom")){
                    cont=6;
                    this.diasTable.setValueAt("Domingo",cont, 0);
                }
                
                this.diasTable.setValueAt(x.getTaskNumber(), cont, 1);
                this.diasTable.setValueAt(x.getNam(), cont, 2);
                this.diasTable.setValueAt(x.getBsp(), cont, 3);
                this.diasTable.setValueAt(x.getUnidade(), cont, 4);
            }        
        }
        
        this.diasScrollPane.setVisible(true);
        this.diasTable.setEnabled(false);
        
        this.reportTable.setEnabled(true);
        this.reportScrollPane.setVisible(true);
        
        
        
    }//GEN-LAST:event_reportTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton;
    private javax.swing.JScrollPane diasScrollPane;
    private javax.swing.JTable diasTable;
    private javax.swing.JLabel funcionarioLabel;
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
        
        this.InitDatePicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        this.InitDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        
        
        UtilDateModel model2 = new UtilDateModel();
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2);
        this.FimDatePicker = new JDatePickerImpl(datePanel2,new DateLabelFormatter());
        this.FimDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        
        this.add(this.InitDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105));
        this.add(this.FimDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150));
    }
    
    
    private void loadTable() 
    {      
        List<FuncionarioHorasSemana> horasSemana = FuncionarioHorasSemana.parseFuncionarioHorasSemana(ReportHorasSemanal.horasFuncionarios);
        horasSemana = this.getControl().setHoras(horasSemana);
        String[] str = {"Numero","Nome","Profissão","Semana","Horas"};
        DefaultTableModel model = new DefaultTableModel(str,horasSemana.size());
        this.reportTable.setModel(model);
        int cont=0;
        for(FuncionarioHorasSemana x : horasSemana){
            this.reportTable.setValueAt(x.getIdFunc(), cont, 0);
            this.reportTable.setValueAt(x.getNome(), cont, 1);
            this.reportTable.setValueAt(x.getProfissao(), cont, 2);
            this.reportTable.setValueAt(FuncionarioHorasSemana.getFormattedDataSemana(x.getDataSemana()), cont, 3);
            this.reportTable.setValueAt(x.getNumHoras(), cont, 4);
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
        this.funcionarioLabel.setVisible(false);
        
        this.diasScrollPane.setVisible(false);
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

    public String[][] getPDFData() 
    {
        int rows = this.reportTable.getRowCount();
        int column = this.reportTable.getColumnCount();
        Map<String,List<String>> funcs = new HashMap<String,List<String>>();
        
        //Separa a tabela em um hash map, onde a chave e composta de nome e profissao
        //o conteudo e uma lista, onde cada indice e composta da semana e da hora, sempre separados por ';'
        List<String> semanas = new ArrayList<String>();
        for(int i=0;i<rows;i++)
        {
            String name = null;
            String prof = null;
            name = (String) this.reportTable.getValueAt(i,1);
            prof = (String) this.reportTable.getValueAt(i,2);
            List<String> data;
            if(!funcs.containsKey(name+";"+prof))
                data = new ArrayList<String>();
            else
                data = funcs.get(name+";"+prof);
            String week = (String) this.reportTable.getValueAt(i,3);
            week = week ==null? "" : week;
            String hours = (String) this.reportTable.getValueAt(i,4);
            hours = hours ==null? "" : hours;
            
            if(!week.equals("")&&!semanas.contains(week))
                semanas.add(week);
            
            data.add(week + ";" + hours);
            funcs.put(name+";"+prof, data);
        }
        
        //Carrega o numero de linhas e colunas a partir da lista obtida anteriormente
        rows =funcs.keySet().size(); 
        column = semanas.size()+3;
        String[][] table = new String[rows+1][column];
        //carrega os campos de cabecalho
        table[0][0] = "Nome";
        table[0][1] = "Profissão";
        table[0][semanas.size()+2] = "Total";
        for(int i=2;i<semanas.size()+2;i++)
            table[0][i] = semanas.get(i-2).split(";")[0];
        
        //Carrega o conteudo das tabelas
        int i=1;
        for(String key : funcs.keySet())
        {
            String[] str =key.split(";"); 
            table[i][0] = str[0];
            table[i][1] = str[1];
            for(String semanaHora : funcs.get(key))
            {
                String semana = semanaHora.split(";")[0];
                String hora = semanaHora.split(";")[1];
                for(int j=0;j<column;j++)
                {
                    if(table[0][j].equals(semana))
                        table[i][j] = hora;
                    else if(table[i][j]==null&& j!=0 && j!=1)
                        table[i][j]= "0";
                }
            }
            i++;
        }
        
        //Define o valor total
        for(i=1;i<rows;i++)
        {
            Double cont=0.0;
            for(int j=2;j<column-1;j++){
                cont+= Double.parseDouble(table[i][j]);
            }
            table[i][column-1] = Double.toString(cont);
        }
        
        return  table;
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

