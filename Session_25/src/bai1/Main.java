package bai1;

public class Main {
    public static void main(String[] args) {
       Account acc1 = Account.getInstance();
       Account acc2 = Account.getInstance();
       acc1.setAge(15);
       acc2.setAge(20);
       System.out.println(acc1.getAge());
       System.out.println(acc2.getAge());

       if (acc1 == acc2) {
           System.out.println("hế hế dống nhao kìaaaa");
       }

    }
}
