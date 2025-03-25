package SOLID.BirdA;

public abstract class BirdA {
    String type;
    int noOfWings;

    public BirdA(String type, int noOfWings) {
        this.type = type;
        this.noOfWings = noOfWings;
    }

    void eat() {
        System.out.println("Bird is eating");
    }
    abstract void makeSound();
}
