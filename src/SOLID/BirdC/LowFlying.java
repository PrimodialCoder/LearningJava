package SOLID.BirdC;

public class LowFlying implements FlyingBehaviour {

    @Override
    public void doFly(String type) {
        System.out.println( type + " is flying LOW");
    }
}
