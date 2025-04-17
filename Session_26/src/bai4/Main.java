package bai4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/my_db", "root", "");

            if (conn != null) {
                System.out.println("kết noi thành công");
            } else {
                System.out.println("kết nối thất bại");
            }

            Statement stmt = conn.createStatement();

            stmt.executeUpdate("update users set name = 'Bùi Tiến Dũng' where id = 3");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
