package bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anna", "Alexandra", "Ashton", "Alfred", "Ariana");
        Predicate<String> predicate = str -> str.startsWith("A") && str.length() >= 5;
        int count = 0;

        for (String s : list) {
            if (predicate.test(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
