package module02_session12;

import java.util.Stack;

public class ex2 {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' || c == '}' || c == ']') {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {


        String input = "{[(]]}";

        if (isBalanced(input)) {
            System.out.println("Chuỗi đúng.");
        } else {
            System.out.println("Chuỗi không đúng.");
        }
    }
}
