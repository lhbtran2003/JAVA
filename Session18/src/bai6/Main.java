package bai6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> students = new LinkedHashMap<>();
        students.put("A", 4.5);
        students.put("B", 6.0);
        students.put("C", 7.0);
        students.put("D", 8.0);
        students.put("E", 9.0);
        students.put("F", 10.0);
        students.put("G", 11.0);
        students.put("H", 12.0);
        students.put("I", 13.0);
        students.put("J", 14.0);

        int count = 0;
        int sum = 0;

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
            sum += entry.getValue();
        }

        // tính và in ra đtb của all hsinh
        int avg = sum / count;
        System.out.println(avg);

        // xóa hsinh có điểm bé hơn 5
        Iterator<Map.Entry<String, Double>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            if (entry.getValue() < 5) {
                iterator.remove();
            }
        }

        // in lại ds sau khi xoas
        System.out.println("Danh sách sau khi xóa:");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
