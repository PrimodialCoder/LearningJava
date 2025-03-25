package SOLID.BirdC;

public class HighFlying implements FlyingBehaviour {

    @Override
    public void doFly(String type) {
        System.out.println( type + " is flying HIGH");
    }
}
