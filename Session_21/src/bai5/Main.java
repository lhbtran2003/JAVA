package bai5;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số nguyên");

        try {
            int n = inputPostitiveInterger(new Scanner(System.in));
            System.out.println(isPrime(n) ? n + " Là số nguyên" : n + " KO là số nguyên");
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static int inputPostitiveInterger(Scanner sc) throws Exception {
        if (!sc.hasNextInt()) {
            throw new InputMismatchException("Gía trị phải là 1 số nguyên");
        }

        int n = sc.nextInt();
        if (n <= 0) {
            throw new Exception("Số phải lớn hơn ko.");
        }
        return n;
    }

    public static boolean isPrime(int n) throws Exception {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
