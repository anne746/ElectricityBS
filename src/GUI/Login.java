/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import config.connectDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author manny
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        to_register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 206, 203));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(134, 206, 203));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 36), new java.awt.Color(19, 122, 127))); // NOI18N
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, 30));

        usernameField.setBackground(new java.awt.Color(190, 200, 209));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 30));

        passwordField.setBackground(new java.awt.Color(190, 200, 209));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, 30));

        loginButton.setBackground(new java.awt.Color(19, 122, 127));
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("New User?");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 60, -1));

        to_register.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        to_register.setForeground(new java.awt.Color(0, 0, 204));
        to_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        to_register.setText("Click here to Register");
        to_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                to_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                to_registerMouseExited(evt);
            }
        });
        jPanel2.add(to_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(180, 20, 370, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void to_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_registerMouseClicked
        new Register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_to_registerMouseClicked

    private void to_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_registerMouseEntered

    }//GEN-LAST:event_to_registerMouseEntered

    private void to_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_registerMouseExited

    }//GEN-LAST:event_to_registerMouseExited

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and password cannot be empty.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        connectDB con = new connectDB();
        Connection cn = con.getConnection(); 

        String sql = "SELECT password, role FROM users WHERE username = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, username); 
            ResultSet rs = pst.executeQuery();

            if (rs.next()) { 
                String storedPassword = rs.getString("password");

                if (storedPassword.equals(password)) {  
                    JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    String userType = rs.getString("role");
                    if(userType.equals("Admin")){
                        new AdminDashboard().setVisible(true);
                    }else if(userType.equals("User")){
                        new UserDashboard().setVisible(true);
                    }
                    
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect password.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Username not found.", "Login Error", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            pst.close();
            cn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel to_register;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
