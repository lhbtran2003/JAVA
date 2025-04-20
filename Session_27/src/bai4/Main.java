package bai4;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = bai3.DBConnection.getConnection();

        try {
            CallableStatement cstmt = conn.prepareCall("{call getEmployeeDetails(?)}");
            cstmt.setInt(1, 1);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
