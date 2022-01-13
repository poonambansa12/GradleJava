package problems;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {
        System.out.println(product(12345,334));
    }

    public static int product(int number1, int number2) {
        int sum = 0;

        for (int i=0; i<number2; i++) {
            sum += number1;
        }
        return sum;
    }

}
