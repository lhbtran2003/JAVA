package bai6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> second = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(findIntersection(first, second));
    }

    // tìm điểm giao nhau của 2 tập hợp
    public static Set<Integer> findIntersection(Set<Integer> first, Set<Integer>second) {
        Set<Integer> intersection = new HashSet<Integer>();

        for (Integer i : first) {
            if (second.contains(i)) {
                intersection.add(i);
            }
        }
        return intersection;
    }
}
