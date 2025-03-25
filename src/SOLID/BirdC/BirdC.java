package SOLID.BirdC;

public abstract class BirdC {
    String type;
    int noOfWings;

    public BirdC(String type, int noOfWings) {
        this.type = type;
        this.noOfWings = noOfWings;
    }

    void eat() {
        System.out.println("Bird is eating");
    }
    abstract void makeSound();
}
