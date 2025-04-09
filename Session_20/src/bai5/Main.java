package bai5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList= List.of(10, 10, 10);

        findSecondMax(allSameList);
    }

    public static void findSecondMax(List<Integer> list) {
        Optional<Integer> secondMax = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondMax.ifPresentOrElse(
                (val) -> System.out.println("Số lớn thứ 2 là: "+val)
                , () -> System.out.println("Không tìm thấy số lớn thứ hai")
        );
    }
}
