/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;




        
/**
 *
 * @author 1105642614
 */
public class FrmRegister extends javax.swing.JFrame {
    FrmLogin frmLogin;  
    PopUpMsgBox msgbox = new PopUpMsgBox();
    Database db = new Database();
    Connection con;
    PreparedStatement statement;
    ResultSet rs;
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
    /**
     * Creates new form FrmRegister1
     */
    public FrmRegister() {
        initComponents();
        this.dgConfirm.setVisible(false);
        BtnSave.setEnabled(false);
        db.setDatabase("findmycareer");
        db.setHost("localhost");
        db.setPassword("");
        db.setPort("3306");
        db.setUser("root");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dgConfirm = new javax.swing.JDialog();
        lblRegister1 = new javax.swing.JLabel();
        LblPhone1 = new javax.swing.JLabel();
        LblDob1 = new javax.swing.JLabel();
        btnEditDet = new javax.swing.JButton();
        btnConfirmReg = new javax.swing.JButton();
        LblEmail1 = new javax.swing.JLabel();
        LblFirstName1 = new javax.swing.JLabel();
        LblSurname1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        LblRegister = new javax.swing.JLabel();
        LblFirstName = new javax.swing.JLabel();
        TxtDob = new javax.swing.JTextField();
        LblSurname = new javax.swing.JLabel();
        TxtPhone = new javax.swing.JTextField();
        TxtFirstName = new javax.swing.JTextField();
        LblConfirmPassword = new javax.swing.JLabel();
        TxtSurname = new javax.swing.JTextField();
        LblPhone = new javax.swing.JLabel();
        BtnSave = new javax.swing.JButton();
        LblDob = new javax.swing.JLabel();
        btnCancelReg = new javax.swing.JButton();
        LblPassword = new javax.swing.JLabel();
        TxtConfirmPassword = new javax.swing.JPasswordField();
        LblEmail = new javax.swing.JLabel();
        LblUserName = new javax.swing.JLabel();
        TxtUserName = new javax.swing.JTextField();

        dgConfirm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dgConfirm.setAlwaysOnTop(true);
        dgConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dgConfirm.setMinimumSize(new java.awt.Dimension(500, 400));

        lblRegister1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRegister1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister1.setText("Register");

        LblPhone1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblPhone1.setText("Phone");

        LblDob1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblDob1.setText("Date of Birth");

        btnEditDet.setText("Edit Details");
        btnEditDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDetActionPerformed(evt);
            }
        });

        btnConfirmReg.setText("Confirm");
        btnConfirmReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmRegActionPerformed(evt);
            }
        });

        LblEmail1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblEmail1.setText("Email");

        LblFirstName1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblFirstName1.setText("First Name");

        LblSurname1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblSurname1.setText("Last Name");

        txtFirstName.setEditable(false);

        txtLastName.setEditable(false);

        txtDob.setEditable(false);

        txtPhone.setEditable(false);

        txtEmail.setEditable(false);

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUserName.setText("User Name");

        txtUserName.setEditable(false);

        javax.swing.GroupLayout dgConfirmLayout = new javax.swing.GroupLayout(dgConfirm.getContentPane());
        dgConfirm.getContentPane().setLayout(dgConfirmLayout);
        dgConfirmLayout.setHorizontalGroup(
            dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dgConfirmLayout.createSequentialGroup()
                .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dgConfirmLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dgConfirmLayout.createSequentialGroup()
                                .addComponent(btnEditDet)
                                .addGap(18, 18, 18)
                                .addComponent(btnConfirmReg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dgConfirmLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblPhone1)
                                .addComponent(LblEmail1)
                                .addComponent(LblSurname1)
                                .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LblFirstName1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(LblDob1))
                        .addGap(42, 42, 42)
                        .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtDob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        dgConfirmLayout.setVerticalGroup(
            dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dgConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegister1)
                .addGap(25, 25, 25)
                .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(22, 22, 22)
                .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblFirstName1))
                .addGap(22, 22, 22)
                .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSurname1))
                .addGap(22, 22, 22)
                .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDob1))
                .addGap(22, 22, 22)
                .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPhone1))
                .addGap(22, 22, 22)
                .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEmail1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(dgConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditDet)
                    .addComponent(btnConfirmReg))
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmailActionPerformed(evt);
            }
        });
        TxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtEmailKeyTyped(evt);
            }
        });

        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });
        TxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPasswordKeyTyped(evt);
            }
        });

        LblRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblRegister.setText("Register");

        LblFirstName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblFirstName.setText("First Name");

        TxtDob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDobKeyTyped(evt);
            }
        });

        LblSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblSurname.setText("Last Name");

        TxtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPhoneActionPerformed(evt);
            }
        });
        TxtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPhoneKeyTyped(evt);
            }
        });

        TxtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFirstNameActionPerformed(evt);
            }
        });
        TxtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFirstNameKeyTyped(evt);
            }
        });

        LblConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblConfirmPassword.setText("Confirm Password");

        TxtSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSurnameKeyTyped(evt);
            }
        });

        LblPhone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblPhone.setText("Phone");

        BtnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        LblDob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblDob.setText("Date of Birth");

        btnCancelReg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelReg.setText("Cancel");
        btnCancelReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRegActionPerformed(evt);
            }
        });

        LblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblPassword.setText("Password");

        TxtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtConfirmPasswordActionPerformed(evt);
            }
        });
        TxtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtConfirmPasswordKeyTyped(evt);
            }
        });

        LblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblEmail.setText("Email");

        LblUserName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblUserName.setText("User Name");
        LblUserName.setToolTipText("");

        TxtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtUserNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(LblFirstName)
                                            .addGap(45, 45, 45))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LblUserName)
                                            .addGap(44, 44, 44)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblPhone)
                                        .addGap(49, 49, 49)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtPhone)
                                    .addComponent(TxtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(TxtUserName))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblEmail)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(TxtEmail))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                        .addComponent(btnCancelReg, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblSurname)
                                .addGap(59, 59, 59)
                                .addComponent(TxtSurname))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblConfirmPassword)
                                    .addComponent(LblDob))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDob)
                                    .addComponent(TxtConfirmPassword)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(LblRegister)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(LblUserName)
                    .addComponent(TxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDob)
                    .addComponent(TxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPhone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblConfirmPassword)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSave)
                    .addComponent(btnCancelReg))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private boolean fieldsFull()
     {
      boolean makeVisible = false;
      String password = TxtPassword.getText();
      String confPassword = TxtConfirmPassword.getText();
     
      makeVisible = !(TxtFirstName.getText().equals("") || (TxtSurname.getText().equals("")) || (TxtDob.getText().equals("")) || 
              (TxtEmail.getText().equals("")) || (TxtPhone.getText().equals("")) || (password.equals(""))
              || (confPassword.equals("")) || (TxtUserName.getText().equals("")));
      return makeVisible; 
              
     }
     
    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        
        
        String firstName = this.TxtFirstName.getText();
        this.txtFirstName.setText(firstName);
        
        String lastName = this.TxtSurname.getText();
        this.txtLastName.setText(lastName);
        
        String dob = this.TxtDob.getText();
        this.txtDob.setText(dob);
        
        String phone = this.TxtPhone.getText();
        this.txtPhone.setText(phone);
        
        String email = this.TxtEmail.getText();
        this.txtEmail.setText(email);
        
        String userName = this.TxtUserName.getText();
        this.txtUserName.setText(userName);
        
        String password = TxtPassword.getText();
        String confPassword = TxtConfirmPassword.getText();
        
        
        if (!confPassword.equals(password)){
            String message = "The passwords don't match.";
            msgbox.setMessage(message);
            msgbox.setTitle("Error");
            msgbox.setMsgBoxType("info");
            msgbox.popUpMsgBox();
        
        } else {
            this.setVisible(false);
            this.dgConfirm.setVisible(true);
        }
      

    }//GEN-LAST:event_BtnSaveActionPerformed

    private void btnCancelRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRegActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        if (frmLogin == null){
            frmLogin = new FrmLogin();
            
            frmLogin.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelRegActionPerformed

    private void btnEditDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDetActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
        this.dgConfirm.dispose();
    }//GEN-LAST:event_btnEditDetActionPerformed

    private void btnConfirmRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmRegActionPerformed
        // TODO add your handling code here:
        String userName = this.txtUserName.getText();
        String firstName = this.txtFirstName.getText();       
        String lastName = this.txtLastName.getText();     
        String dob = this.txtDob.getText();       
        String phone = this.txtPhone.getText();       
        String email = this.txtEmail.getText();
        String password = TxtPassword.getText();
        String userType = "TYPE02";
//        String date = dateFormat.format(date);
         
        
        
        this.dgConfirm.dispose();
        this.setVisible(false);
        if (frmLogin == null){
            frmLogin = new FrmLogin();

            frmLogin.setVisible(true);
        }
       
        try {
            con = db.getConnection();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
        
        try {
            String query = "INSERT INTO user (userName, password, firstName, lastName, dob, phone, email, codUserType)"
                    + " VALUES ('"+userName+"','"+password+"','"+firstName+"','"+lastName+"','"+dob+"','"+phone+"','"+email+"','"+userType+"')";
            statement = con.prepareStatement(query);
            statement.execute();
            
//            while(rs.next())
//            {
//                register = rs.getString("userName");
//                System.out.println(userName);
//            }
            statement.close();
            
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnConfirmRegActionPerformed

    private void TxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailActionPerformed

    private void TxtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFirstNameActionPerformed

    private void TxtFirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFirstNameKeyTyped
        // TODO add your handling code here:
        BtnSave.setEnabled(fieldsFull());
    }//GEN-LAST:event_TxtFirstNameKeyTyped

    private void TxtSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSurnameKeyTyped
        // TODO add your handling code here:
        BtnSave.setEnabled(fieldsFull());
    }//GEN-LAST:event_TxtSurnameKeyTyped

    private void TxtDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDobKeyTyped
        // TODO add your handling code here:
        BtnSave.setEnabled(fieldsFull());
    }//GEN-LAST:event_TxtDobKeyTyped

    private void TxtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneActionPerformed

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordActionPerformed

    private void TxtConfirmPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtConfirmPasswordKeyTyped
        // TODO add your handling code here:        
        BtnSave.setEnabled(fieldsFull());               
    }//GEN-LAST:event_TxtConfirmPasswordKeyTyped

    private void TxtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtConfirmPasswordActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_TxtConfirmPasswordActionPerformed

    private void TxtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEmailKeyTyped
        // TODO add your handling code here:
        BtnSave.setEnabled(fieldsFull()); 
    }//GEN-LAST:event_TxtEmailKeyTyped

    private void TxtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPhoneKeyTyped
        // TODO add your handling code here:
        BtnSave.setEnabled(fieldsFull()); 
    }//GEN-LAST:event_TxtPhoneKeyTyped

    private void TxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPasswordKeyTyped
        // TODO add your handling code here:
        BtnSave.setEnabled(fieldsFull()); 
    }//GEN-LAST:event_TxtPasswordKeyTyped

    private void TxtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUserNameKeyTyped
        // TODO add your handling code here:
        BtnSave.setEnabled(fieldsFull()); 
    }//GEN-LAST:event_TxtUserNameKeyTyped

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegister().setVisible(true);
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
    private javax.swing.JLabel LblUserName;
    private javax.swing.JPasswordField TxtConfirmPassword;
    private javax.swing.JTextField TxtDob;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtFirstName;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtPhone;
    private javax.swing.JTextField TxtSurname;
    private javax.swing.JTextField TxtUserName;
    private javax.swing.JButton btnCancelReg;
    private javax.swing.JButton btnConfirmReg;
    private javax.swing.JButton btnEditDet;
    private javax.swing.JDialog dgConfirm;
    private javax.swing.JLabel lblRegister1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
