package problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.System;

public class CountAndSay {

  public static void main (String[] args) {
    System.out.println("3422 is: "+ countAndSay(3422));
    System.out.println("231455 is: "+ countAndSay(231455));
    System.out.println("22411 is: "+ countAndSay(22411));
  }

  public static String countAndSay(int n) {
    String s = "" + n;

    if(s.length()==1) {
      return s;
    }

    Map<Character,Integer> map = new LinkedHashMap<>();

    for(int i=0;i<s.length();i++)
      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

    String result = "";
    for(Map.Entry<Character, Integer> m : map.entrySet()) {
      //System.out.println("Result: " + result + "Key: " + m.getValue() + "Value: " + m.getKey());
      result = result + m.getValue() + m.getKey();
    }
    return result;
  }
}