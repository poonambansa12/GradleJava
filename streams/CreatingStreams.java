package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/**
 * This class defines different ways of creating a stream.
 */
public class CreatingStreams {

  /**
   * Main method.

   * @param args standard input list of string.
   */
  public static void main(String[] args) {

    //Using a list
    List<String> list = Arrays.asList("a", "b", "c");
    Stream<String> stringStream = list.stream();
    System.out.println("String stream: " + stringStream.count());

    //Using Stream.of
    Stream<String> stringStream1 = Stream.of("a", "b", "c");
    System.out.println("String stream1: " + stringStream1
        .filter(element -> element.equals("a")).count());

    //Using empty stream
    Stream<String> emptyStream = Stream.empty();
    List<String> emptyList = emptyStream.collect(Collectors.toList());
    System.out.println("Empty list: " + emptyList.size());

    //Using a builder
    Stream<String> builderStream = Stream.<String>builder().add("a").add("b").add("c").build();
    System.out.println("Builder Stream: " + builderStream
        .collect(Collectors.joining(",", "[", "]")));

    //Using generate to create an infinite stream.
    Stream<String> generateStream = Stream.generate(() -> "value").limit(10);
    long generateCount = generateStream.map(element -> {
      System.out.println(element);
      return element.toLowerCase();
    }).filter(x -> x.equals("value")).count();
    System.out.println(generateCount);

    //Using iterate to create an infinite stream.
    Stream<Integer> iterateStream = Stream.iterate(1, n -> n + 1).limit(5);
    System.out.println("Iterate Stream in parallel for count of even numbers: "
        + iterateStream.parallel().filter(n -> n % 2 == 0).count());

    //Using Int Stream, LongStream and DoubleStream interfaces.
    IntStream integerStream = IntStream.range(1, 5);
    DoubleStream doubleStream = integerStream.asDoubleStream();
    System.out.println("Double stream sum: " + doubleStream.sum());
    //integerStream.collect(Collectors.averagingDouble(integerStream::count));
    //Once stream is used and converted into another stream, the source stream becomes unreachable.

    LongStream longStream = LongStream.rangeClosed(1, 4);
    System.out.println("Long stream: " + longStream);

    System.out.println(Runtime.getRuntime().availableProcessors());

  }
}
