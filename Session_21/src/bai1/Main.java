package bai1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất");
        int first = sc.nextInt();
        System.out.println("Nhập số nguyên thứ hai");
        int second = sc.nextInt();

        try {
            int result = first/second;
            System.out.println(result);

        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

    }
}