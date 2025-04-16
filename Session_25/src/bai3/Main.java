package bai3;

public class Main {
    public static void main(String[] args) {
        Car bicycle = new CarBuilder().setEngine("haha").setSeats(1).setColor("black").build();
        Car truck =  new CarBuilder().setEngine("hihi").setSeats(3).setColor("blue").build();

        System.out.println(bicycle);
        System.out.println(truck);
    }
}
