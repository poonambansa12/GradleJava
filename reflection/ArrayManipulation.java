package reflection;

import java.lang.reflect.Array;

/**
 * class with example of array manipulation withthe use of reflection.
 */
public class ArrayManipulation {

  /**
   * main method.
   *
   * @param args standard input params as a string of array.
   */
  public static void main(String[] args) {
    int[] dims = new int[]{5, 10, 15};
    Object arr = Array.newInstance(Integer.TYPE, dims);

    Object arrobj = Array.get(arr, 3);
    Class<?> cls = arrobj.getClass().getComponentType();
    System.out.println(cls);
    arrobj = Array.get(arrobj, 5);
    Array.setInt(arrobj, 10, 37);

    int[][][] arrcast = (int[][][]) arr;

    System.out.println(arrcast[3][5][10]);

    for (int[][] array2D : arrcast) {

      for (int[] array1D : array2D) {

        for (int a : array1D) {
          System.out.print(a + "\t");
        }

        System.out.println();
      }
      System.out.println();
    }
  }
}