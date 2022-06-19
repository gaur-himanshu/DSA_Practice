package String.Easy;

import java.util.Scanner;

public class LongestCommonPreFix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many strings do you want?");
        int n= sc.nextInt();
        String[] st =new String[n];
        System.out.println("Enter " + n + "Strings.");
        for (int i = 0; i < n; i++) {
            st[i]= sc.next();
        }
        System.out.println("Longest Common Prefix in the given String");
        System.out.println(longestCommonPrefix(st));
    }

    private static String longestCommonPrefix(String[] strs) {
        int min =strs[0].length();
        for (int i = 1; i < strs.length ; i++) {
            if (min> strs[i].length()) {
                min=strs[i].length();
            }
        }
        if (min==0) {
            return "";
        }
        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i)!=strs[j].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,min);
    }
}
