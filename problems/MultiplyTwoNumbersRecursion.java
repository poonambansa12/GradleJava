package problems;

public class MultiplyTwoNumbersRecursion {

    public static void main(String[] args) {
        System.out.println("Product: " + product(5,7));
        System.out.println("Product: " + product(-5,7));
        System.out.println("Product: " + product(5,-7));
        System.out.println("Product: " + product(-5,-7));
    }

    public static int product(int x, int y) {
        if(x == 0 || y == 0) {
            return 0;
        }

        if(y > 0) {
            return x + product(x, y-1);
        } else {
            return -product(x,-y);
        }
    }
}
