package bai1;

public class Account {
    private int id;
    private String name;
    private int age;

    private static Account account;

    private Account() {

    }

    public static Account getInstance() {
        if (account == null) {
            account = new Account();
        }
        return account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Account getAccount() {
        return account;
    }

    public static void setAccount(Account account) {
        Account.account = account;
    }
}
