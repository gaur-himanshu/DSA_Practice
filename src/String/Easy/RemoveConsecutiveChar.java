package String.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveConsecutiveChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st= sc.next();
        System.out.println("Is the given string is palindrome or not? ");
        System.out.println(removeConsecutiveChar(st));
    }

    private static String removeConsecutiveChar(String S) {
        /*HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        String t="";
        for (Map.Entry mp: map.entrySet()) {
            if ((int)mp.getValue()>0) {
                t+=mp.getKey();
            }
        }
        return t;*/
        String t="";
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i-1)!=S.charAt(i)) {
                t+=S.charAt(i-1);
            }

        }
        t+=S.charAt(S.length()-1);
        return t;
    }
}
