package bai2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập tên tệp");
        String fileName = new Scanner(System.in).nextLine();

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("tệp đã tồn tại");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("Tệp đã được tạo!");
                } else {
                    System.out.println("Tạo tệp thất bại");
                }
            } catch (IOException e) {

            }
        }
    }
}
