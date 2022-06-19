package String.Medium;

import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st= sc.next();
        System.out.println("How many changes do you want?");
        int n= sc.nextInt();
        System.out.println("Longest repeating character replacement: ");
        System.out.println(longestRepeatingCharater(st,n));
    }

    private static int longestRepeatingCharater(String s, int k) {
        int[] mp = new int[26];
        int res=Integer.MIN_VALUE;
        int left=0,right=0;
        while (right<s.length()) {
            mp[s.charAt(right)-'A']++;
            int p=max(mp);
            if (right-left+1-p<=k) {
                if (right-left+1>res) {
                    res=right-left+1;
                }

            } else {
                mp[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return res;

    }
    private static int max(int[] mp) {
        int re=0;
        for (int i = 0; i < mp.length; i++) {
            re=Math.max(re,mp[i]);
        }
        return re;
    }
}
