package bai3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int max = list.get(0);
        int min = list.get(0);

        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
    }
}
