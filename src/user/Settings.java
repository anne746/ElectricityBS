/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import GUI.Login;
import static admin.AdminDashboard.logAction;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.awt.Color;
import config.usersession;
import config.connectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import config.connectDB;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form settings
     */
    public Settings() {
        initComponents();
    }
    
        Color defaultColor = Color.decode("#2c3e50");
        Color hoverColor = Color.decode("#34495e");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logoutbtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        homebtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        billsbtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        profilebtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        settingsbtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        newpasswordfield = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        oldpasswordfield = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        confirmpassfield = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        changepassbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(244, 246, 249));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbtn.setBackground(new java.awt.Color(44, 62, 80));
        logoutbtn.setForeground(new java.awt.Color(44, 62, 80));
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutbtnMouseExited(evt);
            }
        });
        logoutbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Logout");
        logoutbtn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutbtn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 40));

        homebtn.setBackground(new java.awt.Color(44, 62, 80));
        homebtn.setForeground(new java.awt.Color(44, 62, 80));
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homebtnMouseExited(evt);
            }
        });
        homebtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home");
        homebtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homebtn.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 40));

        billsbtn.setBackground(new java.awt.Color(44, 62, 80));
        billsbtn.setForeground(new java.awt.Color(44, 62, 80));
        billsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billsbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billsbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billsbtnMouseExited(evt);
            }
        });
        billsbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bills");
        billsbtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bills.png"))); // NOI18N
        billsbtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(billsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 40));

        profilebtn.setBackground(new java.awt.Color(44, 62, 80));
        profilebtn.setForeground(new java.awt.Color(44, 62, 80));
        profilebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profilebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profilebtnMouseExited(evt);
            }
        });
        profilebtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Profile");
        profilebtn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        profilebtn.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(profilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 40));

        settingsbtn.setBackground(new java.awt.Color(44, 62, 80));
        settingsbtn.setForeground(new java.awt.Color(44, 62, 80));
        settingsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsbtnMouseExited(evt);
            }
        });
        settingsbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Settings");
        settingsbtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        settingsbtn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(settingsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/powerpay-logoo.png"))); // NOI18N
        jLabel2.setText("PowerPay");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 220, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Settings");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 190, 70));

        newpasswordfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        newpasswordfield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel3.add(newpasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("New Password");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        oldpasswordfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        oldpasswordfield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel3.add(oldpasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Old Password");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        confirmpassfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        confirmpassfield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel3.add(confirmpassfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Confirm Password");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        changepassbtn1.setBackground(new java.awt.Color(0, 0, 0));
        changepassbtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        changepassbtn1.setText("Change");
        changepassbtn1.setBorder(null);
        changepassbtn1.setPreferredSize(new java.awt.Dimension(350, 40));
        
        changepassbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassbtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(changepassbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
      new Login().setVisible(true);
        logAction("User logged out");
        this.dispose();
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void logoutbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseEntered
        logoutbtn.setBackground(hoverColor);
    }//GEN-LAST:event_logoutbtnMouseEntered

    private void logoutbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseExited
        logoutbtn.setBackground(defaultColor);
    }//GEN-LAST:event_logoutbtnMouseExited

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
      new UserDashboard().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

    private void homebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseEntered
        homebtn.setBackground(hoverColor);
    }//GEN-LAST:event_homebtnMouseEntered

    private void homebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseExited
        homebtn.setBackground(defaultColor);
    }//GEN-LAST:event_homebtnMouseExited

    private void billsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billsbtnMouseClicked
        new UserBills().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_billsbtnMouseClicked

    private void billsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billsbtnMouseEntered
        billsbtn.setBackground(hoverColor);
    }//GEN-LAST:event_billsbtnMouseEntered

    private void billsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billsbtnMouseExited
        billsbtn.setBackground(defaultColor);
    }//GEN-LAST:event_billsbtnMouseExited

    private void profilebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnMouseClicked
         new Profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilebtnMouseClicked

    private void profilebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnMouseEntered
        profilebtn.setBackground(hoverColor);
    }//GEN-LAST:event_profilebtnMouseEntered

    private void profilebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnMouseExited
        profilebtn.setBackground(defaultColor);
    }//GEN-LAST:event_profilebtnMouseExited

    private void settingsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseClicked
       this.setVisible(true);
    }//GEN-LAST:event_settingsbtnMouseClicked

    private void settingsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseEntered
        settingsbtn.setBackground(hoverColor);
    }//GEN-LAST:event_settingsbtnMouseEntered

    private void settingsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseExited
        settingsbtn.setBackground(defaultColor);
    }//GEN-LAST:event_settingsbtnMouseExited

    private void changepassbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassbtn1ActionPerformed
        try {
            String oldPassRaw = new String(oldpasswordfield.getPassword()).trim();
            String newPassRaw = new String(newpasswordfield.getPassword()).trim();
            String confirmPassRaw = new String(confirmpassfield.getPassword()).trim();

            if (oldPassRaw.isEmpty() || newPassRaw.isEmpty() || confirmPassRaw.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (newPassRaw.length() < 8) {
                JOptionPane.showMessageDialog(this, "New password must be at least 8 characters.", "Password Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!newPassRaw.equals(confirmPassRaw)) {
                JOptionPane.showMessageDialog(this, "New password and confirmation do not match.", "Mismatch Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String oldPassHashed = config.connectDB.hashPassword(oldPassRaw);
            String newPassHashed = config.connectDB.hashPassword(newPassRaw);

            usersession session = usersession.getInstance();

            // Query current password hash from database
            Connection conn = connectDB.getConnection();
            String selectQuery = "SELECT password FROM tbl_user WHERE user_id = ?";
            PreparedStatement selectPst = conn.prepareStatement(selectQuery);
            selectPst.setInt(1, session.getId());
            ResultSet rs = selectPst.executeQuery();

            if (rs.next()) {
                String currentHashedPass = rs.getString("password");

                if (!oldPassHashed.equals(currentHashedPass)) {
                    JOptionPane.showMessageDialog(this, "Old password is incorrect.", "Authentication Error", JOptionPane.ERROR_MESSAGE);
                    rs.close();
                    selectPst.close();
                    conn.close();
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
                rs.close();
                selectPst.close();
                conn.close();
                return;
            }
            rs.close();
            selectPst.close();

            // Update password in database
            String updateQuery = "UPDATE tbl_user SET password = ? WHERE user_id = ?";
            PreparedStatement pst = conn.prepareStatement(updateQuery);
            pst.setString(1, newPassHashed);
            pst.setInt(2, session.getId());

            int rowsUpdated = pst.executeUpdate();
            pst.close();
            conn.close();

            if (rowsUpdated > 0) {
                session.setPassword(newPassHashed);
                JOptionPane.showMessageDialog(this, "Password changed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                oldpasswordfield.setText("");
                newpasswordfield.setText("");
                confirmpassfield.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to change password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(this, "Error hashing password: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changepassbtn1ActionPerformed

    

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel billsbtn;
    private javax.swing.JButton changepassbtn1;
    private javax.swing.JPasswordField confirmpassfield;
    private javax.swing.JPanel homebtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel logoutbtn;
    private javax.swing.JPasswordField newpasswordfield;
    private javax.swing.JPasswordField oldpasswordfield;
    private javax.swing.JPanel profilebtn;
    private javax.swing.JPanel settingsbtn;
    // End of variables declaration//GEN-END:variables
}
