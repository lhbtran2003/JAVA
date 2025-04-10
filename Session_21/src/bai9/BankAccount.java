package bai9;

public class BankAccount {
    private String accountId;
    private double balance;

    public BankAccount() {}

    public BankAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // gửi tiền
    public void deposit(double amount) {
        setBalance(getBalance() - amount);
    }

    // rút tiền
    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("Số dư ko đủ!");
        }
        setBalance(getBalance() - amount);
    }

    // Chuyển tiền giữa hai tài khoản
    public void transfer(double amount, BankAccount dest) throws Exception {
        withdraw(amount);
        dest.deposit(amount);
    }

}
