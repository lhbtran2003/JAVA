package bai3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("input.txt");

        // tạo file và ghi nội dung vào file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("haizzzz mệt mỏi quá muốn đi ngủ ở biển trên núi trong rừng ăn bánh tráng nướng uông sữa đậu nành ăn ốc các thể loại uống bia dưới biển");

        } catch (IOException e) {
            System.out.println("Lỗi khi tạo file " + e.getMessage());
        }

        // sao chép content tu input sang copy.txt
        File fileCopy = new File("copy.txt");
        try (FileReader reader = new FileReader(file);
             FileWriter writer = new FileWriter(fileCopy)) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi copy file " + e.getMessage());
        }

        // dọc content từ copy.txt và in ra console
        try (FileReader reader = new FileReader("copy.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.printf("%c", c);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi in ra console " + e.getMessage());
        }

    }
}
