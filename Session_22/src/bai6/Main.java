package bai6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File folder = new File("bai6");
        if (!folder.exists()) {
            folder.mkdir();
        }
        File file = new File(folder, "input.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("abcdefghijklmnop");
        } catch (IOException e) {
            System.out.println("Lỗi " +e.getMessage());
        }

        // đoọc và đảo ngược
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader("D:/JAVA_CORE/Session_22/bai6/input.txt")) {
            int c;
            while ((c = reader.read())!=-1) {
                content.append((char) c);
            }
        } catch (IOException e) {
            System.out.println("Lỗi " +e.getMessage());
        }

        System.out.println("Chuỗi đảo ngược: "+ content.reverse());

    }
}
