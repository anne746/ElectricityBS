package user;

import GUI.Login;
import config.connectDB;
import config.usersession;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class UserDashboard extends javax.swing.JFrame {

    /**
     * Creates new form UserDashboard
     */
    private config.usersession currentUserSession;

    public UserDashboard() {
        initComponents();
        welcometxt.setText("Guest");
        loadUserBills();
    }
    connectDB db = new connectDB();
    public UserDashboard(config.usersession userSession) {
        this.currentUserSession = userSession;
        initComponents();
        if (currentUserSession != null && currentUserSession.getUsername() != null) {
            welcometxt.setText(currentUserSession.getUsername());
        } else {
            welcometxt.setText("Guest");
        }
        loadUserBills();
    }
   
        Color defaultColor = Color.decode("#2c3e50");
        Color hoverColor = Color.decode("#34495e");
    public static void logAction(String action) {
        try {
            int currentUserId = config.usersession.getInstance().getId();
            System.out.println("Logging action for user ID: " + currentUserId + " Action: " + action);
            admin.ActionLogger.logAction(currentUserId, action);
            System.out.println("Action logged out successfully.");
        } catch (Exception e) {
            System.err.println("Error logging action: " + e.getMessage());
        }
    }
     private void loadUserBills() {
        usersession session = usersession.getInstance();
        int userId = session.getId();

        String query = "SELECT b.b_id, u.account_number, b.bill_month, b.kwh_used, b.amount_due, b.due_date, b.status " +
                       "FROM tbl_bill b " +
                       "JOIN users u ON b.user_id = u.id " +
                       "WHERE b.user_id = ? AND b.status = 'Pending'";

        try (Connection con = db.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            java.util.List<config.billsmodel> billsList = new java.util.ArrayList<>();
            while (rs.next()) {
                config.billsmodel bill = new config.billsmodel(
                    rs.getInt("b_id"),
                    rs.getString("account_number"),
                    rs.getString("bill_month"),
                    rs.getInt("kwh_used"),
                    rs.getDouble("amount_due"),
                    rs.getDate("due_date"),
                    rs.getString("status")
                );
                billsList.add(bill);
            }
            rs.close();

            setUserBillsTableModel(billsList);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading bills: " + e.getMessage());
        }
    }
     
    private void setUserBillsTableModel(java.util.List<config.billsmodel> billsList) {
        String[] columnNames = {"Bill ID", "Account Number", "Bill Month", "kWh Used", "Amount Due", "Due Date", "Status"};
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make table cells non-editable
            }
        };
        for (config.billsmodel bill : billsList) {
            Object[] rowData = {
                bill.getB_id(),
                bill.getAccount_number(),
                bill.getBill_month(),
                bill.getKwh_used(),
                bill.getAmount_due(),
                bill.getDue_date(),
                bill.getStatus()
            };
            model.addRow(rowData);
        }
        mybillstable.setModel(model);
    }
        
          
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
        welcometxt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mybillstable = new javax.swing.JTable();
        viewreceipt = new javax.swing.JButton();
        viewstatementofaccount = new javax.swing.JButton();
        viewpendingbills = new javax.swing.JButton();
        viewpaidbills = new javax.swing.JButton();
        paymybills = new javax.swing.JButton();

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

        welcometxt.setBackground(new java.awt.Color(0, 0, 0));
        welcometxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcometxt.setForeground(new java.awt.Color(0, 0, 0));
        welcometxt.setText("Name");
        jPanel3.add(welcometxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 60, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Welcome,");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 20));

        mybillstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(mybillstable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 640, 360));

        viewreceipt.setBackground(new java.awt.Color(44, 62, 80));
        viewreceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewreceipt.setText("Receipt");
        viewreceipt.setBorder(null);
        viewreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewreceiptActionPerformed(evt);
            }
        });
        jPanel3.add(viewreceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, 40));

        viewstatementofaccount.setBackground(new java.awt.Color(44, 62, 80));
        viewstatementofaccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewstatementofaccount.setText("Statement");
        viewstatementofaccount.setBorder(null);
        viewstatementofaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstatementofaccountActionPerformed(evt);
            }
        });
        jPanel3.add(viewstatementofaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 110, 40));

        viewpendingbills.setBackground(new java.awt.Color(44, 62, 80));
        viewpendingbills.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewpendingbills.setText("Pending Bills");
        viewpendingbills.setBorder(null);
        viewpendingbills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpendingbillsActionPerformed(evt);
            }
        });
        jPanel3.add(viewpendingbills, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 110, 40));

        viewpaidbills.setBackground(new java.awt.Color(44, 62, 80));
        viewpaidbills.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewpaidbills.setText("Paid Bills");
        viewpaidbills.setBorder(null);
        viewpaidbills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpaidbillsActionPerformed(evt);
            }
        });
        jPanel3.add(viewpaidbills, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 110, 40));

        paymybills.setBackground(new java.awt.Color(44, 62, 80));
        paymybills.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paymybills.setText("Pay Bill");
        paymybills.setBorder(null);
        paymybills.setPreferredSize(new java.awt.Dimension(350, 40));
        paymybills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymybillsActionPerformed(evt);
            }
        });
        jPanel3.add(paymybills, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 110, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnMouseClicked

    private void homebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseEntered
       homebtn.setBackground(hoverColor);
    }//GEN-LAST:event_homebtnMouseEntered

    private void homebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseExited
      homebtn.setBackground(defaultColor);
    }//GEN-LAST:event_homebtnMouseExited

    private void billsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billsbtnMouseEntered
       billsbtn.setBackground(hoverColor);
    }//GEN-LAST:event_billsbtnMouseEntered

    private void billsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billsbtnMouseClicked
       new UserBills().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_billsbtnMouseClicked

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
      new Settings().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_settingsbtnMouseClicked

    private void settingsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseEntered
        settingsbtn.setBackground(hoverColor);
    }//GEN-LAST:event_settingsbtnMouseEntered

    private void settingsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbtnMouseExited
        settingsbtn.setBackground(defaultColor);
    }//GEN-LAST:event_settingsbtnMouseExited

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

    private void viewreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewreceiptActionPerformed
        int selectedRow = mybillstable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a bill to view receipt.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String status = (String) mybillstable.getValueAt(selectedRow, 6);
        if (!"Paid".equalsIgnoreCase(status)) {
            JOptionPane.showMessageDialog(this, "Receipt is only available for paid bills.", "Invalid Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int billId = (int) mybillstable.getValueAt(selectedRow, 0);

        // Open BillsReceipt window and pass billId
        bills.BillsReceipt receiptWindow = new bills.BillsReceipt();
        receiptWindow.loadReceipt(billId);
        receiptWindow.setVisible(true);
    }//GEN-LAST:event_viewreceiptActionPerformed

    private void viewstatementofaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstatementofaccountActionPerformed
        int selectedRow = mybillstable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a bill to view statement.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String status = (String) mybillstable.getValueAt(selectedRow, 6);
        if (!"Pending".equalsIgnoreCase(status)) {
            JOptionPane.showMessageDialog(this, "Statement of Account is only available for pending bills.", "Invalid Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int billId = (int) mybillstable.getValueAt(selectedRow, 0);

        // Open StatementOfAccount window and pass billId
        bills.StatementOfAccount statementWindow = new bills.StatementOfAccount();
        statementWindow.loadStatement(billId);
        statementWindow.setVisible(true);
    }//GEN-LAST:event_viewstatementofaccountActionPerformed

    private void viewpendingbillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpendingbillsActionPerformed
        loadUserBills();
    }//GEN-LAST:event_viewpendingbillsActionPerformed

    private void viewpaidbillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpaidbillsActionPerformed
        // TODO add your handling code here:
        usersession session = usersession.getInstance();
        int userId = session.getId();

        String query = "SELECT b.b_id, u.account_number, b.bill_month, b.kwh_used, b.amount_due, b.due_date, b.status " +
        "FROM tbl_bill b " +
        "JOIN users u ON b.user_id = u.id " +
        "WHERE b.user_id = ? AND b.status = 'Paid'";

        try (Connection con = db.getConnection();
            PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            java.util.List<config.billsmodel> billsList = new java.util.ArrayList<>();
            while (rs.next()) {
                config.billsmodel bill = new config.billsmodel(
                    rs.getInt("b_id"),
                    rs.getString("account_number"),
                    rs.getString("bill_month"),
                    rs.getInt("kwh_used"),
                    rs.getDouble("amount_due"),
                    rs.getDate("due_date"),
                    rs.getString("status")
                );
                billsList.add(bill);
            }
            rs.close();

            setUserBillsTableModel(billsList);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading paid bills: " + e.getMessage());
        }
    }//GEN-LAST:event_viewpaidbillsActionPerformed

    private void paymybillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymybillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymybillsActionPerformed

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        // Removed main method to avoid no-arg constructor error
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel billsbtn;
    private javax.swing.JPanel homebtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTable mybillstable;
    private javax.swing.JButton paymybills;
    private javax.swing.JPanel profilebtn;
    private javax.swing.JPanel settingsbtn;
    private javax.swing.JButton viewpaidbills;
    private javax.swing.JButton viewpendingbills;
    private javax.swing.JButton viewreceipt;
    private javax.swing.JButton viewstatementofaccount;
    private javax.swing.JLabel welcometxt;
    // End of variables declaration//GEN-END:variables
}
