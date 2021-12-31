package Problems;

public class MultiplyDigitsInNumber {

    public static void main(String[] args) {
        int number = 123406;
        getMultipliedNumber(number);
    }

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
