package SOLID.BirdC;

public class Pigeon extends BirdC {
    private FlyingBehaviour fBehaviour;
    public Pigeon(String type, int noOfWings) {
        super(type, noOfWings);
        this.fBehaviour = new LowFlying();
    }

    @Override
    void makeSound() {
        System.out.println("Pigeon is making sound");
    }

    void fly(){
        fBehaviour.doFly(this.type);
    }

}
