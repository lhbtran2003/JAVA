package bai6;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/my_db_6", "root", "");

            if (conn != null) {
                System.out.println("kết noi thành công");
            } else {
                System.out.println("kết nối thất bại");
            }

            Statement stmt = conn.createStatement();

            ResultSet totalEmployees = stmt.executeQuery("SELECT COUNT(ID) AS total FROM employees ");
            while (totalEmployees.next()) {
                int total = totalEmployees.getInt("total");
                System.out.println("Tổng số nv: "+ total);
            }
            totalEmployees.close();

            ResultSet avgSalary = stmt.executeQuery("SELECT AVG(SALARY) AS avgSalary FROM employees ");
            while (avgSalary.next()) {
                double salary = avgSalary.getDouble("avgSalary");
                System.out.println("Lương trung bình: " + salary);
            }
            avgSalary.close();

            ResultSet highestSalary = stmt.executeQuery("SELECT MAX(SALARY) AS maxSalary FROM employees ");
            while (highestSalary.next()) {
                double salary = highestSalary.getDouble("maxSalary");
                System.out.println("Lương cao nhất: " + salary);
            }
            highestSalary.close();
            
            ResultSet lowestSalary = stmt.executeQuery("SELECT MIN(SALARY) AS minSalary FROM employees ");
            while (lowestSalary.next()) {
                double salary = lowestSalary.getDouble("minSalary");
                System.out.println("Lương thấp nhất: " + salary);

            }
            lowestSalary.close();



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
