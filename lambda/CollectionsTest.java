package lambda;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CollectionsTest {

  public static void main(String[] args) {
    List<Person> personList = Person.createShortList();
    SearchCriteria searchCriteria = new SearchCriteria();

    List<Person> pilots = personList
        .stream()
        .filter(searchCriteria.getCriteria("allPilots"))
        .collect(Collectors.toList());

    int totalAgeOfDrivers = personList
        .stream()
        .filter(searchCriteria.getCriteria("allDrivers"))
        .mapToInt(Person::getAge)
        .sum();

    OptionalDouble avgAgeOfDraftees = personList.stream()
        .filter(searchCriteria.getCriteria("allDraftees"))
        .mapToLong(Person::getAge)
        .average();

    System.out.println("There are a total of " + pilots.size() + " many pilots");
    System.out.println("Sum of age of drivers is " + totalAgeOfDrivers);
    System.out.println("Avg age of draftees is " + avgAgeOfDraftees);
  }
}
