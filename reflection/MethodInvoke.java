package reflection;

import java.lang.reflect.Method;
import serialization.Student;

/**
 * Reflection example to invoke a method.
 */
public class MethodInvoke {

  /**
   * main method.
   *
   * @param args standard input params as a string of array.
  */
  public static void main(String[] args) {
    try {
      Class<?> c = Class.forName("serialization.Student");
      System.out.println(c);
      Method method = c.getMethod("getPhone", int.class);

      System.out.println(method);
      Student student = new Student();
      Object o1 = method.invoke(student, 1);
      Object o2 = method.invoke(student, 2);

      System.out.println((int) o1);
      System.out.println((int) o2);

    } catch (Throwable t) {
      t.printStackTrace();
    }
  }
}
