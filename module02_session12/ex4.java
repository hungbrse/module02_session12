package module02_session12;

import java.util.Stack;

public class ex4 {

    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }
    public static void main(String[] args) {
        String[] expressions = {
                "s * (s – a) * (s – b) * (s – c)",
                "(– b + (b^2 – 4*a*c)^0.5) / (2*a)",
                "s * (s – a) * (s – b * (s – c)",
                "s * (s – a) * s – b) * (s – c)",
                "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"
        };

        for (String expression : expressions) {
            System.out.println(expression + " : " + isValidExpression(expression));
        }
    }
}
