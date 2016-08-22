/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.view;

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
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
    
    
    /**
     * Creates new form reportHora
     * @param control
     */
    public ReportNacionalidadeView(ReportControl control) {
        initComponents();
        this.insertDatePicker();
        this.setControl(control);
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
        nacionalidadeCombo = new javax.swing.JComboBox<>();
        titleLabel = new javax.swing.JLabel();
        nacionalidadeLabel = new javax.swing.JLabel();
        confirmarButton = new javax.swing.JButton();
        mensalRadionButton = new javax.swing.JRadioButton();
        anualRadioButton = new javax.swing.JRadioButton();
        personRadionButton = new javax.swing.JRadioButton();
        nacionalidadeLabel1 = new javax.swing.JLabel();
        periodoPanel = new javax.swing.JPanel();
        periodo2Label = new javax.swing.JLabel();
        periodo2TextField = new javax.swing.JFormattedTextField();
        periodo1Label = new javax.swing.JLabel();
        periodo1TextField = new javax.swing.JFormattedTextField();
        reportScrollPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nacionalidadeCombo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afeganistão", "ÁfricadoSul", "Albânia", "Alemanha", "Andorra", "Angola", "Anguilla", "AntilhasHolandesas", "Antárctida", "AntíguaeBarbuda", "Argentina", "Argélia", "Armênia", "Aruba", "ArábiaSaudita", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Belize", "Benim", "Bermudas", "Bielorrússia", "Bolívia", "Botswana", "Brasil", "Brunei", "Bulgária", "BurkinaFaso", "Burundi", "Butão", "Bélgica", "BósniaeHerzegovina", "CaboVerde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Colômbia", "Comores", "CoreiadoNorte", "CoreiadoSul", "CostadoMarfim", "CostaRica", "Croácia", "Cuba", "Dinamarca", "Djibouti", "Dominica", "Egito", "ElSalvador", "EmiradosÁrabesUnidos", "Equador", "Eritreia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "EstadosFederadosdaMicronésia", "EstadosUnidos", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gana", "Geórgia", "Gibraltar", "Granada", "Gronelândia", "Grécia", "Guadalupe", "Guam", "Guatemala", "Guernesei", "Guiana", "GuianaFrancesa", "Guiné", "GuinéEquatorial", "Guiné-Bissau", "Gâmbia", "Haiti", "Honduras", "HongKong", "Hungria", "IlhaBouvet", "IlhadeMan", "IlhadoNatal", "IlhaHeardeIlhasMcDonald", "IlhaNorfolk", "IlhasCayman", "IlhasCocos(Keeling)", "IlhasCook", "IlhasFeroé", "IlhasGeórgiadoSuleSandwichdoSul", "IlhasMalvinas", "IlhasMarshall", "IlhasMenoresDistantesdosEstadosUnidos", "IlhasSalomão", "IlhasVirgensAmericanas", "IlhasVirgensBritânicas", "IlhasÅland", "Indonésia", "Inglaterra", "Índia", "Iraque", "IrlandadoNorte", "Irlanda", "Irã", "Islândia", "Israel", "Itália", "Iêmen", "Jamaica", "Japão", "Jersey", "Jordânia", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letônia", "Libéria", "Liechtenstein", "Lituânia", "Luxemburgo", "Líbano", "Líbia", "Macau", "Macedônia", "Madagáscar", "Malawi", "Maldivas", "Mali", "Malta", "Malásia", "MarianasSetentrionais", "Marrocos", "Martinica", "Mauritânia", "Maurícia", "Mayotte", "Moldávia", "Mongólia", "Montenegro", "Montserrat", "Moçambique", "Myanmar", "México", "Mônaco", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Nigéria", "Niue", "Noruega", "NovaCaledônia", "NovaZelândia", "Níger", "Omã", "Palau", "Palestina", "Panamá", "Papua-NovaGuiné", "Paquistão", "Paraguai", "PaísdeGales", "PaísesBaixos", "Peru", "Pitcairn", "PolinésiaFrancesa", "Polônia", "PortoRico", "Portugal", "Quirguistão", "Quênia", "ReinoUnido", "RepúblicaCentro-Africana", "RepúblicaCheca", "RepúblicaDemocráticadoCongo", "RepúblicadoCongo", "RepúblicaDominicana", "Reunião", "Romênia", "Ruanda", "Rússia", "SaaraOcidental", "SaintMartin", "Saint-Barthélemy", "Saint-PierreeMiquelon", "SamoaAmericana", "Samoa", "SantaHelena,AscensãoeTristãodaCunha", "SantaLúcia", "Senegal", "SerraLeoa", "Seychelles", "Singapura", "Somália", "SriLanka", "Suazilândia", "Sudão", "Suriname", "Suécia", "Suíça", "SvalbardeJanMayen", "SãoCristóvãoeNevis", "SãoMarino", "SãoToméePríncipe", "SãoVicenteeGranadinas", "Sérvia", "Síria", "Tadjiquistão", "Tailândia", "Taiwan", "Tanzânia", "TerrasAustraiseAntárticasFrancesas", "TerritórioBritânicodoOceanoÍndico", "Timor-Leste", "Togo", "Tonga", "Toquelau", "TrinidadeTobago", "Tunísia", "TurcaseCaicos", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "Uruguai", "Uzbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "WalliseFutuna", "Zimbabwe", "Zâmbia" }));
        add(nacionalidadeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 393, -1));

        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setText("Relatório de Nacionalidade");
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 13, -1, -1));

        nacionalidadeLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nacionalidadeLabel.setText("Período:");
        add(nacionalidadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, -1));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });
        add(confirmarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, 45));

        mensalRadionButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        mensalRadionButton.setText("Mensal");
        mensalRadionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensalRadionButtonActionPerformed(evt);
            }
        });
        add(mensalRadionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 155, -1, -1));

        anualRadioButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        anualRadioButton.setText("Anual");
        anualRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anualRadioButtonActionPerformed(evt);
            }
        });
        add(anualRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 155, -1, -1));

        personRadionButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        personRadionButton.setText("Personalizado");
        personRadionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personRadionButtonActionPerformed(evt);
            }
        });
        add(personRadionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 155, -1, -1));

        nacionalidadeLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nacionalidadeLabel1.setText("Nacionalidade:");
        add(nacionalidadeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, 170, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        // TODO add your handling code here:
        if(ReportNacionalidadeView.state == ReportNacionalidadeView.BUSCA){
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton anualRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JRadioButton mensalRadionButton;
    private javax.swing.JComboBox<String> nacionalidadeCombo;
    private javax.swing.JLabel nacionalidadeLabel;
    private javax.swing.JLabel nacionalidadeLabel1;
    private javax.swing.JLabel periodo1Label;
    private javax.swing.JFormattedTextField periodo1TextField;
    private javax.swing.JLabel periodo2Label;
    private javax.swing.JFormattedTextField periodo2TextField;
    private javax.swing.JPanel periodoPanel;
    private javax.swing.JRadioButton personRadionButton;
    private javax.swing.JScrollPane reportScrollPane;
    private javax.swing.JTable reportTable;
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

    public void loadNationReport() {
        this.titleLabel.setText("Relatório de Nacionalidade");
        this.confirmarButton.setText("Gerar");
        this.InitDatePicker.getJFormattedTextField().setText("");
        this.InitDatePicker.getJFormattedTextField().setEditable(true);
        
        this.FimDatePicker.getJFormattedTextField().setText("");
        this.FimDatePicker.getJFormattedTextField().setEditable(true);
        
        this.InitDatePicker.setVisible(false);
        this.FimDatePicker.setVisible(false);
        this.periodoPanel.setVisible(false);
        this.reportScrollPane.setVisible(false);
        ReportNacionalidadeView.state = ReportNacionalidadeView.BUSCA;
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
}
