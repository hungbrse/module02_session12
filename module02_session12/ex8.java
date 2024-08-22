package module02_session12;

import java.util.Stack;

public class ex8 {
    public static void main(String[] args) {

        String str = "2356";
        String[] arr = str.split("");
        Stack<Integer> stack = new Stack<>();
        for (String s : arr) {
            int number = Integer.parseInt(s);
            stack.push(number);
        }


        System.out.println(stack);
        boolean allIsPrime = true;
        for (int i = 0; i < stack.size(); i++) {
            if (!isPrime(stack.get(i))) {
                allIsPrime = false;
            }
        }

        if (allIsPrime) {
            System.out.println("Stack là một mảng số nguyên tố ");
        } else {
            System.out.println("Stack không phải là  mảng số nguyên tố ");
        }
    }

    public  static boolean isPrime(int n) {

        boolean check = true;

        if (n == 1) {
            return false;
        }



        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                check = false;
            }
        }
        return check;
    }
}




