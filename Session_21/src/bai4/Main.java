package bai4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số nguyên");
        try {
            int n = inputInteger(new Scanner(System.in));
            System.out.println("Bạn đã nhập số " + n);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        }
    }

    public static int inputInteger(Scanner sc) throws InputMismatchException {
        if (!sc.hasNextInt()) {
            throw new InputMismatchException("N phải là 1 số nguyên");
        }
        return sc.nextInt();
    }


}
