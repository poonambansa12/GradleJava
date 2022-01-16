package lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * ContactMethods class defines ways to establish contact with people based
 * on the criteria defined.
 */
public class ContactMethodsCall {

  /**
   * Main method.

   * @param args standard input as list of strings.
   */
  public static void main(String[] args) {

    List<Person> personList = Person.createShortList();
    ContactOptions contactOptions = new ContactOptions();

    /*
     * Conditions
     * allDrivers -> 16 above
     * allDraftees -> 18 to 30
     * allPilots -> 25 to 65
     */
    Predicate<Person> allDrivers = p -> p.getAge() >= 16;
    Predicate<Person> allDraftees = p -> p.getAge() >= 18 && p.getAge() <= 30;
    Predicate<Person> allPilots = p -> p.getAge() >= 25 && p.getAge() <= 65;

    contactOptions.calls(personList, allDrivers);
    contactOptions.emails(personList, allDraftees);
    contactOptions.mails(personList, allPilots);
  }
}
