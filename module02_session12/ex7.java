package module02_session12;

import java.util.Comparator;
import java.util.Stack;

public class ex7 {
    public static void main(String[] args) {

        String str = "987654321";
        Stack<String> stack = new Stack<>();
        boolean check = false;

        for (int i = 0; i < str.length(); i++) {
            stack.push(String.valueOf(str.charAt(i)));
        }

        // Kiểm tra xem stack có được sắp xếp theo thứ tự giảm dần không
        for (int i = 0; i < stack.size() - 1; i++) {
            if (stack.get(i).compareTo(stack.get(i + 1)) > 0) {
                check = true;
                break;
            }
        }

        System.out.println("chuỗi đầu vào có giảm giần hay không ? : " + check);
        System.out.println(stack);




    }
}
