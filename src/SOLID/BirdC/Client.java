package SOLID.BirdC;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("in what way you want the sparrow to fly (low/high): ");
        String type = sc.nextLine();
        FlyingBehaviour fBehaviour = null;

        if (type.equals("low")) {
            fBehaviour = new LowFlying();
        } else {
            fBehaviour = new HighFlying();
        }
        Sparrow sparrow = new Sparrow("Sparrow", 2, fBehaviour);
        sparrow.fly();


    }
}
