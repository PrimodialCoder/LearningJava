package SOLID.BirdB;

public class Vulture extends BirdB {

    HighFlying hf = new HighFlying();
    public Vulture(String type, int noOfWings) {

        super(type, noOfWings);
        this.hf  = new HighFlying();
    }

    @Override
    void makeSound() {
        System.out.println("Vulture is making sound");
    }

    void fly(){
        hf.dofly();
    }
}
