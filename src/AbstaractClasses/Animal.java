package AbstaractClasses;

public abstract class Animal {
    private String name;
    public void walk() {
        System.out.println("animal is walking");
    }
    abstract void eat();

}

// 1. It stops object creation
// 2. It also helps you have some abstract methods