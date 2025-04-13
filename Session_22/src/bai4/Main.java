package bai4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
      Student student = new Student("A", 20, 9.9);

      try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
          oos.writeObject(student);
      } catch (IOException e) {
          System.out.println("Lỗi khi ghi file nhị phân " + e.getCause());
      }

      // đọc lại từ student.dat
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file nhị phân " + e.getCause());
        }
    }
}
