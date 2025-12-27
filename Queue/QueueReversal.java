//Reverse a Queue 
//Time Complexity =O(n)
//Space Complexity=O(n)
/*A stack is LIFO and a queue is FIFO.
By pushing all queue elements onto a stack, we reverse their order.
Popping them back into the queue reverses the sequence. */
import java.util.*;
public class QueueReversal {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    
}
