package multithreading;

public class MultithreadingBlocked {
  
  public static void main(String[] args) {

    Thread t1 = new Thread(new MyRunnable());
    Thread t2 = new Thread(new MyRunnable());

    t1.start();
    t2.start();

    System.out.println(t1.getState());
    System.out.println(t2.getState());
    System.exit(0);
  }
}

class MyRunnable implements Runnable{

  @Override
  public void run() {
    method();
  }

  public static synchronized void method() {
    while (true) {
      System.out.println(" ");
    }
  }
}
