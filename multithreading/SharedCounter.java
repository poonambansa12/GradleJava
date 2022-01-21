package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class SharedCounter implements Runnable {

  static int counter = 1; //global counter
  static ReentrantLock counterLock = new ReentrantLock();

  static void incrementCounter() {
    counterLock.lock();

    try{
      System.out.println("Current thread is: " + Thread.currentThread().getName()
          + " and counter is at: " + counter);
      counter++;
    } finally {
      counterLock.unlock();
    }
  }

  @Override
  public void run() {
    while (counter < 1000) {
      incrementCounter();
    }
  }

  public static void main(String[] args) {
    SharedCounter sharedCounter = new SharedCounter();
    Thread t1 = new Thread(sharedCounter);
    Thread t2 = new Thread(sharedCounter);

    t1.start();
    t2.start();
  }
}
