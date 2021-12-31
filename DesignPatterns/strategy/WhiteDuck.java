package DesignPatterns.strategy;

public class WhiteDuck extends Duck {
    public WhiteDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Color of the duck is white");
    }
}
