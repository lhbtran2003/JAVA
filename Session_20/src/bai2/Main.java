package bai2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumOdd = list.stream().filter(i -> i %2 != 0).reduce(0, Integer::sum);
        System.out.println(sumOdd);
    }
}
