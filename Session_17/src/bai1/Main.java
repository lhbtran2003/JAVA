package bai1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Tạo một HashSet để lưu trữ các số nguyên
        Set<Integer> intSet = new HashSet<Integer>(Arrays.asList(10,20,30,40,50));

        for (Integer integer : intSet) {
            System.out.println(integer);
        }


    }
}
