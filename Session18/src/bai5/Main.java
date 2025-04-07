package bai5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
        map.put("e", 500);
        map.put("f", 600);
        map.put("g", 700);

        // Lọc ra các sản phẩm có giá trong khoảng từ 500 đến 1500.
        List<Map.Entry<String, Integer>> filterMap = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 500 && entry.getValue() <= 1500) {
                filterMap.add(entry);
            }
        }

        // Sắp xếp các sản phẩm đã lọc theo giá (tăng dần).
        Collections.sort(filterMap, new PriceComparator());

        for (Map.Entry<String, Integer> entry : filterMap) {
            System.out.println(entry.getKey() + " - Gía: " + entry.getValue());
        }
    }
}
