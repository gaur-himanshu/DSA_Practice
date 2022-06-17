package String.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String s= sc.next();
        System.out.println("Enter the second String: ");
        String t = sc.next();
        System.out.println("Is the given strings are anagarm or not? ");
        System.out.println(validAnagram(s,t));
    }

    private static boolean validAnagram(String s, String t) {
//        int c=0;
        if (s.length()!=t.length()) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);


        }

        for (Integer c: map.values()) {
            if (c!=0) {
                return false;
            }
        }
        return true;

        /*int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i]!=0) {
                return false;
            }

        }
        return true;*/
    }
}
