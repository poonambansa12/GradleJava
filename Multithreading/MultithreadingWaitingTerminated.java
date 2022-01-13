package Multithreading;

public class MultithreadingWaitingTerminated implements Runnable{
  public static Thread t1;
  public static void main(String[] args) {
    t1 = new Thread(new MultithreadingWaitingTerminated());
    t1.start();
  }

  public void run() {
    Thread t2 = new Thread(new T2Class());
    t2.start();

    try {
      Thread.sleep(10);

      //TIMED_WAITING
      System.out.println(t2.getState());
      t2.join();

      //Terminated
      System.out.println(t2.getState());
    } catch (InterruptedException i) {
      Thread.currentThread().interrupt();
      i.printStackTrace();
    }
  }
}

class T2Class implements Runnable {

  public void run() {
    try{
      Thread.sleep(1000);
    } catch (InterruptedException i) {
      Thread.currentThread().interrupt();
      i.printStackTrace();
    }
    //WAITING
    System.out.println(MultithreadingWaitingTerminated.t1.getState());
  }
}
