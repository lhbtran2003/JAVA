package bai2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
            ResultSet rs = stmt.executeQuery("select id, name, age from customers");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " + name + " " + age);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
