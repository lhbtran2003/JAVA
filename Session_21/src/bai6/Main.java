package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        while (true) {
            System.out.println("Nhập giá trị cho phan tu, nếu ko muốn nhập nữa thì gõ 'end'");
            String str = new Scanner(System.in).nextLine();
            if (str.equals("end")) {
                break;
            }
            list.add(str);
        }

        List<Integer> validList = new ArrayList<>();
        int invalidCount = getInvalidCount(list, validList);
        System.out.println("Số lượng chuỗi ko hợp lệ là: "+ invalidCount);
        System.out.println(validList);


    }

    private static int getInvalidCount(List<String> list, List<Integer> validList) {
        int invalidCount = 0;
        for (String str : list) {
            try {
               validList.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                invalidCount++;
            }
        }
        return invalidCount;
    }


}
