package bai10;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

    public String toString() {
        return String.format("Tên hình: %s", name);
    }
}
