package DesignPatterns.strategy;

public class FlyNo implements FlyBehavior {

    public void fly() {
        System.out.println("Cannot fly");
    }
}
