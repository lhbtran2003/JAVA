package bai7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.print("Nhập số tiền cần rút: ");

        try {
            double withDrawnAmount = withdraw(new Scanner(System.in), acc);
            acc.setBalance(acc.getBalance() - withDrawnAmount);
            System.out.println("Số dư còn lại là: "+ acc.getBalance());
        } catch (Exception e) {
            System.err.println("Lỗi: " + e.getMessage());
        }


    }

    private static double withdraw(Scanner sc, BankAccount account) throws Exception{
        if (!sc.hasNextDouble()) {
            throw new InputMismatchException("Vui lòng nhập một số hợp lệ!");
        }
        double withdrawAmount = sc.nextDouble();
        if (withdrawAmount > account.getBalance()) {
            throw new Exception("Số tiền rút vượt quá số dư!");
        }
        if (account.getBalance() < 50000) {
            throw new Exception("Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
        }
        return withdrawAmount;
    }
}
