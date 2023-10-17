package DSA;

import java.util.*;
import java.io.*;

class Stack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String input = in.next();
            boolean isBalanced = isBalanced(input);
            System.out.println(isBalanced);
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }

                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ']' && top != '[') || (c == ')' && top != '(')) {
                    return false; // Mismatched brackets
                }
            }
        }

        return stack.isEmpty(); // Check if all brackets are matched
    }
}
