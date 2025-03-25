package SOLID.BirdB;

public class Sparrow extends BirdB {
    LowFlying lF;
    public Sparrow(String type, int noOfWings) {

        super(type, noOfWings);
        this.lF = new LowFlying();
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is making sound");
    }

    void fly(){
        lF.makefly();
    }

}
