package String.Medium;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Strings: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Strings: ");
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();
        }
        System.out.print("Grouped Anagrams are: " + groupAnagram(s));
    }

    private static List<List<String>> groupAnagram(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] frq = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);
                frq[ch-'a'] = frq[ch-'a']+1;
            }
            StringBuilder st = new StringBuilder();
            for (int j = 0; j < frq.length; j++) {
                st.append(frq[j]+" ");
            }
            String s= st.toString();
            if (!mp.containsKey(s)) {
                mp.put(s,new ArrayList<>());
            }
            mp.get(s).add(strs[i]);
        }
        List<List<String>> str = new ArrayList<>();
        str.addAll(mp.values());
//        Collections.sort(s);
        return str;
    }
}
