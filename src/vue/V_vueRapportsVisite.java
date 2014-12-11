/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

/**
 *
 * @author gproquin
 */
public class V_vueRapportsVisite extends javax.swing.JFrame {

    /**
     * Creates new form RapportsVisite
     */
    public V_vueRapportsVisite() {
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

        jLabelVueRapportVisites = new javax.swing.JLabel();
        jLabelNumRapport = new javax.swing.JLabel();
        jLabelDateRapport = new javax.swing.JLabel();
        jLabelMotifVisite = new javax.swing.JLabel();
        jLabelBilan = new javax.swing.JLabel();
        jLabelOffreEchantillon = new javax.swing.JLabel();
        jButtonPrecedent = new javax.swing.JButton();
        jButtonSuivant = new javax.swing.JButton();
        jTextFieldNumRapport = new javax.swing.JTextField();
        jTextFieldDateRapport = new javax.swing.JTextField();
        jTextFieldMotifVisite = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBilan = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaOffreEchantillon = new javax.swing.JTextArea();
        jButtonPraticienDetails = new javax.swing.JButton();
        jLabelPraticien = new javax.swing.JLabel();
        jComboBoxPraticien = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelVueRapportVisites.setText("Rapports de visites");

        jLabelNumRapport.setText("Numéro Rapport");

        jLabelDateRapport.setText("Date Rapport");

        jLabelMotifVisite.setText("Motif Visite");

        jLabelBilan.setText("BILAN");

        jLabelOffreEchantillon.setText("Offre d'échantillon");

        jButtonPrecedent.setText("Précédent");

        jButtonSuivant.setText("Suivant");
        jButtonSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuivantActionPerformed(evt);
            }
        });

        jTextFieldNumRapport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumRapportActionPerformed(evt);
            }
        });

        jTextAreaBilan.setColumns(20);
        jTextAreaBilan.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBilan);

        jTextAreaOffreEchantillon.setColumns(20);
        jTextAreaOffreEchantillon.setRows(5);
        jScrollPane2.setViewportView(jTextAreaOffreEchantillon);

        jButtonPraticienDetails.setText("Détails");

        jLabelPraticien.setText("Praticien");

        jComboBoxPraticien.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBilan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOffreEchantillon))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMotifVisite)
                                    .addComponent(jLabelDateRapport)
                                    .addComponent(jLabelPraticien))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMotifVisite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDateRapport, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(jButtonPraticienDetails))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumRapport)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumRapport, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxPraticien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabelVueRapportVisites))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButtonPrecedent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSuivant)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelVueRapportVisites)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNumRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumRapport))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPraticien)
                            .addComponent(jButtonPraticienDetails)
                            .addComponent(jComboBoxPraticien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDateRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDateRapport))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMotifVisite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMotifVisite)))
                    .addComponent(jLabelOffreEchantillon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBilan)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrecedent)
                    .addComponent(jButtonSuivant))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumRapportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumRapportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumRapportActionPerformed

    private void jButtonSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuivantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSuivantActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_vueRapportsVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_vueRapportsVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_vueRapportsVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_vueRapportsVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_vueRapportsVisite().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPraticienDetails;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox jComboBoxPraticien;
    private javax.swing.JLabel jLabelBilan;
    private javax.swing.JLabel jLabelDateRapport;
    private javax.swing.JLabel jLabelMotifVisite;
    private javax.swing.JLabel jLabelNumRapport;
    private javax.swing.JLabel jLabelOffreEchantillon;
    private javax.swing.JLabel jLabelPraticien;
    private javax.swing.JLabel jLabelVueRapportVisites;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaBilan;
    private javax.swing.JTextArea jTextAreaOffreEchantillon;
    private javax.swing.JTextField jTextFieldDateRapport;
    private javax.swing.JTextField jTextFieldMotifVisite;
    private javax.swing.JTextField jTextFieldNumRapport;
    // End of variables declaration//GEN-END:variables
}
