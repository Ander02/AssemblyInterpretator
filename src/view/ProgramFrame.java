package view;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Anderson
 */
public class ProgramFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProgramFrame
     */
    public ProgramFrame() {
        this.initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();
        commandsTextbox = new javax.swing.JTextPane();
        executeButton = new javax.swing.JButton();
        axLabel = new javax.swing.JLabel();
        bxLabel = new javax.swing.JLabel();
        dxLabel = new javax.swing.JLabel();
        cxLabel = new javax.swing.JLabel();
        axValue = new javax.swing.JLabel();
        bxValue = new javax.swing.JLabel();
        dxValue = new javax.swing.JLabel();
        cxValue = new javax.swing.JLabel();
        pcLabel = new javax.swing.JLabel();
        pcValue = new javax.swing.JLabel();
        marLabel = new javax.swing.JLabel();
        marValue = new javax.swing.JLabel();
        mbrLabel = new javax.swing.JLabel();
        mbrValue = new javax.swing.JLabel();
        irOpLabel = new javax.swing.JLabel();
        irOpValue = new javax.swing.JLabel();
        irP1Value = new javax.swing.JLabel();
        irP1Label = new javax.swing.JLabel();
        irP2Value = new javax.swing.JLabel();
        irP2Label = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        separator3 = new javax.swing.JSeparator();
        separator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interpretador Assembly");
        setName("MainFrame"); // NOI18N

        commandsTextbox.setName("commandsTextbox"); // NOI18N
        scrollPanel.setViewportView(commandsTextbox);

        executeButton.setText("Executar");
        executeButton.setName("ButtonExecute"); // NOI18N
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });

        axLabel.setText("Ax: ");
        axLabel.setName("axLabel"); // NOI18N

        bxLabel.setText("Bx: ");
        bxLabel.setName("bxLabel"); // NOI18N

        dxLabel.setText("Dx: ");
        dxLabel.setName("dxLabel"); // NOI18N

        cxLabel.setText("Cx: ");
        cxLabel.setName("cxLabel"); // NOI18N

        axValue.setText("Ax Value");
        axValue.setName("axValue"); // NOI18N

        bxValue.setText("Bx Value");
        bxValue.setName("bxValue"); // NOI18N

        dxValue.setText("Dx Value");
        dxValue.setName("dxValue"); // NOI18N

        cxValue.setText("Cx Value");
        cxValue.setName("cxValue"); // NOI18N

        pcLabel.setText("PC: ");

        pcValue.setText("Pc Value");

        marLabel.setText("MAR: ");

        marValue.setText("MAR Value");

        mbrLabel.setText("MBR: ");

        mbrValue.setText("MBR Value");

        irOpLabel.setText("IR OP:");

        irOpValue.setText("IR OP Value");

        irP1Value.setText("IR P1 Value");

        irP1Label.setText("IR P1: ");

        irP2Value.setText("IR P2 Value");

        irP2Label.setText("IR P2: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(executeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bxLabel)
                            .addComponent(cxLabel)
                            .addComponent(dxLabel)
                            .addComponent(axLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mbrLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mbrValue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(irP1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(irP1Value))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(irP2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(irP2Value))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(irOpLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(irOpValue))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marLabel)
                                    .addComponent(pcLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pcValue)
                                    .addComponent(marValue)
                                    .addComponent(dxValue)
                                    .addComponent(cxValue)
                                    .addComponent(bxValue)
                                    .addComponent(axValue))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(separator2)
                    .addComponent(separator3)
                    .addComponent(separator4)
                    .addComponent(separator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(axLabel)
                            .addComponent(axValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bxLabel)
                            .addComponent(bxValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dxLabel)
                            .addComponent(dxValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pcLabel)
                            .addComponent(pcValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marLabel)
                            .addComponent(marValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mbrLabel)
                            .addComponent(mbrValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(irOpLabel)
                            .addComponent(irOpValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(irP1Label)
                            .addComponent(irP1Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(irP2Label)
                            .addComponent(irP2Value, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(executeButton))
                    .addComponent(scrollPanel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed

        String text = this.getTextFromCommandsTextbox();

        for (String s : this.splitLine(text)) {
            System.out.println(s);
        }
        System.out.println();
    }//GEN-LAST:event_executeButtonActionPerformed

    private String getTextFromCommandsTextbox() {
        return this.commandsTextbox.getText();
    }

    private String[] splitLine(String string) {
        return string.split("\n");
    }

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
            java.util.logging.Logger.getLogger(ProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProgramFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel axLabel;
    private javax.swing.JLabel axValue;
    private javax.swing.JLabel bxLabel;
    private javax.swing.JLabel bxValue;
    private javax.swing.JTextPane commandsTextbox;
    private javax.swing.JLabel cxLabel;
    private javax.swing.JLabel cxValue;
    private javax.swing.JLabel dxLabel;
    private javax.swing.JLabel dxValue;
    private javax.swing.JButton executeButton;
    private javax.swing.JLabel irOpLabel;
    private javax.swing.JLabel irOpValue;
    private javax.swing.JLabel irP1Label;
    private javax.swing.JLabel irP1Value;
    private javax.swing.JLabel irP2Label;
    private javax.swing.JLabel irP2Value;
    private javax.swing.JLabel marLabel;
    private javax.swing.JLabel marValue;
    private javax.swing.JLabel mbrLabel;
    private javax.swing.JLabel mbrValue;
    private javax.swing.JLabel pcLabel;
    private javax.swing.JLabel pcValue;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    private javax.swing.JSeparator separator4;
    // End of variables declaration//GEN-END:variables
}
