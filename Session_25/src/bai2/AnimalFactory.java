package bai2;

public class AnimalFactory {
    public static Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();

        } else {
            System.out.println("Ko có con nàyyyy");
            return null;
        }
    }
}
