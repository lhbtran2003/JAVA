package bai2;

import bai1.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();

        String SQL ="INSERT INTO students (id, name, age, major) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            PreparedStatement ps1 = conn.prepareStatement("select * from students where id = ?");

            // thêm dữ liệu
            ps.setInt(1, 1);
            ps.setString(2, "Tran");
            ps.setInt(3, 20);
            ps.setString(4, "Java");

            // thực thi
            ps.executeUpdate();

            // kiểm tra
            ps1.setInt(1, 1);
            ResultSet rs = ps1.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
