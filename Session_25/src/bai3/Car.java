package bai3;

public class Car {
    private String engine;
    private int seats;
    private String color;

    public Car(String engine, int seats, String color) {
        this.engine = engine;
        this.seats = seats;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                '}';
    }
}
