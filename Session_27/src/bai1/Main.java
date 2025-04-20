package bai1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
     public static void main(String[] args) {
         String SQL = "SELECT * FROM employees WHERE id = ?";
         Connection conn = DBConnection.getConnection();

         try {
             PreparedStatement ps = conn.prepareStatement(SQL);
             ps.setInt(1, 1);
             ResultSet rs = ps.executeQuery();

             while (rs.next()) {
                 System.out.println(rs.getInt("id"));
                 System.out.println(rs.getString("name"));
                 System.out.println(rs.getDouble("salary"));
             }
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
}
