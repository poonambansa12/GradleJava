package problems;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println("Reversed value of integer 345678 is: " + reverse(-345678));
    }

    public static int reverse(int num) {
        boolean isNegative = num<0;
        StringBuilder str = new StringBuilder(String.valueOf(Math.abs(num)));
        str.reverse();

        if(isNegative)
            str = new StringBuilder("-").append(Math.abs(num));
        return Integer.parseInt(str.toString());
    }
}
