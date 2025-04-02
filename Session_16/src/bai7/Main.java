package bai7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3));
        ArrayList<Integer> passList = new ArrayList<>();
        ArrayList<Integer> markingList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!passList.contains(list.get(i))) {
                passList.add(list.get(i));

                int count = 0;
                for (Integer value: list) {
                    if (Objects.equals(value, list.get(i))) {
                        count++;
                    }
                }
                markingList.add(count);
            }
        }

        for (int i = 0; i < passList.size(); i++) {
            if (markingList.get(i) == 1) {
                System.out.println(passList.get(i));
            }
        }

        for (int i = 0; i < markingList.size(); i++) {
            if (markingList.get(i) != 1) {
                System.out.println("Số lần xuất hiện của "+passList.get(i)+" là: "+markingList.get(i));
                
            }
        }
    }
}
