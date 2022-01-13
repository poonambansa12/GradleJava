package problems;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {2,4,1,6,3};

        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] a) {
        int firstElement = Integer.MIN_VALUE;
        int secondElement = Integer.MIN_VALUE;

        if(a == null || a.length < 2) {
            return -1;
        }

        for(int element : a){
            if(element > firstElement) {
                secondElement = firstElement;
                firstElement = element;
            } else if(element > secondElement) {
                secondElement = element;
            }
        }
        return secondElement;
    }
}
