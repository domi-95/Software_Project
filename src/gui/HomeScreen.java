// GUI let the Customer choose which action to do next
package gui;

import software_project.*;

public class HomeScreen extends javax.swing.JFrame {

    private Session s;
    
    public HomeScreen() {
        initComponents();
        
    }
     public HomeScreen(Session s) {
        initComponents();
        this.s = s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHome = new javax.swing.JLabel();
        btnCash = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtHome.setText("ATM Homescreen");

        btnCash.setText("WithdrawCash");
        btnCash.setMaximumSize(new java.awt.Dimension(100, 25));
        btnCash.setMinimumSize(new java.awt.Dimension(100, 25));
        btnCash.setPreferredSize(new java.awt.Dimension(100, 25));
        btnCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashActionPerformed(evt);
            }
        });

        btnTransfer.setText("Transfer Money");
        btnTransfer.setMaximumSize(new java.awt.Dimension(100, 25));
        btnTransfer.setMinimumSize(new java.awt.Dimension(100, 25));
        btnTransfer.setPreferredSize(new java.awt.Dimension(100, 25));
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnCheck.setText("Check Account Balance");
        btnCheck.setMaximumSize(new java.awt.Dimension(100, 25));
        btnCheck.setMinimumSize(new java.awt.Dimension(100, 25));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/BoFss.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(logo))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHome)
                    .addComponent(btnCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtHome)
                .addGap(43, 43, 43)
                .addComponent(btnCash, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashActionPerformed
       
       this.setVisible(false);
       new gui.WithdrawCash(s).setVisible(true);
  
    }//GEN-LAST:event_btnCashActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
       TransferMoney next = new TransferMoney(s);
       this.setVisible(false);
       next.setVisible(true);
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
       AccountCheck next = new AccountCheck(s);
       this.setVisible(false);
       next.setVisible(true);
        
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       s.getTerminal().discardBankingscard(s);
        this.setVisible(false);
        new gui.ChooseATM().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCash;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtHome;
    // End of variables declaration//GEN-END:variables
}
