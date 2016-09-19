/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
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
public final class ReportNacionalidadeView extends javax.swing.JPanel {

    private ReportControl Control;
    private JDatePickerImpl InitDatePicker;
    private JDatePickerImpl FimDatePicker;
    
    private static int state;
    
    private static final int BUSCA = 1;        
    private static List<FuncionarioHoras> horasFuncionarios;
    
    /**
     * Creates new form reportHora
     * @param control
     */
    public ReportNacionalidadeView(ReportControl control) {
        initComponents();
        this.insertDatePicker();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        nacionalidadeCombo = new javax.swing.JComboBox<>();
        titleLabel = new javax.swing.JLabel();
        confirmarButton = new javax.swing.JButton();
        nacionalidadeLabel1 = new javax.swing.JLabel();
        reportScrollPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        semana1Label = new javax.swing.JLabel();
        semana2Label = new javax.swing.JLabel();
        totalHorasLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nacionalidadeCombo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afeganistão", "ÁfricadoSul", "Albânia", "Alemanha", "Andorra", "Angola", "Anguilla", "AntilhasHolandesas", "Antárctida", "AntíguaeBarbuda", "Argentina", "Argélia", "Armênia", "Aruba", "ArábiaSaudita", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Belize", "Benim", "Bermudas", "Bielorrússia", "Bolívia", "Botswana", "Brasil", "Brunei", "Bulgária", "BurkinaFaso", "Burundi", "Butão", "Bélgica", "BósniaeHerzegovina", "CaboVerde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Colômbia", "Comores", "CoreiadoNorte", "CoreiadoSul", "CostadoMarfim", "CostaRica", "Croácia", "Cuba", "Dinamarca", "Djibouti", "Dominica", "Egito", "ElSalvador", "EmiradosÁrabesUnidos", "Equador", "Eritreia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "EstadosFederadosdaMicronésia", "EstadosUnidos", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gana", "Geórgia", "Gibraltar", "Granada", "Gronelândia", "Grécia", "Guadalupe", "Guam", "Guatemala", "Guernesei", "Guiana", "GuianaFrancesa", "Guiné", "GuinéEquatorial", "Guiné-Bissau", "Gâmbia", "Haiti", "Honduras", "HongKong", "Hungria", "IlhaBouvet", "IlhadeMan", "IlhadoNatal", "IlhaHeardeIlhasMcDonald", "IlhaNorfolk", "IlhasCayman", "IlhasCocos(Keeling)", "IlhasCook", "IlhasFeroé", "IlhasGeórgiadoSuleSandwichdoSul", "IlhasMalvinas", "IlhasMarshall", "IlhasMenoresDistantesdosEstadosUnidos", "IlhasSalomão", "IlhasVirgensAmericanas", "IlhasVirgensBritânicas", "IlhasÅland", "Indonésia", "Inglaterra", "Índia", "Iraque", "IrlandadoNorte", "Irlanda", "Irã", "Islândia", "Israel", "Itália", "Iêmen", "Jamaica", "Japão", "Jersey", "Jordânia", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letônia", "Libéria", "Liechtenstein", "Lituânia", "Luxemburgo", "Líbano", "Líbia", "Macau", "Macedônia", "Madagáscar", "Malawi", "Maldivas", "Mali", "Malta", "Malásia", "MarianasSetentrionais", "Marrocos", "Martinica", "Mauritânia", "Maurícia", "Mayotte", "Moldávia", "Mongólia", "Montenegro", "Montserrat", "Moçambique", "Myanmar", "México", "Mônaco", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Nigéria", "Niue", "Noruega", "NovaCaledônia", "NovaZelândia", "Níger", "Omã", "Palau", "Palestina", "Panamá", "Papua-NovaGuiné", "Paquistão", "Paraguai", "PaísdeGales", "PaísesBaixos", "Peru", "Pitcairn", "PolinésiaFrancesa", "Polônia", "PortoRico", "Portugal", "Quirguistão", "Quênia", "ReinoUnido", "RepúblicaCentro-Africana", "RepúblicaCheca", "RepúblicaDemocráticadoCongo", "RepúblicadoCongo", "RepúblicaDominicana", "Reunião", "Romênia", "Ruanda", "Rússia", "SaaraOcidental", "SaintMartin", "Saint-Barthélemy", "Saint-PierreeMiquelon", "SamoaAmericana", "Samoa", "SantaHelena,AscensãoeTristãodaCunha", "SantaLúcia", "Senegal", "SerraLeoa", "Seychelles", "Singapura", "Somália", "SriLanka", "Suazilândia", "Sudão", "Suriname", "Suécia", "Suíça", "SvalbardeJanMayen", "SãoCristóvãoeNevis", "SãoMarino", "SãoToméePríncipe", "SãoVicenteeGranadinas", "Sérvia", "Síria", "Tadjiquistão", "Tailândia", "Taiwan", "Tanzânia", "TerrasAustraiseAntárticasFrancesas", "TerritórioBritânicodoOceanoÍndico", "Timor-Leste", "Togo", "Tonga", "Toquelau", "TrinidadeTobago", "Tunísia", "TurcaseCaicos", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "Uruguai", "Uzbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "WalliseFutuna", "Zimbabwe", "Zâmbia" }));
        add(nacionalidadeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 393, -1));

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setText("Relatório de Nacionalidade");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 13, -1, -1));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, 45));

        nacionalidadeLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nacionalidadeLabel1.setText("Nacionalidade:");
        add(nacionalidadeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, 170, -1));

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

        add(reportScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 670, 110));

        semana1Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semana1Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semana1Label.setText("Semana Inicial:");
        add(semana1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, -1));

        semana2Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semana2Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semana2Label.setText("Semana Final:");
        add(semana2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 170, -1));

        totalHorasLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        totalHorasLabel.setText("Funcionário:");
        add(totalHorasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 260, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
       
        if(ReportNacionalidadeView.state == ReportNacionalidadeView.BUSCA)
        {
        
            if(this.validDate())              
            {
                String dataIni = this.InitDatePicker.getJFormattedTextField().getText();
                String dataFim = this.FimDatePicker.getJFormattedTextField().getText();
                List<FuncionarioHoras> func = this.getControl().getHorasNation((String)this.nacionalidadeCombo.getSelectedItem(),dataIni,dataFim);
                ReportNacionalidadeView.horasFuncionarios = func;
                if(func.size()>0)
                    this.loadTable();
                else
                    JOptionPane.showMessageDialog(this.getControl().getScreen(), "Nenhum funcionário encontrado");
            }
            else{
                JOptionPane.showMessageDialog(this.getControl().getScreen(), "Data inválida");
            }
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JComboBox<String> nacionalidadeCombo;
    private javax.swing.JLabel nacionalidadeLabel1;
    private javax.swing.JScrollPane reportScrollPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JLabel semana1Label;
    private javax.swing.JLabel semana2Label;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel totalHorasLabel;
    // End of variables declaration//GEN-END:variables
    
    public void insertDatePicker(){
        
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        this.InitDatePicker = new JDatePickerImpl(datePanel);
        this.InitDatePicker.getJFormattedTextField().setFont(new java.awt.Font("Verdana",0,18));
        
        UtilDateModel model2 = new UtilDateModel();
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2);
        this.FimDatePicker = new JDatePickerImpl(datePanel2);
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

    public void loadNationReport() {
        this.titleLabel.setText("Relatório de Nacionalidade");
        this.confirmarButton.setText("CONFIRMAR");
        this.InitDatePicker.getJFormattedTextField().setText("");
        this.InitDatePicker.getJFormattedTextField().setEditable(true);
        
        this.FimDatePicker.getJFormattedTextField().setText("");
        this.FimDatePicker.getJFormattedTextField().setEditable(true);
        
        this.InitDatePicker.setVisible(true);
        this.FimDatePicker.setVisible(true);
        this.reportScrollPane.setVisible(false);
        
        this.totalHorasLabel.setText("");
        this.totalHorasLabel.setVisible(false);
        ReportNacionalidadeView.state = ReportNacionalidadeView.BUSCA;
    }

    private void loadTable() {
        
        List<FuncionarioHorasSemana> horasSemana = FuncionarioHorasSemana.parseFuncionarioHorasSemana(ReportNacionalidadeView.horasFuncionarios);
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

    public Map<String,List<FuncionarioHorasSemana>> getPDFData() {
        
        List<FuncionarioHoras> func = new ArrayList<FuncionarioHoras>();
        
        int numRow = this.reportTable.getRowCount();
        for(int i=0;i<numRow;i++){
            //func.add(new FuncionarioHoras((String)this.reportTable.getValueAt(i, 0),(String)this.reportTable.getValueAt(i, 1),(String)this.reportTable.getValueAt(i, 2)));
        }
        return null;
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
}
