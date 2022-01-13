package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * This program checks if char to char conversion is possible for the given two strings.
 */
public class ConversionStream {

  /**
   * main method.
   *
   * @param args standard input params as a string of array.
   */
  public static void main(String[] args) {
    System.out.println("Check if char-to-char conversion is possible for aba to ata: "
        + conversion("aba", "ata"));
    System.out.println("Check if char-to-char conversion is possible for dfd to ere: "
        + conversion("dfd", "ere"));
    System.out.println("Check if char-to-char conversion is possible for ee to e: "
        + conversion("ee", "e"));
    System.out.println("Check if char-to-char conversion is possible for ee to ee: "
        + conversion("ee", "ee"));
    System.out.println("Check if char-to-char conversion is possible for asd to zxz: "
        + conversion("asd", "zxz"));
    System.out.println("Check if char-to-char conversion is possible for asd to zzz: "
        + conversion("asd", "zzz"));
    System.out.println("Check if char-to-char conversion is possible for ddd to zzz: "
        + conversion("ddd", "zzz"));
    System.out.println("Check if char-to-char conversion is possible for abad to dedc: "
        + conversion("abad", "dedc"));
    System.out.println("Check if char-to-char conversion is possible for abad to deda: "
        + conversion("abad", "deda"));
    System.out.println("Check if char-to-char conversion is possible for abad to aeaa: "
        + conversion("abad", "aeaa"));
  }

  /**
   * This is the conversion method that takes in two strings and
   * return true if char to char conversion is possible.
   *
   * @param s1 First string.
   * @param s2 Second string.
   * @return returns true is char-to-char conversion is possible for given strings, otherwise false.
   */
  public static boolean conversion(String s1, String s2) {

    Map<Character, Character> charMap = new HashMap<>();
    if (s1.length() != s2.length()) {
      return false;
    }

    for (int i = 0; i < s1.length(); i++) {
      if (charMap.containsKey(s1.charAt(i)) && charMap.get(s1.charAt(i)) != s2.charAt(i)) {
        return false;
      } else if (!charMap.containsKey(s1.charAt(i)) && charMap.containsValue(s2.charAt(i))) {
        return false;
      } else {
        charMap.putIfAbsent(s1.charAt(i), s2.charAt(i));
      }
    }
    return true;
  }
}
