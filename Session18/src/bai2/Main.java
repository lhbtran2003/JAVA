package bai2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Dell", 2);
        products.put("Samsung", 2);
        products.put("LG", 2);
        products.put("Sony", 1000);
        products.put("Laptop", 100);

        if (products.containsKey("Laptop")) {
            System.out.println("Có sản phẩm");
        } else {
            System.out.println("Ko có sản phẩm laptop");
        }

        if (products.containsValue(1000)) {
            System.out.println("Có sản phẩm giá 1000");
        } else {
            System.out.println("ko Có sản phẩm giá 1000");

        }
    }
}
