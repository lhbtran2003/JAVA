package bai3;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        try {
            // kiểm tra csdl đang kết nối tới
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT DATABASE()");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // cập nhật mức lương của nhân viên dựa trên id
            String SQL = "UPDATE EMPLOYEES SET salary = ? WHERE ID = ?";
            PreparedStatement pst = conn.prepareStatement(SQL);

            pst.setInt(1, 10000000);
            pst.setInt(2, 1);

            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
