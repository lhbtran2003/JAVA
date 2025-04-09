package bai3;

import java.util.Optional;

public class User {
    private String name;
    private String phoneNumber;

    User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        Optional<String> optional = Optional.ofNullable(phoneNumber);
        String value = optional.orElse("Không có");

        System.out.println("Tên:" + name + " SĐT: " + value);

    }
}
