package bai7;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("country.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split.length == 3) {
                    int id = Integer.parseInt(split[0]);
                    String code = split[1].trim();
                    String name = split[2].trim();

                    Country country = new Country(id, code, name);
                    list.add(country);
                }
            }

        } catch (IOException e) {
            System.out.println("Lỗi " + e.getMessage());
        }

        for (Country country : list) {
            System.out.printf("[ ID: %d%s| CODE: \"%s\"%s| NAME: \"%s\"%s]\n",
                    country.getId(),
                    " ".repeat(3),
                    country.getCode(),
                    " ".repeat(4),
                    country.getName(),
                    " ".repeat(7));

        }
    }
}
