package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        // chuyển đổi thành Iterator để duyệt và thực hiện thay đổi trong vòng lặp
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
