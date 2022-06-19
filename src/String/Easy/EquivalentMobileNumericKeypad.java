package String.Easy;

import java.util.Scanner;

public class EquivalentMobileNumericKeypad {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st= sc.next();
        String[] keypad={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        System.out.println("Numeric keys are:");
        System.out.println(keypadNumeric(keypad, st));
    }

    private static String keypadNumeric(String[] keypad, String st) {
        String ans="";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i)==' ') {
                ans+="0 ";
            }
            else {
                ans=ans+keypad[st.charAt(i)-'A']+" ";
            }
        }
        return ans;
    }
}
