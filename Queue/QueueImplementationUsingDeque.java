import java.util.*;
public class QueueImplementationUsingDeque {
    public static class Queue{
        // Using ArrayDeque gives amortized O(1) enqueue with better cache locality and lower
        //  memory overhead than LinkedList, despite occasional O(n) resizing.

        Deque<Integer> dq = new ArrayDeque<>();
        //is Empty   Time Complexity= O(1)
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        //add        Time Complexity=Amortized O(1)
        public void add(int data){
            dq.addLast(data);
        }
        //remove     Time Complexity= O(1)
        public int remove(){
            return dq.removeFirst();
        }
        //Peek       Time Complexity= O(1)
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String args[]){
          Queue q =new Queue();
          q.add(1);
          q.add(2);
          q.add(3);
          while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
          }
    }
}
