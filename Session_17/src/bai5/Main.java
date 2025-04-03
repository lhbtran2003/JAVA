package bai5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>(Arrays.asList(1,3,5,7,9));
        Set<Integer> secondSet = new HashSet<>(Arrays.asList(2,4,6,8,9,10));
        Set<Integer> newSet = addTwoSets(firstSet, secondSet);
        System.out.println(newSet);
    }
    // kết hợp 2 HashSet thành 1
    public static Set<Integer> addTwoSets(Set<Integer> one, Set<Integer> two) {
        Set<Integer> newSet = new HashSet<>(one);
        newSet.addAll(two);
        return newSet;
    }
}
