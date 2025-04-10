package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào độ tuổi của bạn:");
        int age = new Scanner(System.in).nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void checkAge (int age) throws Exception {
         if (age < 18) {
             throw new Exception("Tuổi ko được dưới 18");
         } else {
             System.out.println("Chào mừng bạn");
         }
    }
}
