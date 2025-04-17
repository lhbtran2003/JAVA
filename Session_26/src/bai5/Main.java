package bai5;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/my_db_5", "root", "");

            if (conn != null) {
                System.out.println("kết noi thành công");
            } else {
                System.out.println("kết nối thất bại");
            }

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT id,name,age,salary FROM employees ORDER BY salary DESC LIMIT 5");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double salary = rs.getDouble("salary");
                System.out.println(id + " " + name + " " + age + " " + salary);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
