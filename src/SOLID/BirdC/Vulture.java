package SOLID.BirdC;

public class Vulture extends BirdC {

    private FlyingBehaviour fBehaviour;
    public Vulture(String type, int noOfWings) {
        super(type, noOfWings);
        this.fBehaviour  = new HighFlying();
    }

    @Override
    void makeSound() {
        System.out.println("Vulture is making sound");
    }

    void fly(){
        fBehaviour.doFly(this.type);
    }
}
