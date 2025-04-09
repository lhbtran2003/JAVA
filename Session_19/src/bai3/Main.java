package bai3;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyen thứ nhất");
        int first = sc.nextInt();
        System.out.println("Nhập số nguyen thứ hai");
        int second = sc.nextInt();

        // Sử dụng Method Reference (cú pháp ::) để gọi các phương thức này và thực hiện các phép toán trên hai số đã nhập từ bàn phím.
        Operation add = MathOperations::add;
        Operation subtract = MathOperations::subtract;
        Operation multiply = MathOperations::multiply;
        Operation divide = MathOperations::divide;
    }
}
