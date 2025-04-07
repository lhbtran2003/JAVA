package bai7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
         // nhập 1 chuỗi
        System.out.println("Nhập chuỗi");
        String modelStr = new Scanner(System.in).nextLine().toLowerCase();

        // tách các từ trong chuỗi, sử dụng split("\\W+")
        String [] wordsInStr = modelStr.split("\\W+");

        // Sử dụng Set để lưu từ không trùng lặp
        Set<String> wordSet = new HashSet<>(List.of(wordsInStr));

        // Lưu các từ trong List để đếm tần suất
        List<String> wordList = new ArrayList<>(List.of(wordsInStr));

        // Chuyển wordSet thành List
        List<String> sortedWordList = new ArrayList<>(wordSet);

        // Dùng Collections.sort() để sắp xếp các từ trong List theo thứ tự bảng chữ cái.
        Collections.sort(sortedWordList);

        // tạo 1 mảng chứa số lần xuất hiện của từng phần tử trong sortedWordList
        List<Integer> markingList =  new ArrayList<>();
         for (String word : sortedWordList) {
             int count = 0;
             for (String v: wordList) {
                 if (v.equals(word)) {
                     count++;
                 }
             }
             markingList.add(count);
         }

         for (int i = 0; i < markingList.size(); i++) {
             System.out.println(sortedWordList.get(i) + ": " +markingList.get(i));
         }

    }
}
