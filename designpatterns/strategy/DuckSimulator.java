package designpatterns.strategy;

/**
 * Simulator that instantiates a Duck object and perofrms different actions using it.
 */
public class DuckSimulator {

  /**
  * main method.
  *
  * @param args standard input params as a string of array.
  */
  public static void main(String[] args) {
    Duck duck = new WhiteDuck();
    duck.display();
    duck.performFly();
    duck.performQuack();
    duck.setFlyBehavior(new FlyNo());
    duck.performFly();
  }
}
