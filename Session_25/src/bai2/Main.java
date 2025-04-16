package bai2;

public class Main {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.getAnimal("cat");
        Animal dog = AnimalFactory.getAnimal("dog");
        Animal bird = AnimalFactory.getAnimal("bird");

        try {
            cat.speak();
            dog.speak();
            bird.speak();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
