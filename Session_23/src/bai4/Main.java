package bai4;


public class Main {
    public static void main(String[] args) {
       Thread t1 = new MyThread("t1");
       Thread t2 = new MyThread("t2");
       Thread t3 = new MyThread("t3");
       t1.start();
       try {
           t1.join();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       t2.start();
       t3.start();
    }
}
