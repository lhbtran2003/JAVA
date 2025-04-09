package bai7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(

                new Employee("Quý", 26, "IT", 2500),

                new Employee("Lan", 24, "IT", 2100),

                new Employee("Minh", 30, "HR", 3000),

                new Employee("Huyền", 28, "IT", 2000),

                new Employee("Long", 32, "IT", 3100),

                new Employee("Trang", 25, "Marketing", 2200),

                new Employee("Việt", 27, "IT", 2500)

        );

        System.out.println(sortBySalary(employees));
    }

    public static List<Employee> filterEmployee(List<Employee> employee) {
        return employee.stream().filter((e) -> e.getSalary() > 2000 && e.getAge() >= 25 && e.getDepartment().equals("IT")).collect(Collectors.toList());
    }

    public static List<Employee> sortBySalary(List<Employee> employee) {
        List<Employee> employees = filterEmployee(employee);
        return employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
    }
}
