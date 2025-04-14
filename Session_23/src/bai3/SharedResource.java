package bai3;

public class SharedResource {
    public synchronized void printAlphabet() {
        System.out.println("Alphabet");
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%c ",i);
        }
        System.out.println();
    }
}
