package String.Easy;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String st= sc.next();
        System.out.println("Is the given string is palindrome or not? ");
        System.out.println(validParenthesis(st));
    }

    private static boolean validParenthesis(String s) {
        Stack st = new Stack<>();
        for (char cha:s.toCharArray()) {
            if(cha=='{' || cha=='[' || cha=='(') {
                st.push(cha);
            }
            else {
                if (st.isEmpty()) {
                    return false;
                }
                char ch = (char) st.pop();
                if (ch=='{'&&cha!='}' || ch=='['&&cha!=']' || ch=='('&&cha!=')') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
