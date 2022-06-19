package String.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDupicates {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st= sc.next();
        System.out.println("List of duplicates are ");
        printDuplicates(st);
    }

    private static void printDuplicates(String st) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < st.length(); i++) {
            map.put(st.charAt(i), map.getOrDefault(st.charAt(i),0)+1);
        }
        for (Map.Entry mp: map.entrySet()) {
            if ((int)mp.getValue()>1) {
                System.out.println("number of duplicates of " + mp.getKey() + " are " + mp.getValue());
            }
        }
    }
}
