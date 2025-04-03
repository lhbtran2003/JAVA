package bai3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        // chuyển đổi thành Iterator để duyệt và thực hiện thay đổi trong vòng lặp
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(set);
    }
}
