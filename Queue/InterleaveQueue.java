// Interleave two halves of a queue (Even length)


/*Approach :- We first divide the queue into two equal halves by moving the first half into a temporary queue.
The original queue now contains the second half.Then, we interleave by alternately enqueueing one element from 
the first half and one from the second half back into the original queue.Since queues follow FIFO order, the
relative ordering inside each half is preserved. */
import java.util.*;
public class InterleaveQueue {
    public static void solution(Queue<Integer> q){
        //First get the size of a queue
        int n=q.size();
        //Create a temp queue 
        Queue<Integer> temp=new LinkedList<>();
        //remove n/2 elements from queue and add them in temp queue
        for(int i=0;i<(n/2);i++){
            temp.add(q.remove());
        }
        /*remove one element from temp and add in q  then remove one element
         from q and add back to q , repeat this process until temp queue becomes empty*/
        while(!temp.isEmpty()){
            q.add(temp.remove());
            q.add(q.remove());
        }
    
    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        int n=q.size();
        solution(q);
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
