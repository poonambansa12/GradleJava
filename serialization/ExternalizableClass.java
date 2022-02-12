package serialization;

import java.io.*;

/**
 * Externalization example.
 */
public class ExternalizableClass implements Externalizable {

  Person person = new Person();

  /**
   * Implementing writeExternal method of Externalizable.
   * @param out object of ObjectOutput
   * @throws IOException throws exception
   */
  public void writeExternal(ObjectOutput out)
      throws IOException
  {
    // Writing name and age to file
    out.writeObject(person.name);
    out.writeInt(person.id);
  }

  /**
   * Implementing readExternal method of Externalizable.
   * @param in Object of ObjectInput
   * @throws IOException throws Input output exception
   * @throws ClassNotFoundException throws Class not found exception
   */
  public void readExternal(ObjectInput in)
      throws IOException, ClassNotFoundException
  {
    // Reading name from file
    this.person.name = (String)in.readObject();

    // Reading id from file
    this.person.id = in.readInt();
  }

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
