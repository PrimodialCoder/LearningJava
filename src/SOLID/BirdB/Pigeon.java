package SOLID.BirdB;

public class Pigeon extends BirdB {
    private LowFlying lF;
    public Pigeon(String type, int noOfWings) {

        super(type, noOfWings);
        this.lF = new LowFlying();
    }

    @Override
    void makeSound() {
        System.out.println("Pigeon is making sound");
    }

    void fly(){
        lF.makefly();
    }

}
