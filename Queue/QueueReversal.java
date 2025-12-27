
//Reverse a Queue 
//Time Complexity =O(n)
//Space Complexity=O(n)

import java.util.*;

public class QueueReversal {
    /*
     * A stack is LIFO and a queue is FIFO.
     * By pushing all queue elements onto a stack, we reverse their order.
     * Popping them back into the queue reverses the sequence.
     * Time Complexity =O(n)
     * Space Complexity=O(n)
     */
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    // We can solve this using recursion
    // Time Complexity =O(n)
    // Space Complexity=O(n)
    public static void reverse2(Queue<Integer> q) {
        if (q.isEmpty())
            return;

        int front = q.remove();
        reverse(q);
        q.add(front);
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            q.add(i);
        }
        reverse(q);
        System.out.println(q);
    }

}
