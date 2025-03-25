package SOLID.BirdA;

public class Vulture extends BirdA implements Flyable {

    public Vulture(String type, int noOfWings) {
        super(type, noOfWings);
    }

    @Override
    void makeSound() {
        System.out.println("Vulture is making sound");
    }

    @Override
    public void fly() {
        System.out.println("Vulture is flying HIGH");
    }
}
