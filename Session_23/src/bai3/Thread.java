package bai3;

public class Thread extends java.lang.Thread {
    private SharedResource shared;
     public Thread(SharedResource shared) {
         this.shared = shared;
     }

     @Override
    public void run() {
         shared.printAlphabet();
     }
}
