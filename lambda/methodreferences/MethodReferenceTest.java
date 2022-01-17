package lambda.methodreferences;

/**
 * Testing MethodReference scenarios.
 */
public class MethodReferenceTest {

  /**
   * Main method.

   * @param args List of String as standard input.
   */
  public static void main(String[] args) {

    //Examples of methods references for non-static methods
    MethodReferenceNonStatic methodReferenceNonStatic = new MethodReferenceNonStatic();
    Printable printable = methodReferenceNonStatic::printSomething;
    printable.print();

    Thread t1 = new Thread(new MethodReferenceNonStatic()::printSomething);
    t1.start();

    //Examples of methods references for static methods
    Printable printable1 = MethodReferenceStatic::printSomething;
    printable1.print();

    Thread t2 = new Thread(MethodReferenceStatic::printSomething);
    t2.start();

    //Example of method reference for constructor
    Printable printable2 = MethodReferenceNonStatic::new;
    printable2.print();
  }
}
