/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import GUI.Login;
import config.connectDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Logs extends javax.swing.JFrame {

    /**
     * Creates new form Logs
     */
    connectDB db = new connectDB();
    Color defaultColor = Color.decode("#2c3e50");
    Color hoverColor = Color.decode("#34495e");

    /**
     * Creates new form Logs
     */
    public Logs() {
        initComponents();
        loadLogs();
    }

    private void loadLogs() {
        String query = "SELECT logs.logID, users.username, logs.action, logs.date_time FROM logs LEFT JOIN users ON logs.userID = users.id ORDER BY logs.date_time DESC";
        try (Connection con = db.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {
            logstable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading logs: " + e.getMessage());
        }
    }

    private void searchLogs(String keyword) {
        String query = "SELECT logs.logID, users.username, logs.action, logs.date_time FROM logs LEFT JOIN users ON logs.userID = users.id WHERE " +
                "users.username LIKE ? OR logs.action LIKE ? ORDER BY logs.date_time DESC";
        try (Connection con = db.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {
            String likeKeyword = "%" + keyword + "%";
            pst.setString(1, likeKeyword);
            pst.setString(2, likeKeyword);
            try (ResultSet rs = pst.executeQuery()) {
                logstable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error searching logs: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logoutbtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userbtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        billsbtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        paymentbtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        settingsbtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        logoutbtn1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logstable = new javax.swing.JTable();
        searchfield = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        logoutbtn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 40));

        userbtn.setBackground(new java.awt.Color(44, 62, 80));
        userbtn.setForeground(new java.awt.Color(44, 62, 80));
        userbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userbtnMouseExited(evt);
            }
        });
        userbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Users");
        userbtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        userbtn.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(userbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 40));

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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bills.png"))); // NOI18N
        billsbtn.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(billsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 40));

        paymentbtn.setBackground(new java.awt.Color(44, 62, 80));
        paymentbtn.setForeground(new java.awt.Color(44, 62, 80));
        paymentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentbtnMouseExited(evt);
            }
        });
        paymentbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Payments");
        paymentbtn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment.png"))); // NOI18N
        paymentbtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(paymentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 40));

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

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        settingsbtn.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(settingsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        logoutbtn1.setBackground(new java.awt.Color(44, 62, 80));
        logoutbtn1.setForeground(new java.awt.Color(44, 62, 80));
        logoutbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutbtn1MouseExited(evt);
            }
        });
        logoutbtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Logs");
        logoutbtn1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logs.png"))); // NOI18N
        logoutbtn1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(logoutbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/powerpay-logoo.png"))); // NOI18N
        jLabel2.setText("PowerPay");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 220, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        logstable.setBackground(new java.awt.Color(255, 255, 255));
        logstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(logstable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 640, 430));

        searchfield.setBackground(new java.awt.Color(255, 255, 255));
        searchfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        searchfield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel3.add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 480, -1));

        searchbtn.setBackground(new java.awt.Color(44, 62, 80));
        searchbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search");
        searchbtn.setBorder(null);
        searchbtn.setPreferredSize(new java.awt.Dimension(350, 40));
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel3.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 110, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Logs");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 190, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void logoutbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseEntered
        logoutbtn.setBackground(hoverColor);
    }//GEN-LAST:event_logoutbtnMouseEntered

    private void logoutbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseExited
        logoutbtn.setBackground(defaultColor);
    }//GEN-LAST:event_logoutbtnMouseExited

    private void userbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userbtnMouseClicked
        new AdminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userbtnMouseClicked

    private void userbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userbtnMouseEntered
        userbtn.setBackground(hoverColor);
    }//GEN-LAST:event_userbtnMouseEntered

    private void userbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userbtnMouseExited
        userbtn.setBackground(defaultColor);
    }//GEN-LAST:event_userbtnMouseExited

    private void billsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billsbtnMouseClicked

    }//GEN-LAST:event_billsbtnMouseClicked

    private void billsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billsbtnMouseEntered
        billsbtn.setBackground(hoverColor);
    }//GEN-LAST:event_billsbtnMouseEntered

    private void billsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billsbtnMouseExited
        billsbtn.setBackground(defaultColor);
    }//GEN-LAST:event_billsbtnMouseExited

    private void paymentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentbtnMouseClicked

    private void paymentbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentbtnMouseEntered
        paymentbtn.setBackground(hoverColor);
    }//GEN-LAST:event_paymentbtnMouseEntered

    private void paymentbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentbtnMouseExited
        paymentbtn.setBackground(defaultColor);
    }//GEN-LAST:event_paymentbtnMouseExited

    private void settingsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsbtnMouseClicked

    private void settingsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseEntered
        settingsbtn.setBackground(hoverColor);
    }//GEN-LAST:event_settingsbtnMouseEntered

    private void settingsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseExited
        settingsbtn.setBackground(defaultColor);
    }//GEN-LAST:event_settingsbtnMouseExited

    private void logoutbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtn1MouseClicked
         new Login().setVisible(true);
    }//GEN-LAST:event_logoutbtn1MouseClicked

    private void logoutbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtn1MouseEntered

    private void logoutbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtn1MouseExited

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String searchText = searchfield.getText().trim();
        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter search text.");
            return;
        }
        searchLogs(searchText);
    }//GEN-LAST:event_searchbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel billsbtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoutbtn;
    private javax.swing.JPanel logoutbtn1;
    private javax.swing.JTable logstable;
    private javax.swing.JPanel paymentbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchfield;
    private javax.swing.JPanel settingsbtn;
    private javax.swing.JPanel userbtn;
    // End of variables declaration//GEN-END:variables
}
