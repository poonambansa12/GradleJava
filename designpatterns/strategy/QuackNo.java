package designpatterns.strategy;

public class QuackNo implements QuackBehavior{

    public void quack() {
        System.out.println("Mute");
    }
}
