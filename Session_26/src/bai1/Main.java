package bai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
       // đăng kí driver
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver");
            // mở kết nối
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/first_conection_db?createDatabaseIfNotExist=true", "root", "");
            if (conn != null) {
                System.out.println("kết noi thành công");
            } else {
                System.out.println("kết nối thất bại");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}