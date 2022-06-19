package String.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st= sc.next();
        System.out.println("Longest Substring Without Repeating Characters in given string");
        System.out.println(longestSubstringWithoutRepeat(st));
    }

    private static int longestSubstringWithoutRepeat(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len=0;
        int stan=0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stan=Math.max(stan,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            len=Math.max(len,i-stan+1);
        }
        return len;
    }
}
