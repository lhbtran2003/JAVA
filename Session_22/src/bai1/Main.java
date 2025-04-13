package bai1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập 1 chuỗi");
        String str = new Scanner(System.in).nextLine();

        // ghi chuoi vào file
        File file = new File("output.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(str);
        } catch (IOException e) {
            System.out.println("Có lỗi ghi tiến hành ghi file "+ e.getCause());
        }

        // đọc từ file
        try (FileReader reader = new FileReader(file)) {
           int c;
           while ((c = reader.read()) != -1) {
               System.out.printf("%c", c);
           }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file "+e.getCause());
        }
    }
}
