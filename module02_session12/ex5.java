package module02_session12;

import java.util.Stack;

public class ex5 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < arr.length ; i++) {
            if (stack.isEmpty() || arr[i] > stack.peek()) {
                stack.push(arr[i]);
            }
        }

        System.out.println(stack);


        System.out.println(stack.peek());



    }
}
