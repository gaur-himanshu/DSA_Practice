package String.Easy;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st= sc.next();
        System.out.println("Is the given string is palindrome or not? ");
        System.out.println(validPalindrome(st));
    }

    /*private static boolean validPalindrome(String st) {
        st=((st.replaceAll("[^a-zA-Z0-9]","")).trim()).toLowerCase();
        int begin=0;
        int end=st.length()-1;
        while(begin<=end) {
            if(st.charAt(begin)!=st.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }*/
    private static boolean validPalindrome(String s) {
        int begin=0;
        int end=s.length()-1;
        while(begin<=end) {
            char startchar = Character.toLowerCase(s.charAt(begin));
            char endchar = Character.toLowerCase(s.charAt(end));
            if(isAlphaNumeric(startchar)&&!isAlphaNumeric(endchar)) {
                end--;
            }
            else if (!isAlphaNumeric(startchar)&&isAlphaNumeric(endchar)) {
                begin++;
            }
            else if (isAlphaNumeric(startchar)&&isAlphaNumeric(endchar)&&startchar!=endchar) {
                return false;
            }
            else {
                begin++;
                end--;
            }
        }
        return true;
    }

    private static boolean isAlphaNumeric(char c) {
        if (c>='0'&&c<='9' || c>='a'&&c<='z') {
            return true;
        }
        return false;
    }
}
