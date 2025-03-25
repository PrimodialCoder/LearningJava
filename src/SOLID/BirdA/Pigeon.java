package SOLID.BirdA;

public class Pigeon extends BirdA implements Flyable {

    public Pigeon(String type, int noOfWings) {
        super(type, noOfWings);
    }

    @Override
    void makeSound() {
        System.out.println("Pigeon is making sound");
    }

    @Override
    public void fly() {
        //Code duplication between piegon and sparrow becuase the both are flying LOW
        System.out.println("Pigeon is flying LOW");
    }
}
