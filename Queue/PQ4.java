/*You are given a queue of integers and an integer k. Your task is to reverse the order 
of the first k elements of the queue while keeping the remaining elements in the same relative order. */

//Time complexity =O(n)
//Space complexity=O(k)
import java.util.*;

public class PQ4 {
    public static void reverseKelements(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        // If k is greater than size reinitialise it to k= size to avoid runtime failure
        if (k > size) {
            k = size;
        }
        // Remove first k elements from queue and add into stack
        for (int i = 1; i <= k; i++) {
            s.push(q.remove());
        }
        // remove elements from stack and add into queue (order reversed)
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        //// Rotate the remaining elements in the queue to maintain their relative order
        for (int i = 1; i <= size - k; i++) {
            q.add(q.remove());
        }

    }

    public static void main(String args[]) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i * 10);
        }
        System.out.println(q);
        reverseKelements(q, 5);
        System.out.println(q);
    }

}
