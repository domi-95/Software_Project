// GUI which allows the user to enter the PIN and checks it
package gui;

import javax.swing.JOptionPane;
import software_project.*;


public class PINCheck extends javax.swing.JFrame {
    int counter = 0;
    Session s;

   
    public PINCheck() {
        initComponents();  
    }
    public PINCheck(Session s) {
        initComponents(); 
        this.s = s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPIN = new javax.swing.JLabel();
        fieldPIN = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPIN.setText("Please enter your PIN");

        fieldPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPINActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(fieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOK))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(69, 69, 69)
                        .addComponent(txtPIN)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txtPIN))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(fieldPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOK))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
       boolean correct = false;
          
           for (Banking_account b : InstancesFile.accountlist){
               if (b.getPin().equals(fieldPIN.getText())){
                   
                   s.setBank(b);
                    HomeScreen next = new HomeScreen(s);
               this.setVisible(false);
               next.setVisible(true);
               correct = true;
               }
           }
            
           if (correct == false){
           				         
            if (counter ==2){
                    JOptionPane.showMessageDialog(null,"You entered your PIN wrong to often." );
                     ChooseATM back = new ChooseATM();
            }
            else{
            JOptionPane.showMessageDialog(null,"Entered PIN is incorrect. Please try again.");
            counter = counter +1;
            fieldPIN.setText("");
            PINCheck back = new PINCheck();
             }
           }
       
    }//GEN-LAST:event_btnOKActionPerformed

    private void fieldPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPINActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        new gui.ChooseATM().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
  
    public static void main(String args[]) {
        
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PINCheck().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JPasswordField fieldPIN;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtPIN;
    // End of variables declaration//GEN-END:variables

}
