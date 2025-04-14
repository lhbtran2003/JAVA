package bai1;

public class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread đang chạy "+threadName);
    }
}
