// creates GUI which allows the customer to enter the transfer informations
//and to commit the transfer of money to a different account
package gui;

import javax.swing.JOptionPane;
import software_project.*;

public class TransferMoney extends javax.swing.JFrame {

    Session s;
    InstancesFile file;
    boolean found = false;
    
    public TransferMoney() {
        initComponents();
    }
    public TransferMoney(Session s) {
        initComponents();
        this.s = s;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInfo = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtBankAccountNr = new javax.swing.JLabel();
        txtAmount = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldIBAN = new javax.swing.JTextField();
        fieldAmount = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtInfo.setText("Please enter the following information:");

        txtName.setText("Name of receiving person");

        txtBankAccountNr.setText("Bank Account Number");

        txtAmount.setText("Amount of Money");

        fieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNameActionPerformed(evt);
            }
        });

        fieldIBAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIBANActionPerformed(evt);
            }
        });

        fieldAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAmountActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtInfo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBankAccountNr)
                            .addComponent(txtName)
                            .addComponent(txtAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtInfo)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName)
                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankAccountNr)
                    .addComponent(fieldIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount)
                    .addComponent(fieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 106, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void fieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNameActionPerformed

    private void fieldIBANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIBANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIBANActionPerformed

    private void fieldAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAmountActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
         try{
             if(fieldIBAN.getText().equals(s.getBank().getBnr())){
                JOptionPane.showMessageDialog(null, "You cannot transfer money to your own bank account.");
                 fieldIBAN.setText("");
             }   
            for (Banking_account account : InstancesFile.accountlist){
                if (fieldIBAN.getText().equals(account.getBnr())){
               Banking_account to = account;
               String samount = fieldAmount.getText();
               double amount = Double.parseDouble(samount);
               found = true;
               
               if (s.getSystem().checkAccount(s.getBank(), amount) == true){
                    s.getSystem().transferMoney(s.getBank(), to, amount);
                    this.setVisible(false);
                   new gui.HomeScreen(s).setVisible(true);
               }
              
           }
             }
                if (found == false){
               JOptionPane.showMessageDialog(null, "The inserted bank account number is not recognized. Please try again.");
               fieldIBAN.setText("");
           }
             
         
         }
         catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Your entered amount was not a valid number. Please try again.");
           
           
         }
        

    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        new gui.HomeScreen(s).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JTextField fieldAmount;
    private javax.swing.JTextField fieldIBAN;
    private javax.swing.JTextField fieldName;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtAmount;
    private javax.swing.JLabel txtBankAccountNr;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JLabel txtName;
    // End of variables declaration//GEN-END:variables
}
