package designpatterns.strategy;

public class Squeak implements QuackBehavior{

    public void quack() {
        System.out.println("This duck squeaks");
    }
}
