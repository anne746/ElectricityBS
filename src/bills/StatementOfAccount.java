/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bills;

import config.connectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class StatementOfAccount extends javax.swing.JFrame {

    /**
     * Creates new form StatementOfAccount
     */
   
    public StatementOfAccount() {
        initComponents();
    }

    public void loadStatement(int billId) {
        // Clear previous data
        customername.setText("");
        customeraccountnumber1.setText("");
        email.setText("");
        address.setText("");
        totalamountdue.setText("0.00");

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Bill Month", "kWh Used", "Amount Due", "Due Date", "Status"});

        try (Connection con = connectDB.getConnection()) {
            // Query to get user and bill details for the statement of account
            String query = "SELECT CONCAT(u.firstname, ' ', u.lastname) AS name, u.account_number, u.email, u.address, " +
                            "b.bill_month, b.kwh_used, b.amount_due, b.due_date, b.status " +
                            "FROM tbl_bill b " +
                            "JOIN users u ON b.user_id = u.id " +
                            "WHERE b.b_id = ? AND b.status = 'Pending'";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, billId);
            ResultSet rs = pst.executeQuery();

            double totalAmount = 0.0;
            boolean found = false;

            while (rs.next()) {
                found = true;
                customername.setText(rs.getString("name"));
                customeraccountnumber1.setText(rs.getString("account_number"));
                email.setText(rs.getString("email"));
                address.setText(rs.getString("address"));

                String billMonth = rs.getString("bill_month");
                int kwhUsed = rs.getInt("kwh_used");
                double amountDue = rs.getDouble("amount_due");
                java.sql.Date dueDate = rs.getDate("due_date");
                String status = rs.getString("status");

                model.addRow(new Object[]{billMonth, kwhUsed, amountDue, dueDate, status});
                totalAmount += amountDue;
            }

            if (!found) {
                JOptionPane.showMessageDialog(this, "No pending bill found with the selected ID.", "No Data", JOptionPane.WARNING_MESSAGE);
            }

            jTable1.setModel(model);
            totalamountdue.setText(String.format("%.2f", totalAmount));

            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading statement: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        customername = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        customeraccountnumber1 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        totalamountdue = new javax.swing.JLabel();
        address2 = new javax.swing.JLabel();
        closebtn = new javax.swing.JButton();
        printreceipt1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 134, 222));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Statement of Account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Electric Bill System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jLabel13.setBackground(new java.awt.Color(46, 134, 222));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(46, 134, 222));
        jLabel13.setText("Name:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 30));

        jLabel8.setBackground(new java.awt.Color(46, 134, 222));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(46, 134, 222));
        jLabel8.setText("Address:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 30));

        jLabel9.setBackground(new java.awt.Color(46, 134, 222));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(46, 134, 222));
        jLabel9.setText("Account Number:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        jLabel10.setBackground(new java.awt.Color(46, 134, 222));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(46, 134, 222));
        jLabel10.setText("Email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, 30));

        customername.setBackground(new java.awt.Color(46, 134, 222));
        customername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        customername.setText("Name:");
        jPanel1.add(customername, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 270, 30));

        address.setBackground(new java.awt.Color(46, 134, 222));
        address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address.setText("address");
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 270, 30));

        customeraccountnumber1.setBackground(new java.awt.Color(46, 134, 222));
        customeraccountnumber1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customeraccountnumber1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        customeraccountnumber1.setText("AccNumber");
        jPanel1.add(customeraccountnumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 270, 30));

        email.setBackground(new java.awt.Color(46, 134, 222));
        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email.setText("email");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 270, 30));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 760, 230));

        totalamountdue.setBackground(new java.awt.Color(46, 134, 222));
        totalamountdue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalamountdue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalamountdue.setText("10,000.00");
        jPanel1.add(totalamountdue, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 80, 30));

        address2.setBackground(new java.awt.Color(46, 134, 222));
        address2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address2.setText("Total Amount Due:");
        jPanel1.add(address2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 120, 30));

        closebtn.setBackground(new java.awt.Color(46, 134, 222));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setText("Close");
        closebtn.setBorder(null);
        closebtn.setPreferredSize(new java.awt.Dimension(350, 40));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        jPanel1.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 140, 20));

        printreceipt1.setBackground(new java.awt.Color(46, 134, 222));
        printreceipt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        printreceipt1.setText("Print");
        printreceipt1.setBorder(null);
        printreceipt1.setPreferredSize(new java.awt.Dimension(350, 40));
        printreceipt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printreceipt1MouseClicked(evt);
            }
        });
        printreceipt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreceipt1ActionPerformed(evt);
            }
        });
        jPanel1.add(printreceipt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 140, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
      this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void printreceipt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printreceipt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_printreceipt1MouseClicked

    private void printreceipt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printreceipt1ActionPerformed
        // Use PanelPrinter to print the jPanel1
        config.PanelPrinter printer = new config.PanelPrinter(jPanel1);
        printer.printPanel();
    }//GEN-LAST:event_printreceipt1ActionPerformed

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
            java.util.logging.Logger.getLogger(StatementOfAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatementOfAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatementOfAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatementOfAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatementOfAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel address2;
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel customeraccountnumber1;
    private javax.swing.JLabel customername;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton printreceipt1;
    private javax.swing.JLabel totalamountdue;
    // End of variables declaration//GEN-END:variables
}
