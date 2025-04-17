package bai3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

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
            stmt.executeUpdate("INSERT INTO employees (id, name, address) VALUES (1, 'Đăng Văn Lâm', 'Đức');");
            stmt.executeUpdate("INSERT INTO employees (id, name, address) VALUES (2, 'Nguyễn Xuân Sơn', 'Brazil');");
            stmt.executeUpdate("INSERT INTO employees (id, name, address) VALUES (3, 'Nguyễn Tiến Linh', 'Việt Nam');");

            System.out.println("Đã chèn thành công 3 nhân viên mới vào bảng employees.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
