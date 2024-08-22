package module02_session12;

import java.util.Scanner;
import java.util.Stack;

public class ex1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng từ: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            stack.push(word);
        }

        System.out.println(stack);


        System.out.println("Các từ theo thứ tự đảo ngược là:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


    }
}
