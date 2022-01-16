package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import serialization.Person;

/**
 * This class creates a custom comparator using lambda.
 */
public class ComparatorTest {

  /**
   * Main method.

   * @param args standard input params.
   */
  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();

    Collections.sort(personList, new Comparator<Person>() {
      public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
      }
    });

    Collections.sort(personList, (p1, p2) -> p2.getName().compareTo(p1.getName()));
  }
}
