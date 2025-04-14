package bai4;

public class MyThread extends java.lang.Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

  @Override
    public void run() {
        if (threadName.equals("t1")) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i+ " ");
                try {
                    java.lang.Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println(threadName + " đang chờ...");
        }
  }
}
