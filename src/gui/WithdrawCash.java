// creates GUI to let the customer choose how much cash he wants to withdraw and then withdraws it
package gui;

import software_project.*;

public class WithdrawCash extends javax.swing.JFrame {
    
   private Session s;
   
    public WithdrawCash() {
        initComponents();
    }
    
    public WithdrawCash(Session s) {
        initComponents();
        this.s = s;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtChoose = new javax.swing.JLabel();
        btn10e = new javax.swing.JButton();
        btn50e = new javax.swing.JButton();
        btn100e = new javax.swing.JButton();
        btndifferent = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtChoose.setText("Please select the amount of cash you want to withdraw");

        btn10e.setText("10 Euro");
        btn10e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10eActionPerformed(evt);
            }
        });

        btn50e.setText("50 Euro");
        btn50e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50eActionPerformed(evt);
            }
        });

        btn100e.setText("100 Euro");
        btn100e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100eActionPerformed(evt);
            }
        });

        btndifferent.setText("Different");
        btndifferent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndifferentActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtChoose)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn50e, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btndifferent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn10e, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn100e, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtChoose))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10e, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn100e, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn50e, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndifferent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn10eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10eActionPerformed
        Banking_account acc = s.getBank();
        Customer cust = acc.getCst();
        ATM term = s.getTerminal();
        if(acc.getCst().withdrawCash(10, term, acc, s)==true){
        this.setVisible(false);
        new gui.HomeScreen(s).setVisible(true);
        }
    }//GEN-LAST:event_btn10eActionPerformed

    private void btndifferentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndifferentActionPerformed
        WithdrawCashDifferent next = new WithdrawCashDifferent(s);
        this.setVisible(false);
        next.setVisible(true);
    }//GEN-LAST:event_btndifferentActionPerformed

    private void btn100eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100eActionPerformed
       Banking_account acc = s.getBank();
        Customer cust = acc.getCst();
        ATM term = s.getTerminal();
        if(acc.getCst().withdrawCash(100, term, acc, s)==true) {
        this.setVisible(false);
        new gui.HomeScreen(s).setVisible(true);
        }
    }//GEN-LAST:event_btn100eActionPerformed

    private void btn50eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50eActionPerformed
       Banking_account acc = s.getBank();
        Customer cust = acc.getCst();
        ATM term = s.getTerminal();
        if(acc.getCst().withdrawCash(50, term, acc, s)==true){
           this.setVisible(false);
        new gui.HomeScreen(s).setVisible(true);
        }
    }//GEN-LAST:event_btn50eActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        new gui.HomeScreen(s).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100e;
    private javax.swing.JButton btn10e;
    private javax.swing.JButton btn50e;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btndifferent;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtChoose;
    // End of variables declaration//GEN-END:variables
}
