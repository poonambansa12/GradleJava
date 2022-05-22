package problems;

import java.util.concurrent.ThreadPoolExecutor;

public class BuyAndSell {

  public static int buyAndSell(int[] arr) {
    int len = arr.length-1;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int profit=0;
    int i=0;
    while(i<len) {
      while(i<len && arr[i]>=arr[i+1])
        i++;
      min=arr[i];

      while(i<len && arr[i]<arr[i+1])
        i++;
      max = arr[i];

      profit += max-min;
    }

    return profit;
  }

  public static void main (String[] args) {
    System.out.println("new int[]{2,5,3,7,6,2,3} is: "+ buyAndSell(new int[]{2,5,3,7,6,2,3}));
    System.out.println("new int[]{5,2,8,7,6,1,3} is: "+ buyAndSell(new int[]{5,2,8,7,6,1,3}));
    System.out.println("new int[]{8,5,3,7,6,2,1} is: "+ buyAndSell(new int[]{8,5,3,7,6,2,1}));
  }
}
