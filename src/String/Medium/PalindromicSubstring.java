package String.Medium;

import javax.swing.*;
import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        String s=JOptionPane.showInputDialog(jf,"Enter the String");
        JOptionPane.showMessageDialog(jf,"Number of palindromic Substrings are: " + palindromicSubstring(s));
    }

    private static int palindromicSubstring(String s) {
//        int count=0;
//        boolean[][] dp=new boolean[s.length()][s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j>=0; j--) {
//                if ((s.charAt(i)==s.charAt(j))&&(i-j<=2||dp[i-1][j+1])){
//                    dp[i][j]=true;
//                    count++;
//                }
//            }
//        }
//        return count;
        int oddlen=0;
        int evenlen=0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            oddlen=isPalindrome(s,i,i);
            evenlen=isPalindrome(s,i,i+1);
            count+=oddlen+evenlen;
        }
        return count;

    }

    private static int isPalindrome(String s, int i, int j) {
        int t=0;
        while(i>=0&&j<s.length()){
            if (s.charAt(i)==s.charAt(j)){
                t++;
            } else {
                break;
            }
            i--;
            j++;
        }
        return t;
    }

}
