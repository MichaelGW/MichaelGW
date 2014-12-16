
package edu.gwss.mt.ics20.u1;


public class R_P_S extends javax.swing.JFrame {

    
    public R_P_S() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rock_Button = new javax.swing.JButton();
        Paper_Button = new javax.swing.JButton();
        Scissors_Button = new javax.swing.JButton();
        Text1 = new javax.swing.JTextField();
        Start_Button = new javax.swing.JButton();
        Text2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComputerScore = new javax.swing.JTextField();
        PlayerScore = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Rock_Button.setText("Rock");
        Rock_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rock_ButtonActionPerformed(evt);
            }
        });

        Paper_Button.setText("Paper");
        Paper_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Paper_ButtonActionPerformed(evt);
            }
        });

        Scissors_Button.setText("Scissors");
        Scissors_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scissors_ButtonActionPerformed(evt);
            }
        });

        Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1ActionPerformed(evt);
            }
        });

        Start_Button.setText("New Game");
        Start_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_ButtonActionPerformed(evt);
            }
        });

        Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Score");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Computer");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Player");

        ComputerScore.setText("  ");
        ComputerScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputerScoreActionPerformed(evt);
            }
        });

        PlayerScore.setText("  ");
        PlayerScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComputerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(PlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rock_Button)
                        .addGap(60, 60, 60)
                        .addComponent(Paper_Button)
                        .addGap(18, 18, 18)
                        .addComponent(Scissors_Button))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Text1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addComponent(Text2, javax.swing.GroupLayout.Alignment.LEADING))))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(Start_Button))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Start_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComputerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rock_Button)
                    .addComponent(Paper_Button)
                    .addComponent(Scissors_Button)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int CompScore;
    int PlayersScore;
    
    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text1ActionPerformed

    private void Rock_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rock_ButtonActionPerformed
        
        int playerChoice = 1;
        int computerChoice = (int) (Math.random() * 3 ) + 1;
        if (computerChoice == 1){
         Text2.setText( "Computer picked rock." );   
        }else if (computerChoice == 2) {
           Text2.setText( "Computer picked paper." ); 
        }else if (computerChoice == 3) {
           Text2.setText( "Computer picked scissors." ); 
        }
        
        if (playerChoice == computerChoice){
         Text1.setText( "Draw" );   
        }else if (computerChoice== 3) {
          Text1.setText( "Player Wins!" );
          PlayersScore ++;
        }else if (computerChoice== 2) {
           Text1.setText( "Computer Wins!" ); 
           CompScore ++;
        }
        
        checkWinner();
            
    }//GEN-LAST:event_Rock_ButtonActionPerformed

    private void Paper_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Paper_ButtonActionPerformed
        int playerChoice = 2;
        int computerChoice = (int) (Math.random() * 3 ) + 1;
        if (computerChoice == 1){
         Text2.setText( "Computer picked rock." );   
        }else if (computerChoice == 2) {
           Text2.setText( "Computer picked paper." ); 
        }else if (computerChoice == 3) {
           Text2.setText( "Computer picked scissors." ); 
        }
        
        if (playerChoice == computerChoice){
         Text1.setText( "Draw" );   
        }else if (computerChoice== 1) {
          Text1.setText( "Player Wins!" ); 
          PlayersScore ++;
        }else if (computerChoice== 3) {
           Text1.setText( "Computer Wins!" ); 
           CompScore ++;
        }
        
        checkWinner();
        
    }//GEN-LAST:event_Paper_ButtonActionPerformed

    private void Scissors_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scissors_ButtonActionPerformed
        int playerChoice = 3;
        int computerChoice = (int) (Math.random() * 3 ) + 1;
        if (computerChoice == 1){
         Text2.setText( "Computer picked rock." );   
        }else if (computerChoice == 2) {
           Text2.setText( "Computer picked paper." ); 
        }else if (computerChoice == 3) {
           Text2.setText( "Computer picked scissors." ); 
        }
        
        if (playerChoice == computerChoice){
         Text1.setText( "Draw" );   
        }else if (computerChoice== 1) {
          Text1.setText( "Computer Wins!" );
          CompScore ++;
        }else if (computerChoice== 2) {
           Text1.setText( "Player Wins!" );
           PlayersScore ++;
        }
        
        checkWinner();
        
    }//GEN-LAST:event_Scissors_ButtonActionPerformed

    private void Start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_ButtonActionPerformed
        Text1.setText( "Pick Rock, Paper , or Scissors" );
        
    }//GEN-LAST:event_Start_ButtonActionPerformed

    private void Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text2ActionPerformed
        
    }//GEN-LAST:event_Text2ActionPerformed

    private void PlayerScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerScoreActionPerformed
         
            
        
    }//GEN-LAST:event_PlayerScoreActionPerformed

    private void ComputerScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputerScoreActionPerformed
    

        
    }//GEN-LAST:event_ComputerScoreActionPerformed

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
            java.util.logging.Logger.getLogger(R_P_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R_P_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R_P_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R_P_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R_P_S().setVisible(true);
            }
        });
    }

    private void checkWinner( ) {
                    if (CompScore == 1){
                ComputerScore.setText( "1");
            }else if (CompScore == 2){
                ComputerScore.setText( "2");
            }else if (CompScore == 3){
                ComputerScore.setText( "3");
                Text2.setText( "Game Over");
                Text1.setText("Computer Wins");
            }
                    
            if (PlayersScore == 1){
                PlayerScore.setText( "1");
            }else if (PlayersScore == 2){
                PlayerScore.setText( "2");
            }else if (PlayersScore == 3){
                PlayerScore.setText( "3");
                Text2.setText( "Game Over");
                Text1.setText("Player Wins");
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ComputerScore;
    private javax.swing.JButton Paper_Button;
    private javax.swing.JTextField PlayerScore;
    private javax.swing.JButton Rock_Button;
    private javax.swing.JButton Scissors_Button;
    private javax.swing.JButton Start_Button;
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
