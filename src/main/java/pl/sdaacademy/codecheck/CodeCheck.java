package pl.sdaacademy.codecheck;

import java.util.Stack;

public class CodeCheck {
    public static boolean checkParenthesis(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
            } else if ( ch == ']') {
                if (stack.pop() != '[') {
                    return false;
                }
            } else if ( ch == ')') {
                if (stack.pop() != '(') {
                    return false;
                }
            } else if ( ch == '}') {
                if (stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
