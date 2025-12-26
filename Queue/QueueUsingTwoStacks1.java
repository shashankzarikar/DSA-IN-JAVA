import java.util.*;
public class QueueUsingTwoStacks1 {
    public static class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        //is empty Time Complexity=O(1)
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add   time complexity=O(n)
        public void add(int data){
            //First pop all elements in a s1 and push them to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            //add new element into s1
            s1.push(data);

            //pop all elements from s2 and push them into s1 
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //Remove Time complexity=O(1)

        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return s1.pop();
        }

        // Peek Time Complexity=O(1)

        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
        }

    }
}
