package bai9;

import java.util.*;

public class Main {
    public static List<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        accounts.addAll(Arrays.asList(
                new BankAccount("ACC001", 1000000),
                new BankAccount("ACC002", 200000)
        ));

        try {
            System.out.print("Nhập id của tài khoản muốn thực hiện giao dich: ");
            String id = new Scanner(System.in).nextLine();

            BankAccount account = getBankAccount(id);

            if (account == null) {
                throw new NullPointerException("Tai khoan ko tồn tại");
            }
            else {
                System.out.print("Nhập số tiền muốn rút: ");
                double amount = inputAmount(new Scanner(System.in));
                account.withdraw(amount);
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double inputAmount(Scanner sc) throws InputMismatchException {
        if (!sc.hasNextDouble() || sc.nextDouble() < 0) {
            throw new InputMismatchException("Số tiền ko hợp lệ!");
        }
        return Double.parseDouble(sc.nextLine());
    }

    private static BankAccount getBankAccount(String id) {
        return accounts.stream().filter(acc -> acc.getAccountId().equals(id)).findFirst().orElse(null);
    }
}
