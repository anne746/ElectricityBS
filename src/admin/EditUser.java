/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.swing.JOptionPane;


public class EditUser extends javax.swing.JFrame {

    private int userId; // Add this field to store the user ID to update

    /**
     * Creates new form EditUser
     */
    public EditUser() {
        initComponents();
    }

    public void loadUser(int userId) {
        try (java.sql.Connection con = config.connectDB.getConnection()) {
            String query = "SELECT firstname, lastname, email, username, role FROM users WHERE id = ?";
            java.sql.PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, userId);
            java.sql.ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                firstnamefield.setText(rs.getString("firstname"));
                lastnamefield.setText(rs.getString("lastname"));
                emailfield.setText(rs.getString("email"));
                usernamefield.setText(rs.getString("username"));
                rolecombobox.setSelectedItem(rs.getString("role"));
                this.userId = userId;
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "User not found.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading user: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
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
        jLabel1 = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rolecombobox = new javax.swing.JComboBox<>();
        lastnamefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        updateUser = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

        firstnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        firstnamefield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel1.add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Role");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        rolecombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rolecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "User", "Admin", " " }));
        rolecombobox.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel1.add(rolecombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 160, 40));

        lastnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        lastnamefield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel1.add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        emailfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        emailfield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel1.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        updateUser.setBackground(new java.awt.Color(46, 134, 222));
        updateUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateUser.setText("Update");
        updateUser.setBorder(null);
        updateUser.setPreferredSize(new java.awt.Dimension(350, 40));
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });
        jPanel1.add(updateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 310, -1));

        passwordfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        passwordfield.setEnabled(false);
        passwordfield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel1.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        usernamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        usernamefield.setEnabled(false);
        usernamefield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel1.add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 160, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
         // Get updated user input
        String firstName = firstnamefield.getText().trim();
        String lastName = lastnamefield.getText().trim();
        String email = emailfield.getText().trim();
        String role = (String) rolecombobox.getSelectedItem();

        // Basic validation
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || role.equals("Select Role")) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields and select a role.");
            return;
        }

        // Email format validation (simple regex)
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.");
            return;
        }

        try {
            // Assume userId is available from the selected user to edit

            // Update user in the database (excluding username and password)
            String query = "UPDATE users SET firstname = ?, lastname = ?, email = ?, role = ? WHERE id = ?";
            java.sql.Connection con = new config.connectDB().getConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setString(4, role);
            pst.setInt(5, userId);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "User updated successfully.");

            // Log the update action
            int currentUserId = config.usersession.getInstance().getId();
            admin.ActionLogger.logAction(currentUserId, "Updated user info for user ID: " + userId);

            this.dispose(); // Close the update form
        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating user: " + e.getMessage());
        }
    }//GEN-LAST:event_updateUserActionPerformed

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
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailfield;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JComboBox<String> rolecombobox;
    private javax.swing.JButton updateUser;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
