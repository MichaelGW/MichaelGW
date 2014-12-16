/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.mt.ics20.u1;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author michaeltaciuk
 */
public class Flags extends javax.swing.JFrame {

    /**
     * Creates new form Flags
     */
    public Flags() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        Bahamas = new javax.swing.JRadioButton();
        TimorLeste = new javax.swing.JRadioButton();
        Mauritania = new javax.swing.JRadioButton();
        Kuwait = new javax.swing.JRadioButton();
        SouthAfrica = new javax.swing.JRadioButton();

        jButton4.setText("jButton4");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton8.setText("jButton1");

        jButton1.setText("jButton1");

        jButton7.setText("jButton1");

        jButton6.setText("jButton1");

        jButton5.setText("jButton1");

        jCheckBox4.setText("jCheckBox4");

        jCheckBox3.setText("jCheckBox3");

        jCheckBox2.setText("jCheckBox2");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Botswana");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
                botswana(evt);
            }
        });

        buttonGroup1.add(Bahamas);
        Bahamas.setText("Bahamas");
        Bahamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BahamasActionPerformed(evt);
            }
        });

        buttonGroup1.add(TimorLeste);
        TimorLeste.setText("Timor Leste");
        TimorLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimorLesteActionPerformed(evt);
            }
        });

        buttonGroup1.add(Mauritania);
        Mauritania.setText("Mauritania");
        Mauritania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MauritaniaActionPerformed(evt);
            }
        });

        buttonGroup1.add(Kuwait);
        Kuwait.setText("Kuwait");
        Kuwait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KuwaitActionPerformed(evt);
            }
        });

        buttonGroup1.add(SouthAfrica);
        SouthAfrica.setText("SouthAfrica");
        SouthAfrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SouthAfricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(Mauritania))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bahamas)
                    .addComponent(Kuwait))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SouthAfrica)
                    .addComponent(TimorLeste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(Bahamas)
                    .addComponent(TimorLeste))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mauritania)
                    .addComponent(Kuwait)
                    .addComponent(SouthAfrica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
     
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void KuwaitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KuwaitActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setLocation(330, 0);

        // ADD FLAG TO FRAME
        Kuwait jf = new Kuwait();
        frame.add(jf);

        frame.setVisible(true);
    }//GEN-LAST:event_KuwaitActionPerformed

    private void botswana(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botswana
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setLocation(330, 0);  
        // ADD FLAG TO FRAME
        BotswanaFlag jf = new BotswanaFlag();
        frame.add(jf);

        frame.setVisible(true);    }//GEN-LAST:event_botswana

    private void BahamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BahamasActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setLocation(330, 0);
        // ADD FLAG TO FRAME
        BahamasFlag jf = new BahamasFlag();
        frame.add(jf);

        frame.setVisible(true);
    }//GEN-LAST:event_BahamasActionPerformed

    private void TimorLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimorLesteActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setLocation(330, 0);     
        // ADD FLAG TO FRAME
        Timor_Leste jf = new Timor_Leste();
        frame.add(jf);

        frame.setVisible(true);
    }//GEN-LAST:event_TimorLesteActionPerformed

    private void MauritaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MauritaniaActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setLocation(330, 0);  
        // ADD FLAG TO FRAME
        Mauritania jf = new Mauritania();
        frame.add(jf);

        frame.setVisible(true);
    }//GEN-LAST:event_MauritaniaActionPerformed

    private void SouthAfricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SouthAfricaActionPerformed
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setLocation(330, 0);
        // ADD FLAG TO FRAME
        SouthAfrica jf = new SouthAfrica();
        frame.add(jf);

        frame.setVisible(true);
    }//GEN-LAST:event_SouthAfricaActionPerformed

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
            java.util.logging.Logger.getLogger(Flags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flags().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bahamas;
    private javax.swing.JRadioButton Kuwait;
    private javax.swing.JRadioButton Mauritania;
    private javax.swing.JRadioButton SouthAfrica;
    private javax.swing.JRadioButton TimorLeste;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
