package bai5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        StringBuilder SQL = new StringBuilder("SELECT id,name,salary,department_id FROM employee WHERE 1=1");

        System.out.print("Têm: (ko nhập thì enter dùm :)))): ");
        String name = sc.nextLine().trim();
        System.out.print("Lương: (ko nhập thì enter dùm :)))): ");
        String salary = sc.nextLine().trim();
        System.out.print("ID phòng ban: (ko nhập thì enter dùm :)))): ");
        String department_id = sc.nextLine().trim();

        if (!name.isEmpty()) {
            SQL.append("AND name LIKE ? " );
        }
        if (!salary.isEmpty()) {
            SQL.append("AND salary LIKE ? " );
        }
        if (!name.isEmpty()) {
            SQL.append("AND department_id LIKE ? " );
        }

        try {
            PreparedStatement ps = conn.prepareStatement(SQL.toString());
            int paramIndex = 1;

            if (!name.isEmpty()) {
                ps.setString(paramIndex++, "%" + name + "%");
            }
            if (!salary.isEmpty()) {
                ps.setString(paramIndex++, "%" + salary + "%");
            }
            if (!department_id.isEmpty()) {
                ps.setString(paramIndex++, "%" + department_id + "%");
            }

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getDouble("salary") + ", " + rs.getInt("department_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        int paramIndex = 1;
        if (!name.isEmpty()) {

        }
    }
}
