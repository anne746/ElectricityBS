/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import config.connectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author manny
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
         setTitle("Electric Bill System");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        loginbtn = new javax.swing.JLabel();
        registerbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        lastnamefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addressfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        adaw = new javax.swing.JLabel();
        rolecombobox = new javax.swing.JComboBox<>();
        usernamefield1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        accnumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        secretanswer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(244, 246, 249));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Account");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 900, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("First Name");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        firstnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        firstnamefield.setPreferredSize(new java.awt.Dimension(350, 40));
        bg.add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        loginbtn.setBackground(new java.awt.Color(46, 134, 222));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(46, 134, 222));
        loginbtn.setText("Login");
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        bg.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, -1));

        registerbtn.setBackground(new java.awt.Color(46, 134, 222));
        registerbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerbtn.setText("Register");
        registerbtn.setBorder(null);
        registerbtn.setPreferredSize(new java.awt.Dimension(350, 40));
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });
        bg.add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Already have an account?");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        passwordfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        passwordfield.setPreferredSize(new java.awt.Dimension(350, 40));
        bg.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        lastnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        lastnamefield.setPreferredSize(new java.awt.Dimension(350, 40));
        bg.add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        addressfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        addressfield.setPreferredSize(new java.awt.Dimension(350, 40));
        bg.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        emailfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        emailfield.setPreferredSize(new java.awt.Dimension(350, 40));
        bg.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Role");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        adaw.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adaw.setText("What's your first pet's name?");
        bg.add(adaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        rolecombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rolecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "User", "Admin", " " }));
        rolecombobox.setPreferredSize(new java.awt.Dimension(350, 40));
        bg.add(rolecombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 350, 40));

        usernamefield1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        usernamefield1.setPreferredSize(new java.awt.Dimension(350, 40));
        bg.add(usernamefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Username");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        accnumber.setText("ex. 1234567890");
        accnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        accnumber.setPreferredSize(new java.awt.Dimension(350, 40));
        accnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accnumberActionPerformed(evt);
            }
        });
        bg.add(accnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Email");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        secretanswer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        secretanswer.setPreferredSize(new java.awt.Dimension(350, 40));
        secretanswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretanswerActionPerformed(evt);
            }
        });
        bg.add(secretanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Customer Account Number");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
      new Login().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_loginbtnMouseClicked

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        String firstname = firstnamefield.getText().trim();
        String lastname = lastnamefield.getText().trim();
        String address = addressfield.getText().trim();
        String username = usernamefield1.getText().trim();
        String email = emailfield.getText().trim();
        String password = new String(passwordfield.getPassword()).trim();
        String role = (String) rolecombobox.getSelectedItem();
        String acc_number = accnumber.getText().trim();
        String secretans = secretanswer.getText().trim();
        
        if (firstname.isEmpty() || lastname.isEmpty() || address.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || role == null || role.equals("Select Role") || secretans.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields and select a valid role.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(acc_number.length()>10){
            JOptionPane.showMessageDialog(this, "Account Number must be only 10 characters long.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (isDuplicate("email", email)) {
            JOptionPane.showMessageDialog(this, "Email already exists.", "Duplicate Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isDuplicate("username", username)) {
            JOptionPane.showMessageDialog(this, "Username already exists.", "Duplicate Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isDuplicate("account_number", acc_number)) {
            JOptionPane.showMessageDialog(this, "Account Number already exists.", "Duplicate Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        connectDB db = new connectDB();
        try (Connection conn = config.connectDB.getConnection()) {
            // Check if username or email already exists using prepared statement
            String checkSql = "SELECT * FROM users WHERE username = ? OR email = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
                checkStmt.setString(1, username);
                checkStmt.setString(2, email);
                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Username or email already exists.", "Registration Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            // Hash the password before storing
            String hashedPassword = config.connectDB.hashPassword(password);
            String hashedsecretans = config.connectDB.hashPassword(secretans);
            // Insert new user using prepared statement
            String insertSql = "INSERT INTO users (firstname, lastname, address, username, email, role, password, status, image, account_number, recovery_phrase) VALUES (?, ?, ?, ?, ?, ?, ?, 'Pending', ?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                insertStmt.setString(1, firstname);
                insertStmt.setString(2, lastname);
                insertStmt.setString(3, address);
                insertStmt.setString(4, username);
                insertStmt.setString(5, email);
                insertStmt.setString(6, role);
                insertStmt.setString(7, hashedPassword);
                insertStmt.setString(8, "src/images/logor.png");
                insertStmt.setString(9, acc_number);
                insertStmt.setString(10, hashedsecretans);

                int result = insertStmt.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Registration successful! Your account is pending approval.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Login().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error during registration: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerbtnActionPerformed
    Connection conn = config.connectDB.getConnection();
    public boolean isDuplicate(String column, String value) {
        String query = "SELECT COUNT(*) FROM users WHERE " + column + " = ?";
        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, value);
            ResultSet rs = pst.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void accnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accnumberActionPerformed

    private void secretanswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secretanswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secretanswerActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnumber;
    private javax.swing.JLabel adaw;
    private javax.swing.JTextField addressfield;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField emailfield;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JLabel loginbtn;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JButton registerbtn;
    private javax.swing.JComboBox<String> rolecombobox;
    private javax.swing.JTextField secretanswer;
    private javax.swing.JTextField usernamefield1;
    // End of variables declaration//GEN-END:variables
}
