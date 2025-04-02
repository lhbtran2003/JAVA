package bai6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> passList = new ArrayList<>();

        for (Integer i : list) {
            if (!passList.contains(i)) {
                passList.add(i);
            }
        }

        for (Integer i : passList) {
            System.out.println(i);
        }
    }
}
