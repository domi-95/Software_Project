// GUI simulates the choosing process where to use the ATM
package gui;

import software_project.*;

public class ChooseATM extends javax.swing.JFrame {

    private ATM terminal;
    private Session s;
    private BankingSystem bs = new BankingSystem(101);
    
    public ChooseATM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtChooseATM = new javax.swing.JLabel();
        btnKokkola = new javax.swing.JButton();
        btnTampere = new javax.swing.JButton();
        btnHelsinki = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtChooseATM.setText("Choose your ATM");

        btnKokkola.setText("Kokkola");
        btnKokkola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKokkolaActionPerformed(evt);
            }
        });

        btnTampere.setText("Tampere");
        btnTampere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampereActionPerformed(evt);
            }
        });

        btnHelsinki.setText("Helsinki");
        btnHelsinki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelsinkiActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/BoF.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnKokkola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTampere, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnHelsinki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addComponent(logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(txtChooseATM)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(txtChooseATM)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logo)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnKokkola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTampere, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHelsinki, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKokkolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKokkolaActionPerformed
        for(ATM a : ATMRegister.ATMlist){
            if (a.getLocation().equals("Kokkola")){
                s = new Session (a, null, bs);
            }
        }
        InsertCard next = new InsertCard(s);
         this.setVisible(false);
         next.setVisible(true);
    }//GEN-LAST:event_btnKokkolaActionPerformed

    private void btnTampereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampereActionPerformed
         for(ATM a : ATMRegister.ATMlist){
            if (a.getLocation().equals("Tampere")){
                s = new Session (a, null, bs);
            }
        }
         InsertCard next = new InsertCard(s);
         this.setVisible(false);
         next.setVisible(true);
    }//GEN-LAST:event_btnTampereActionPerformed

    private void btnHelsinkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelsinkiActionPerformed
         for(ATM a : ATMRegister.ATMlist){
            if (a.getLocation().equals("Helsinki")){
                  s = new Session (a, null, bs);
            }
        }
         InsertCard next = new InsertCard(s);
         this.setVisible(false);
         next.setVisible(true);
    }//GEN-LAST:event_btnHelsinkiActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelsinki;
    private javax.swing.JButton btnKokkola;
    private javax.swing.JButton btnTampere;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtChooseATM;
    // End of variables declaration//GEN-END:variables
}
