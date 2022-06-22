package String.Medium;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.next();
        System.out.print("Longest palindromic Substring is: " + longestPalindromicSubstring(s));
    }

    private static String longestPalindromicSubstring(String s) {

        int begin=0,maxLen=0;
        for (int i = 0; i < s.length(); i++) {
            int oddLen=isPalindrom(s,i,i),evenLen=isPalindrom(s,i,i+1);
            int len = Math.max(oddLen,evenLen);
            if (maxLen<len) {
                maxLen=len;
                begin=i-(len-1)/2;
            }

        }
        return s.substring(begin,begin+maxLen);
    }

    private static int isPalindrom(String substring,int begin,int end) {

        if (end<begin){
            return 0;
        }
        if (substring==null) {
            return 0;
        }
        while(begin>=0 && end<substring.length() && substring.charAt(begin)==substring.charAt(end)) {
            begin--;
            end++;

        }
        return end-begin-1;
    }

//    private static boolean isPalindrom(String substring,) {
//        StringBuilder s=new StringBuilder(substring);
//        s=s.reverse();
//        String st=s.toString();
//        if (substring.equals(st)){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
}
