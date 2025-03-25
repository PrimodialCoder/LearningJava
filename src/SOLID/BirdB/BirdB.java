package SOLID.BirdB;

public abstract class BirdB {
    String type;
    int noOfWings;

    public BirdB(String type, int noOfWings) {
        this.type = type;
        this.noOfWings = noOfWings;
    }

    void eat() {
        System.out.println("Bird is eating");
    }
    abstract void makeSound();
}
