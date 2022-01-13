package designpatterns.strategy;

/**
 * Concrete class that implements fly() method of FlyBEhavior interface.
 */
public class FlyWithWings implements FlyBehavior {

  /**
   * Implementing fly() method of FlyBehavior interface.
   */
  public void fly() {
    System.out.println("Duck with wings");
  }
}
