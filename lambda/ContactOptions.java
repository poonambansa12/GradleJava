package lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * ContactOptions to people using Predicate and Function functions.
 */
public class ContactOptions {

  /**
   * Calling the given list of people.

   * @param persons List of persons.
   * @param pred predicate.
   */
  public void calls(List<Person> persons, Predicate<Person> pred) {
    Function<Person, String> messageToDrivers = per -> {
      System.out.print("Calling " + per.getGivenName() + " " + per.getSurName() + " at "
          + per.getPhoneNumber() + "\n");
      return "Calling " + per.getGivenName() + " " + per.getSurName() + " at "
          + per.getPhoneNumber();
    };

    for (Person p : persons) {
      if (pred.test(p)) {
        messageToDrivers.apply(p);
      }
    }
  }

  /**
   * Emailing the given list of people.

   * @param persons List of persons.
   * @param pred predicate.
   */
  public void emails(List<Person> persons, Predicate<Person> pred) {
    Function<Person, String> messageToDraftees = per -> {
      System.out.println("Emailing " + per.getGivenName() + " "
          + per.getSurName() + " at " + per.getEmail() + "\n");
      return "Emailing " + per.getGivenName() + " "
          + per.getSurName() + " at " + per.getEmail();
    };

    for (Person p : persons) {
      if (pred.test(p)) {
        messageToDraftees.apply(p);
      }
    }
  }

  /**
   * Mailing the given list of people.

   * @param persons List of persons.
   * @param pred predicate.
   */
  public void mails(List<Person> persons, Predicate<Person> pred) {
    Function<Person, String> messageToPilots = per -> {
      System.out.println("Mailing " + per.getGivenName() + " "
          + per.getSurName() + " at " + per.getAddress() + "\n");
      return "Mailing " + per.getGivenName() + " "
          + per.getSurName() + " at " + per.getAddress();
    };

    for (Person p : persons) {
      if (pred.test(p)) {
        messageToPilots.apply(p);
      }
    }
  }
}
