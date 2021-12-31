package DesignPatterns.strategy;

public class QuackNo implements QuackBehavior{

    public void quack() {
        System.out.println("Mute");
    }
}
