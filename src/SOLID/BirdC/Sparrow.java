package SOLID.BirdC;

public class Sparrow extends BirdC {
    private FlyingBehaviour fBehaviour;
    public Sparrow(String type, int noOfWings, FlyingBehaviour fBehaviour) {
        super(type, noOfWings);
        this.fBehaviour = fBehaviour;
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is making sound");
    }

    void fly(){
        fBehaviour.doFly(this.type);
    }

}
