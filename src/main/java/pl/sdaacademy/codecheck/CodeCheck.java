package pl.sdaacademy.codecheck;

import java.util.Stack;

public class CodeCheck {
    public String checkParenthesis(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
            } else if ( ch == ']') {
                if (stack.pop() != '[') {
                    return "niepoprawnie";
                }
            } else if ( ch == ')') {
                if (stack.pop() != '(') {
                    return "niepoprawnie";
                }
            } else if ( ch == '}') {
                if (stack.pop() != '{') {
                    return "niepoprawnie";
                }
            }
        }
        return "poprawnie";
    }
}
