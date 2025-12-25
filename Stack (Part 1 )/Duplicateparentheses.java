/*
     Given a balanced expression, find if it contains duplicate parentheses or not.
     A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.

     Return true if it contains duplicates else return false.
     
     Time Complexity (TC): O(n) → We traverse each character of the string once.
     Space Complexity (SC): O(n) → Stack may store all characters in the worst case.
    */
import java.util.*;

public class Duplicateparentheses {
    public static boolean checkduplicateparentheses(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (s.peek() == '(') {
                    return true;
                }
                while (s.peek() != '(') {
                    s.pop();
                }
                s.pop();

            } else {
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String args[]) {
        String str = "(a+b)";
        System.out.println(checkduplicateparentheses(str));
    }

}
