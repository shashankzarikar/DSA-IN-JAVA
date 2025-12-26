import java.util.*;

public class QueueUsingTwoStacks2 {
    
    public static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // is empty() Time Complexity=O(1)
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add Time Complexity=O(1)
        public void add(int data) {
            s1.push(data);
        }

        // Remove Time Complexity=O(n)
        public int remove() {
            // First pop all elements from s1 and push all of them in s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // pop element from s2
            int val = s2.pop();
            // Then pop all elements from s2 and push all of them in s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return val;
        }

        // Peek Time Complexity=O(n)
        public int peek() {
            // First pop all elements from s1 and push all of them in s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // pop element from s2
            int val = s2.peek();
            // Then pop all elements from s2 and push them in s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return val;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
