package bai4;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();
        map.put("NV001", 2.7);
        map.put("NV005", 3.5);
        map.put("NV002", 3.2);
        map.put("NV003", 3.3);
        map.put("NV004", 3.4);

        // in theo thứ tự khóa tăng dân
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // cập nhật mức lương của 1 nhân viên
        map.replace("NV002", 5.5);
        // xóa 1 nhân viên khỏi danh sách
        map.remove("NV003");

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}