package bai6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "lambda", "stream", "functional");
        StringProcessor processor = input -> input.toUpperCase() + "- TECHNICAL";

        List<String> processList = new ArrayList<>();

        for (String str : list) {
            processList.add(processor.processString(str));
        }
       processor.printList(processList);
    }
}
