package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Program to try reduce method of Type Stream.
 */
public class StreamReduce {

  /**
   * Main method.

   * @param args standard input as list of string.
   */
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,6,4,3,5,3,2);

    Integer total = list.stream().reduce(2, Integer::sum);
    Optional<Integer> totalOptional = list.stream().reduce(Integer::sum);

    System.out.println("Total is: " + total);
    totalOptional.ifPresent(t -> System.out.println("Total Optional is: " + t) );

  }
}
