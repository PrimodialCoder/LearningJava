package SOLID.BirdA;

public class Sparrow extends BirdA implements Flyable {

    public Sparrow(String type, int noOfWings) {
        super(type, noOfWings);
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is making sound");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying LOW");
    }
}
