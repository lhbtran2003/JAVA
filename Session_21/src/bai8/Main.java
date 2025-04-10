package bai8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("0123456789", "0123a45b67", "1234");

        List<String> validPhoneNumber = new ArrayList<>();

        Map<String, String> invalidPhoneNumber = new HashMap();

        InvalidPhoneNumberLengthException invalidPhoneNumberLengthException =  new InvalidPhoneNumberLengthException();

        for (String str : list) {
            try {
                invalidPhoneNumberLengthException.validatePhoneNumber(str);
                validPhoneNumber.add(str);
            }
            catch (InvalidPhoneNumberLengthException e) {
                invalidPhoneNumber.put(str, e.getMessage());
            }
            catch (NumberFormatException e) {
                invalidPhoneNumber.put(str, e.getMessage());
            }
        }

        System.out.println("Danh sách số điện thoại hợp lệ:");
        System.out.println(validPhoneNumber);
        System.out.println("Danh sách số điện thoại KO hợp lệ:");
        for (Map.Entry<String,String> entry : invalidPhoneNumber.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
