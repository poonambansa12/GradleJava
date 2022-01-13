package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Externalization example.
 */
public class ExternalizableClass {

  /**
   * main method.
   *
   * @param args standard input params as a string of array.
   */
  public static void main(String[] args) {
    try {
      Person p = new Person(2, "Bansal", 234);

      ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("e.txt"));
      objectOutputStream.writeObject(p);
      System.out.println("Externalized");

    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("e.txt"));
      Person p = (Person) objectInputStream.readObject();

      System.out.println(p.id + " " + p.name + " " + p.phone);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
