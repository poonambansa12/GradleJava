package Problems;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class ConversionStream {

    public static void main(String[] args) {
        System.out.println("Check if char-to-char conversion is possible for aba to ata: " + conversion("aba","ata"));
        System.out.println("Check if char-to-char conversion is possible for dfd to ere: " + conversion("dfd","ere"));
        System.out.println("Check if char-to-char conversion is possible for ee to e: " + conversion("ee","e"));
        System.out.println("Check if char-to-char conversion is possible for ee to ee: " + conversion("ee","ee"));
        System.out.println("Check if char-to-char conversion is possible for asd to zxz: " + conversion("asd","zxz"));
        System.out.println("Check if char-to-char conversion is possible for asd to zzz: " + conversion("asd","zzz"));
        System.out.println("Check if char-to-char conversion is possible for ddd to zzz: " + conversion("ddd","zzz"));
        System.out.println("Check if char-to-char conversion is possible for abad to dedc: " + conversion("abad","dedc"));
        System.out.println("Check if char-to-char conversion is possible for abad to deda: " + conversion("abad","deda"));
        System.out.println("Check if char-to-char conversion is possible for abad to aeaa: " + conversion("abad","aeaa"));
    }

    public static boolean conversion(String s1, String s2) {

        Map<Character, Character> charMap = new HashMap<>();
        if(s1.length() != s2.length()) {
            return false;
        }

        for(int i=0; i<s1.length(); i++) {
            if (charMap.containsKey(s1.charAt(i)) && charMap.get(s1.charAt(i)) != s2.charAt(i)) {
                return false;
            } else if (!charMap.containsKey(s1.charAt(i)) && charMap.containsValue(s2.charAt(i))) {
                return false;
            } else {
                charMap.putIfAbsent(s1.charAt(i),s2.charAt(i));
            }
        }
        return true;
    }
}
