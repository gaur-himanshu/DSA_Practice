package String.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class SmallestSubstringContainAllCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s= scanner.next();
        System.out.println("Enter the Substring: ");
        String sub=scanner.next();
        System.out.print("Smallest window which contain all charaters " + smallestWindow(s,sub));
    }

    private static String smallestWindow(String s, String p) {
        if (s.length()==0||p.length()==0||p.length()>s.length()) {
            return "-1";
        }
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            mp.put(p.charAt(i),mp.getOrDefault(p.charAt(i),0)+1);
        }
        String re="";
        int n= mp.size();
        int begin=0;
        int minLen = Integer.MAX_VALUE;
        int count=0;
        char[] ch = s.toCharArray();
        int ind=0;
        HashMap<Character,Integer> mpm= new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (mp.containsKey(ch[i])) {
                mpm.put(ch[i],mpm.getOrDefault(ch[i],0)+1);
                if (mp.get(ch[i])==mpm.get(ch[i])){
                    count++;
                }
            }
            if (count==n) {
                while(!mpm.containsKey(ch[ind])||mp.get(ch[ind])<mpm.get(ch[ind])) {
                    if (!mpm.containsKey(ch[ind])) {
                        ind++;
                    } else if (mp.get(ch[ind]) < mpm.get(ch[ind])) {
                        mpm.put(ch[ind],mpm.get(ch[ind])-1);
                        ind++;
                    }
                }
            }
            int min=i-ind+1;
            if (min<minLen) {
                begin=ind;
                minLen=min;
            }

        }
        if (minLen==Integer.MAX_VALUE) {
            return "-1";
        }
        return s.substring(begin,begin+minLen);


    }
}
