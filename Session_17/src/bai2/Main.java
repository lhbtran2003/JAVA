package bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Java", "Python", "C++", "JavaScript"));
        String input = new Scanner(System.in).nextLine();
        if (set.contains(input)) {
            System.out.println(input);
        } else {
            System.out.println("Not found");
        }
    }
}
