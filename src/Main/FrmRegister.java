package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2104689414
 */
public class FrmRegister extends javax.swing.JDialog {
    /**
     * Creates new form register
     */
    public FrmRegister(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        dialRegConf = new javax.swing.JDialog();
        lblRegister1 = new javax.swing.JLabel();
        LblFirstName1 = new javax.swing.JLabel();
        LblSurname1 = new javax.swing.JLabel();
        LblDob1 = new javax.swing.JLabel();
        LblPhone1 = new javax.swing.JLabel();
        LblEmail1 = new javax.swing.JLabel();
        btnEditDet = new javax.swing.JButton();
        btnConfirmReg = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        LblRegister = new javax.swing.JLabel();
        LblFirstName = new javax.swing.JLabel();
        LblSurname = new javax.swing.JLabel();
        LblDob = new javax.swing.JLabel();
        LblPhone = new javax.swing.JLabel();
        LblEmail = new javax.swing.JLabel();
        LblPassword = new javax.swing.JLabel();
        LblConfirmPassword = new javax.swing.JLabel();
        TxtFirstName = new javax.swing.JTextField();
        TxtSurname = new javax.swing.JTextField();
        TxtDob = new javax.swing.JTextField();
        TxtPhone = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        TxtConfirmPassword = new javax.swing.JPasswordField();
        btnCancelReg = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();

        lblRegister1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRegister1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister1.setText("Register");

        LblFirstName1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblFirstName1.setText("First Name");

        LblSurname1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblSurname1.setText("Last Name");

        LblDob1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblDob1.setText("Date of Birth");

        LblPhone1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblPhone1.setText("Phone");

        LblEmail1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblEmail1.setText("Email");

        btnEditDet.setText("Edit Details");

        btnConfirmReg.setText("Confirm");
        btnConfirmReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmRegActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        javax.swing.GroupLayout dialRegConfLayout = new javax.swing.GroupLayout(dialRegConf.getContentPane());
        dialRegConf.getContentPane().setLayout(dialRegConfLayout);
        dialRegConfLayout.setHorizontalGroup(
            dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialRegConfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFirstName1)
                    .addComponent(LblSurname1)
                    .addComponent(LblDob1)
                    .addComponent(LblPhone1)
                    .addComponent(LblEmail1))
                .addGap(45, 45, 45)
                .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialRegConfLayout.createSequentialGroup()
                        .addComponent(btnEditDet)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmReg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(dialRegConfLayout.createSequentialGroup()
                            .addComponent(lblRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66))
                        .addComponent(jTextField1)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        dialRegConfLayout.setVerticalGroup(
            dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialRegConfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegister1)
                .addGap(40, 40, 40)
                .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblFirstName1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSurname1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDob1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPhone1)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEmail1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(dialRegConfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditDet)
                    .addComponent(btnConfirmReg))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LblRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblRegister.setText("Register");

        LblFirstName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblFirstName.setText("First Name");

        LblSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblSurname.setText("Last Name");

        LblDob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblDob.setText("Date of Birth");

        LblPhone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblPhone.setText("Phone");

        LblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblEmail.setText("Email");

        LblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblPassword.setText("Password");

        LblConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblConfirmPassword.setText("Confirm Password");

        btnCancelReg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelReg.setText("Cancel");
        btnCancelReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRegActionPerformed(evt);
            }
        });

        BtnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblFirstName)
                            .addComponent(LblEmail)
                            .addComponent(LblPassword)
                            .addComponent(LblConfirmPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(TxtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(TxtConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblDob)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblPhone)
                                    .addComponent(LblSurname))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelReg, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(LblRegister)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblFirstName)
                    .addComponent(TxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSurname)
                    .addComponent(TxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEmail)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPhone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblDob)
                            .addComponent(TxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSave)
                            .addComponent(btnCancelReg)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblConfirmPassword))))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelRegActionPerformed

    private void btnConfirmRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmRegActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegister dialog = new FrmRegister(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel LblConfirmPassword;
    private javax.swing.JLabel LblDob;
    private javax.swing.JLabel LblDob1;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblEmail1;
    private javax.swing.JLabel LblFirstName;
    private javax.swing.JLabel LblFirstName1;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblPhone;
    private javax.swing.JLabel LblPhone1;
    private javax.swing.JLabel LblRegister;
    private javax.swing.JLabel LblSurname;
    private javax.swing.JLabel LblSurname1;
    private javax.swing.JPasswordField TxtConfirmPassword;
    private javax.swing.JTextField TxtDob;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtFirstName;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtPhone;
    private javax.swing.JTextField TxtSurname;
    private javax.swing.JButton btnCancelReg;
    private javax.swing.JButton btnConfirmReg;
    private javax.swing.JButton btnEditDet;
    private javax.swing.JDialog dialRegConf;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblRegister1;
    // End of variables declaration//GEN-END:variables
}
