package module02_session12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex3 {

    public static boolean isPalindrome(String str) {

        String processedString = str.replaceAll("\\s+", "").toLowerCase();


        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Duyệt chuỗi và thêm từng ký tự vào Stack và Queue
        for (char c : processedString.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        // Kiểm tra các phần tử của Stack và Queue
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false; // Nếu có bất kỳ cặp nào không khớp, trả về false
            }
        }

        return true; // Nếu tất cả các cặp khớp nhau, trả về true
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" là một palindrome.");
        } else {
            System.out.println("\"" + str + "\" không phải palindrome.");
        }
    }
}
