package DesignPatterns.strategy;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck duck = new WhiteDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNo());
        duck.performFly();
    }
}
