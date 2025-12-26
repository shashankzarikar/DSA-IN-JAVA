import java.util.*;
public class StackUsingTwoQueue2 {
    public static class Stack{
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();

        //is empty    Time Complexity=O(1)
        public boolean isEmpty(){
            return q1.isEmpty();
        }

        //Push        Time Complexity=O(n)
        public void push(int data){
             while(!q1.isEmpty()){
                q2.add(q1.remove());
             }
             q1.add(data);
             while(!q2.isEmpty()){
                q1.add(q2.remove());
             }
        } 
        
        //Pop         Time Complexity=O(1)
        public int pop(){
            if(q1.isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            return q1.remove();
        }

        //Peek         Time Complexity=O(1)
        public int peek(){
            if(q1.isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            return q1.peek();
        }


    }
    public static void main(String args[]){
          Stack s=new Stack();
          s.push(1);
          s.push(2);
          s.push(3);
          while(!s.isEmpty()){
             System.out.println(s.peek());
             s.pop();
          }
    }
    
}
