/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import GUI.Login;
import config.usersession;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static user.UserDashboard.logAction;


public class Profile extends javax.swing.JFrame {

  

    public Profile() {
        initComponents();
        loadUserData();
    }

    private void loadUserData() {
        usersession session = usersession.getInstance();
        idfield.setText(String.valueOf(session.getId()));
        firstnamefield.setText(session.getFirstname());
        lastnamefield.setText(session.getLastname());
        emailfield.setText(session.getEmail());
        addressfield.setText(session.getAddress());
        String status = session.getStatus();
        statuslabe.setText(status);
        accnumfield.setText(session.getAccNum());
        if (status != null && status.equalsIgnoreCase("Active")) {
            statuslabe.setForeground(new java.awt.Color(0, 204, 0)); // green
        } else {
            statuslabe.setForeground(new java.awt.Color(255, 0, 0)); // red
        }
        
        // Display profile image if available
        String imagePath = session.getImage();
        if (imagePath != null && !imagePath.isEmpty()) {
            try {
                config.profile prof = new config.profile();
                profile.setIcon(prof.ResizeImage(imagePath, null, profile));
            } catch (Exception e) {
                System.out.println("Error loading profile image: " + e.getMessage());
            }
        }
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
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        firstnamefield = new javax.swing.JTextField();
        statuslabe = new javax.swing.JLabel();
        lastnamefield = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        accnumfield = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        removeProfile = new javax.swing.JButton();
        selectProfile = new javax.swing.JButton();
        addressfield = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

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
        jLabel9.setText("Profile");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 190, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("ID");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 160, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        jPanel2.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 136, 116));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 150, 130));

        idfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        idfield.setEnabled(false);
        idfield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel3.add(idfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 180, -1));

        firstnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        firstnamefield.setEnabled(false);
        firstnamefield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel3.add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 180, -1));

        statuslabe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        statuslabe.setForeground(new java.awt.Color(0, 204, 0));
        statuslabe.setText("Active");
        jPanel3.add(statuslabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 60, -1));

        lastnamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        lastnamefield.setEnabled(false);
        lastnamefield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel3.add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 180, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Last Name");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 160, -1));

        emailfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        emailfield.setEnabled(false);
        emailfield.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel3.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 180, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Email");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 160, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Account Number");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 180, -1));

        accnumfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        accnumfield.setEnabled(false);
        accnumfield.setPreferredSize(new java.awt.Dimension(350, 40));
        accnumfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accnumfieldActionPerformed(evt);
            }
        });
        jPanel3.add(accnumfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 180, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("First Name");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 160, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Status:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 60, -1));

        removeProfile.setBackground(new java.awt.Color(46, 134, 222));
        removeProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeProfile.setText("Remove");
        removeProfile.setBorder(null);
        removeProfile.setPreferredSize(new java.awt.Dimension(350, 40));
        removeProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProfileActionPerformed(evt);
            }
        });
        jPanel3.add(removeProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 90, -1));

        selectProfile.setBackground(new java.awt.Color(46, 134, 222));
        selectProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectProfile.setText("Select");
        selectProfile.setBorder(null);
        selectProfile.setPreferredSize(new java.awt.Dimension(350, 40));
        selectProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProfileActionPerformed(evt);
            }
        });
        jPanel3.add(selectProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 90, -1));

        addressfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        addressfield.setEnabled(false);
        addressfield.setPreferredSize(new java.awt.Dimension(350, 40));
        addressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfieldActionPerformed(evt);
            }
        });
        jPanel3.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 180, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Address");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 160, -1));

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
      logAction("User logged out");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_profilebtnMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {
        
    }

    private void updateUserImagePath(int userId, String imagePath) {
        String sql = "UPDATE users SET image = ? WHERE id = ?";
        try (Connection conn = config.connectDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, imagePath);
            pstmt.setInt(2, userId);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error updating user image path in database: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error updating database: " + e.getMessage());
        }
    }

    private void profilebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnMouseEntered
        profilebtn.setBackground(hoverColor);
    }//GEN-LAST:event_profilebtnMouseEntered

    private void profilebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnMouseExited
        profilebtn.setBackground(defaultColor);
    }//GEN-LAST:event_profilebtnMouseExited

    private void settingsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseClicked
       new Settings().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_settingsbtnMouseClicked

    private void settingsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseEntered
        settingsbtn.setBackground(hoverColor);
    }//GEN-LAST:event_settingsbtnMouseEntered

    private void settingsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseExited
        settingsbtn.setBackground(defaultColor);
    }//GEN-LAST:event_settingsbtnMouseExited

    private void selectProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProfileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif"));
        
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                String fileName = selectedFile.getName();
                String destination = "src/images/" + fileName;
                String path = selectedFile.getAbsolutePath();

                config.profile prof = new config.profile();

                // Set the image icon
                profile.setIcon(prof.ResizeImage(path, null, profile));
                
                // Copy the file to the destination
                prof.imageUpdater(destination, path);

                // Update user's image path in database and session
                config.usersession session = config.usersession.getInstance();
                
                // Update image path in database
                updateUserImagePath(session.getId(), destination);
                
                // Update session
                session.setImage(destination);

                JOptionPane.showMessageDialog(this, "Profile picture updated successfully!");
            } catch (Exception ex) {
                System.out.println("File Error: " + ex.getMessage());
                JOptionPane.showMessageDialog(this, "Error updating profile picture: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_selectProfileActionPerformed

    private void removeProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProfileActionPerformed
        // Remove profile picture
        try {
            config.usersession session = config.usersession.getInstance();
            String currentImagePath = session.getImage();

            // Remove image icon from label and set default profile image
            config.profile prof = new config.profile();
            String defaultImagePath = "src/images/logor.png";
            profile.setIcon(prof.ResizeImage(defaultImagePath, null, profile));

            // Update database to remove image path
            String sql = "UPDATE users SET image = NULL WHERE id = ?";
            try (Connection conn = config.connectDB.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, session.getId());
                pstmt.executeUpdate();
            }

            // Update session image path
            session.setImage(null);

            // Optionally delete the image file if it exists and is not default
            if (currentImagePath != null && !currentImagePath.isEmpty() && !currentImagePath.equals(defaultImagePath)) {
                File imageFile = new File(currentImagePath);
                if (imageFile.exists() && imageFile.isFile()) {
                    imageFile.delete();
                }
            }

            JOptionPane.showMessageDialog(this, "Profile picture removed successfully!");
        } catch (Exception e) {
            System.out.println("Error removing profile picture: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error removing profile picture: " + e.getMessage());
        }
    }//GEN-LAST:event_removeProfileActionPerformed

    private void accnumfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accnumfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accnumfieldActionPerformed

    private void addressfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressfieldActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnumfield;
    private javax.swing.JTextField addressfield;
    private javax.swing.JPanel billsbtn;
    private javax.swing.JTextField emailfield;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JPanel homebtn;
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JPanel logoutbtn;
    private javax.swing.JLabel profile;
    private javax.swing.JPanel profilebtn;
    private javax.swing.JButton removeProfile;
    private javax.swing.JButton selectProfile;
    private javax.swing.JPanel settingsbtn;
    private javax.swing.JLabel statuslabe;
    // End of variables declaration//GEN-END:variables
}
