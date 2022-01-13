package problems;

import java.util.HashSet;
import java.util.Set;

public class ReturnOddCharacters {

    public static void main(String[] args) {
        String str = "fieugfiuedkewhfhefeh";
        Set<Character> chars = new HashSet<>();

        for(int i=0; i< str.length(); i++) {
            Character c = str.charAt(i);
            if(chars.contains(c)) {
                chars.remove(c);
            } else {
                chars.add(c);
            }
        }
        for(Character c: chars) {
            System.out.println(c);
        }
    }
}
