package bai5;

import javax.imageio.IIOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
       File folder = new File("bai5");
       if (!folder.exists()) {
           folder.mkdir();
       }
       File file = new File(folder, "input.txt");

       String [] players = {"Văn Lâm", "Tiến Linh", "Xuân Son"};

       try (FileWriter writer = new FileWriter(file)) {
           for (String player : players) {
               writer.write(player + "\n");
           }
       } catch (IOException e) {
           System.out.println("Xảy ra lỗi khi ghi file "+ e.getMessage());
       }

       // tìm tên dài nhất
        String longestName = "";
       StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("D:/JAVA_CORE/Session_22/bai5/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() > longestName.length()) {
                    longestName = line;
                }
            }
        } catch (IOException e) {
           System.out.println("Lỗi: " + e.getMessage());
       }

       String[] words = content.toString().split("\\n");
       for (String word : words) {
           if (word.length() > longestName.length()) {
               longestName = word;
           }
       }

        System.out.println("Tên dài nhất: " + longestName);
        System.out.println("Độ dài: "+longestName.length());
    }
}
