package module02_session12;

import java.util.LinkedList;
import java.util.Queue;

public class ex6 {
    public static void main(String[] args) {
        int[] arr = {33, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }

        System.out.println(q.peek());


        int min = findMid(q);

        System.out.println(min);

    }

    public static int findMid (Queue<Integer> q) {
        if (q.isEmpty()) {
            throw  new RuntimeException("không được để Queue rỗng ");
        }

        int min = q.peek();

        for (int n : q) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

}
