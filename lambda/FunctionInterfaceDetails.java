package lambda;

import java.util.function.Function;

/**
 * Details of FunctionalInterface.
 */
public class FunctionInterfaceDetails {

  /**
   * main method.
   *
   * @param args standard input params as a string of array.
   */
  public static void main(String[] args) {
    Function<String, String> fn = param -> param + " is anything";

    /*

    Instead of creating an interface which has only one abstract method and this method is being
    defined in a concrete class, we can essentially write the code of the function
    in the form of lambda.
     * R apply(T t); -> the only abstract method in Function functionalInterface.
     * The function is applied to input parameter. R is the result of the function.
     *
     * default <V> Function<V, T> compose(Function<? super V, ? extends T> before) {
     * return (V v) -> apply(before.apply(v));
     * }
     * applies before function to the input of before and
     then applies the function to the result of before.
     *
     * default <T> Function<R, T> andThen(Function<? super V, ? extends T> after) {
     * return (R r) -> after.apply(apply(r));
     * }
     * applies this function to it's input and the after function is applied to the output later on.
     *
     * static <T> Function<T, T> identity() {
     * return t -> t;
     * }
     * always return it's input parameters
     */
  }
}
