import java.util.*;

public class StackUsingDeque {
    public static class MyStack {
        Deque<Integer> dq = new ArrayDeque<>();

        // isEmpty Time Complexity= Amortized O(1)
        public boolean isEmpty() {
            return dq.isEmpty();
        }

        // push Time Complexity= Amortized O(1)
        public void push(int data) {
            dq.addLast(data);
        }

        // Pop Time Complexity=Amortized O(1)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return dq.removeLast();
        }

        // peek Time Complexity=Amortized O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return dq.getLast();
        }
    }

    public static void main(String args[]) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}