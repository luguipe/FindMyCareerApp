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
 * @author Yusef
 */
public class FrmLogin extends javax.swing.JFrame {
    FrmRegister frmRegister;
    FrmUserMain frmUserMain;
    String userName = null;
    String password = null;
    private static String id; //Access for Gui
    private static String userType; //Access for Jak - These are static so FrmUserMain can access it - Jak

    Database db = new Database();
    Connection con;
    PreparedStatement statement;
    ResultSet rs;
    PopUpMsgBox msgbox = new PopUpMsgBox();
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    /**
     * Creates new form FrmLogin1
     */
    public FrmLogin() {
        initComponents();
        db.setDatabase("findmycareer");
        db.setHost("localhost");
        db.setPassword("");
        db.setPort("3306");
        db.setUser("root");
        
        
    }

        //METHODS
    public static String getUserType() //Method for FrmUserMain to access the variable - Jak
    {
        return userType;
    }
    
    public static String getUserID()
    {
        return id;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtUserId = new javax.swing.JTextField();
        LblLogin = new javax.swing.JLabel();
        TxtPassword = new javax.swing.JPasswordField();
        BtnRegister = new javax.swing.JButton();
        LblUserId = new javax.swing.JLabel();
        LblPassword = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblLogin.setText("Login");

        BtnRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRegister.setText("Register");
        BtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisterActionPerformed(evt);
            }
        });

        LblUserId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblUserId.setText("User Identification");

        LblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblPassword.setText("Password");

        BtnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblUserId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TxtPassword)
                            .addComponent(TxtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(LblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblUserId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPassword)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegister)
                    .addComponent(BtnLogin))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisterActionPerformed
        // Opens Register window
        this.setVisible(false);
        if (frmRegister == null){
            frmRegister = new FrmRegister();
            
            frmRegister.setVisible(true);
        }
    }//GEN-LAST:event_BtnRegisterActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        //Get the information from the database to login into the application 
        
        userName = this.TxtUserId.getText();
        password = this.TxtPassword.getText(); 
        
        String lastLogin = dateFormat.format(date);
        
        String user = null;
        String pass = null;
        
        
        try {
            con = db.getConnection();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //Gets username
        try {
            String query = "SELECT userName FROM user WHERE userName='"+userName+"'";
            statement = con.prepareStatement(query);
            rs = statement.executeQuery();
            
            while(rs.next())
            {
                user = rs.getString("userName");
            }
            statement.close();
            rs.close();
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //Get UserID
        try {
            String query = "SELECT userID FROM user WHERE userName='"+userName+"'";
            statement = con.prepareStatement(query);
            rs = statement.executeQuery();
            
            while(rs.next())
            {
                id = rs.getString("userID");
            }
            statement.close();
            rs.close();
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //Gets password
        try {
            String query = "SELECT password FROM user WHERE userID='"+id+"'";
            statement = con.prepareStatement(query);
            rs = statement.executeQuery();
            
            while(rs.next()){
                pass = rs.getString("password");
            }
            statement.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //Gets userType
       try {
            String query = "SELECT codUserType FROM user WHERE userID='"+id+"'";
            statement = con.prepareStatement(query);
            rs = statement.executeQuery();
            
            while(rs.next()){
                userType = rs.getString("codUserType");
            }
            statement.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
       //Update last login date
       try {
            String query = "UPDATE user SET lastLogIn = '"+lastLogin+"' WHERE userName='"+userName+"' ";
            statement = con.prepareStatement(query);
            statement.execute();
                        
            statement.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
       
        //If User name and password match with the information from the database, logs in and opens the User Main window
        if(userName.equals(user) && password.equals(pass) && id.equals(id)){
            this.setVisible(false);
            
            frmUserMain = new FrmUserMain();            
            frmUserMain.setVisible(true);
        //if not, pops up an error message 
        }else {
            String message = "The username/password is incorrect.";
            msgbox.setMessage(message);
            msgbox.setTitle("Error");
            msgbox.setMsgBoxType("info");
            msgbox.popUpMsgBox();      
        }
        
    }//GEN-LAST:event_BtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnRegister;
    private javax.swing.JLabel LblLogin;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblUserId;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtUserId;
    // End of variables declaration//GEN-END:variables
}
