/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import static config.connectDB.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class forgotpass {
    connectDB db = new connectDB();
    Connection connect = getConnection();
    public boolean validateRecovery(String email, String phrase) {
    String query = "SELECT * FROM users WHERE email = ? AND recovery_phrase = ?";
    try (PreparedStatement pst = connect.prepareStatement(query)) {
        pst.setString(1, email);
        pst.setString(2, phrase);
        ResultSet rs = pst.executeQuery();
        return rs.next(); // true if match found
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

    public boolean updatePassword(String email, String hashedPassword) {
        String query = "UPDATE users SET password = ? WHERE email = ?";
        try (PreparedStatement pst = connect.prepareStatement(query)) {
            pst.setString(1, hashedPassword);
            pst.setString(2, email);
            int rowsUpdated = pst.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getCurrentPassword(String email) {
        String query = "SELECT password FROM users WHERE email = ?";
        try (PreparedStatement pst = connect.prepareStatement(query)) {
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
