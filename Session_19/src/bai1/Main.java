package bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Java", "", "Lambda", "Stream", "", "Functional"));
        Predicate<String> predicate = String::isBlank;

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (predicate.test(temp)) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
