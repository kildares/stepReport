/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.view;

/**
 *
 * @author Kildare
 */
public class FuncionarioView extends javax.swing.JPanel {

    /**
     * Creates new form FuncionarioView
     */
    public FuncionarioView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcionarioLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        numeroLabel = new javax.swing.JLabel();
        nacionalidadeLabel = new javax.swing.JLabel();
        bspLabel = new javax.swing.JLabel();
        profissaoLabel = new javax.swing.JLabel();
        taskNumber = new javax.swing.JLabel();
        semanaLabel = new javax.swing.JLabel();
        navioLabel = new javax.swing.JLabel();
        horasLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        numeroTextField = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        nacionalidadeCombo = new javax.swing.JComboBox<>();
        confirmarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        funcionarioLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        funcionarioLabel.setText("Cadastrar Funcionário");

        nomeLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeLabel.setText("Nome do trabalhador:");

        numeroLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        numeroLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numeroLabel.setText("Número do trabalhador:");

        nacionalidadeLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nacionalidadeLabel.setText("Nacionalidade:");

        bspLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        bspLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bspLabel.setText("BSP:");

        profissaoLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profissaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        profissaoLabel.setText("Profissão:");

        taskNumber.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        taskNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        taskNumber.setText("Task Number:");

        semanaLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semanaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        semanaLabel.setText("Data de Semana:");

        navioLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        navioLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        navioLabel.setText("Navio / Unidade:");

        horasLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        horasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        horasLabel.setText("Horas / Dias:");

        nomeTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        numeroTextField.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        nacionalidadeCombo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        nacionalidadeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afeganistão                                   ", "África do Sul                                 ", "Albânia                                       ", "Alemanha                                      ", "Andorra                                       ", "Angola                                        ", "Anguilla                                      ", "Antilhas Holandesas                           ", "Antárctida                                    ", "Antígua e Barbuda                             ", "Argentina                                     ", "Argélia                                       ", "Armênia                                       ", "Aruba                                         ", "Arábia Saudita                                ", "Austrália                                     ", "Áustria                                       ", "Azerbaijão                                    ", "Bahamas                                       ", "Bahrein                                       ", "Bangladesh                                    ", "Barbados                                      ", "Belize                                        ", "Benim                                         ", "Bermudas                                      ", "Bielorrússia                                  ", "Bolívia                                       ", "Botswana                                      ", "Brunei                                        ", "Bulgária                                      ", "Burkina Faso                                  ", "Burundi                                       ", "Butão                                         ", "Bélgica                                       ", "Bósnia e Herzegovina                          ", "Cabo Verde                                    ", "Camarões                                      ", "Camboja                                       ", "Canadá                                        ", "Catar                                         ", "Cazaquistão                                   ", "Chade                                         ", "Chile                                         ", "China                                         ", "Chipre                                        ", "Colômbia                                      ", "Comores                                       ", "Coreia do Norte                               ", "Coreia do Sul                                 ", "Costa do Marfim                               ", "Costa Rica                                    ", "Croácia                                       ", "Cuba                                          ", "Dinamarca                                     ", "Djibouti                                      ", "Dominica                                      ", "Egito                                         ", "El Salvador                                   ", "Emirados Árabes Unidos                        ", "Equador                                       ", "Eritreia                                      ", "Escócia                                       ", "Eslováquia                                    ", "Eslovênia                                     ", "Espanha                                       ", "Estados Federados da Micronésia               ", "Estados Unidos                                ", "Estônia                                       ", "Etiópia                                       ", "Fiji                                          ", "Filipinas                                     ", "Finlândia                                     ", "França                                        ", "Gabão                                         ", "Gana                                          ", "Geórgia                                       ", "Gibraltar                                     ", "Granada                                       ", "Gronelândia                                   ", "Grécia                                        ", "Guadalupe                                     ", "Guam                                          ", "Guatemala                                     ", "Guernesei                                     ", "Guiana                                        ", "Guiana Francesa                               ", "Guiné                                         ", "Guiné Equatorial                              ", "Guiné-Bissau                                  ", "Gâmbia                                        ", "Haiti                                         ", "Honduras                                      ", "Hong Kong                                     ", "Hungria                                       ", "Ilha Bouvet                                   ", "Ilha de Man                                   ", "Ilha do Natal                                 ", "Ilha Heard e Ilhas McDonald                   ", "Ilha Norfolk                                  ", "Ilhas Cayman                                  ", "Ilhas Cocos (Keeling)                         ", "Ilhas Cook                                    ", "Ilhas Feroé                                   ", "Ilhas Geórgia do Sul e Sandwich do Sul        ", "Ilhas Malvinas                                ", "Ilhas Marshall                                ", "Ilhas Menores Distantes dos Estados Unidos    ", "Ilhas Salomão                                 ", "Ilhas Virgens Americanas                      ", "Ilhas Virgens Britânicas                      ", "Ilhas Åland                                   ", "Indonésia                                     ", "Inglaterra                                    ", "Índia                                         ", "Iraque                                        ", "Irlanda do Norte                              ", "Irlanda                                       ", "Irã                                           ", "Islândia                                      ", "Israel                                        ", "Itália                                        ", "Iêmen                                         ", "Jamaica                                       ", "Japão                                         ", "Jersey                                        ", "Jordânia                                      ", "Kiribati                                      ", "Kuwait                                        ", "Laos                                          ", "Lesoto                                        ", "Letônia                                       ", "Libéria                                       ", "Liechtenstein                                 ", "Lituânia                                      ", "Luxemburgo                                    ", "Líbano                                        ", "Líbia                                         ", "Macau                                         ", "Macedônia                                     ", "Madagáscar                                    ", "Malawi                                        ", "Maldivas                                      ", "Mali                                          ", "Malta                                         ", "Malásia                                       ", "Marianas Setentrionais                        ", "Marrocos                                      ", "Martinica                                     ", "Mauritânia                                    ", "Maurícia                                      ", "Mayotte                                       ", "Moldávia                                      ", "Mongólia                                      ", "Montenegro                                    ", "Montserrat                                    ", "Moçambique                                    ", "Myanmar                                       ", "México                                        ", "Mônaco                                        ", "Namíbia                                       ", "Nauru                                         ", "Nepal                                         ", "Nicarágua                                     ", "Nigéria                                       ", "Niue                                          ", "Noruega                                       ", "Nova Caledônia                                ", "Nova Zelândia                                 ", "Níger                                         ", "Omã                                           ", "Palau                                         ", "Palestina                                     ", "Panamá                                        ", "Papua-Nova Guiné                              ", "Paquistão                                     ", "Paraguai                                      ", "País de Gales                                 ", "Países Baixos                                 ", "Peru                                          ", "Pitcairn                                      ", "Polinésia Francesa                            ", "Polônia                                       ", "Porto Rico                                    ", "Portugal                                      ", "Quirguistão                                   ", "Quênia                                        ", "Reino Unido                                   ", "República Centro-Africana                     ", "República Checa                               ", "República Democrática do Congo                ", "República do Congo                            ", "República Dominicana                          ", "Reunião                                       ", "Romênia                                       ", "Ruanda                                        ", "Rússia                                        ", "Saara Ocidental                               ", "Saint Martin                                  ", "Saint-Barthélemy                              ", "Saint-Pierre e Miquelon                       ", "Samoa Americana                               ", "Samoa                                         ", "Santa Helena, Ascensão e Tristão da Cunha     ", "Santa Lúcia                                   ", "Senegal                                       ", "Serra Leoa                                    ", "Seychelles                                    ", "Singapura                                     ", "Somália                                       ", "Sri Lanka                                     ", "Suazilândia                                   ", "Sudão                                         ", "Suriname                                      ", "Suécia                                        ", "Suíça                                         ", "Svalbard e Jan Mayen                          ", "São Cristóvão e Nevis                         ", "São Marino                                    ", "São Tomé e Príncipe                           ", "São Vicente e Granadinas                      ", "Sérvia                                        ", "Síria                                         ", "Tadjiquistão                                  ", "Tailândia                                     ", "Taiwan                                        ", "Tanzânia                                      ", "Terras Austrais e Antárticas Francesas        ", "Território Britânico do Oceano Índico         ", "Timor-Leste                                   ", "Togo                                          ", "Tonga                                         ", "Toquelau                                      ", "Trinidad e Tobago                             ", "Tunísia                                       ", "Turcas e Caicos                               ", "Turquemenistão                                ", "Turquia                                       ", "Tuvalu                                        ", "Ucrânia                                       ", "Uganda                                        ", "Uruguai                                       ", "Uzbequistão                                   ", "Vanuatu                                       ", "Vaticano                                      ", "Venezuela                                     ", "Vietname                                      ", "Wallis e Futuna                               ", "Zimbabwe                                      ", "Zâmbia                                        " }));

        confirmarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmarButton.setText("CONFIRMAR");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cancelarButton.setText("CANCELAR");
        cancelarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarButtonMouseClicked(evt);
            }
        });
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(funcionarioLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelarButton)
                                .addGap(18, 18, 18)
                                .addComponent(confirmarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(semanaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(navioLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bspLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(profissaoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numeroLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nacionalidadeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(taskNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(horasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeTextField)
                                    .addComponent(numeroTextField)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                    .addComponent(nacionalidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(funcionarioLabel)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidadeLabel)
                    .addComponent(nacionalidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profissaoLabel)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bspLabel)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskNumber)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(navioLabel)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semanaLabel)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horasLabel)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelarButtonMouseClicked

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bspLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel funcionarioLabel;
    private javax.swing.JLabel horasLabel;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<String> nacionalidadeCombo;
    private javax.swing.JLabel nacionalidadeLabel;
    private javax.swing.JLabel navioLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JLabel profissaoLabel;
    private javax.swing.JLabel semanaLabel;
    private javax.swing.JLabel taskNumber;
    // End of variables declaration//GEN-END:variables

    public void loadSearchView() {
        
        this.funcionarioLabel.setText("Buscar Funcionário");
        this.nomeTextField.setText("");
        
        
        
    }
}
