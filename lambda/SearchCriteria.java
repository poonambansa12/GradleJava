package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class SearchCriteria {

  private final Map<String, Predicate<Person>> searchMap = new HashMap<>();

  public SearchCriteria() {
    super();
    initSearchMap();
  }

  private void initSearchMap() {
    Predicate<Person> allDrivers = p -> p.getAge() >= 16;
    Predicate<Person> allDraftees = p -> p.getAge() >= 18 && p.getAge() <= 30;
    Predicate<Person> allPilots = p -> p.getAge() >= 25 && p.getAge() <= 65;

    searchMap.put("allDrivers", allDrivers);
    searchMap.put("allDraftees", allDraftees);
    searchMap.put("allPilots", allPilots);
  }

  public Predicate<Person> getCriteria(String predicateName) {

    Predicate<Person> target = searchMap.get(predicateName);

    if (target == null) {
      System.out.println("Search criteria not found");
      System.exit(1);
    }

    return target;
  }

  public static SearchCriteria getInstance() {
    return new SearchCriteria();
  }

}
