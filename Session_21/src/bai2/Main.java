package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Nhập chỉ số phần tử của mảng");

        try {
            int index = new Scanner(System.in).nextInt();
            int value = arr[index];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
