package problems;

/**
 * Program to multiply all the digit of a given number.
 */
public class MultiplyDigitsInNumber {

  /**
   * main method.
   *
   * @param args standard input params as a string of array.
   */
  public static void main(String[] args) {
    int number = 123406;
    getMultipliedNumber(number);
  }

  /**
   * Method to get the multiplied number.
   *
   * @param number input parameter having the number to be multiplied.
   * @return returns the multiplied number.
   */
  public static int getMultipliedNumber(int number) {
    int result = 1;
    while (number > 0) {
      int digit = number % 10;
      if (digit == 0) {
        System.out.println("Number contains 0");
        return -1;
      }

      result *= digit;
      number = number / 10;
    }
    return result;
  }
}
