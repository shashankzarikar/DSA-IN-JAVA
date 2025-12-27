
/* Problem :- Given an integer N, generate and print the binary representations of all numbers
 from 1 to N in increasing order of their decimal values. */
//Time Complexity=O(n)
//Space Complexity=O(n)
import java.util.*;
public class PQ1 {

    public static void main(String args[]){
        int n=5;
        Queue<String> q=new ArrayDeque<>();
        //Push 1 in Queue
        q.add("1");

        for(int i=1;i<=n;i++){
            //pop front
            String front =q.remove();
            //print front
            System.out.print(front+" ");
            //add (front+"0") and (front+"1") in the queue
            q.add(front+"0");
            q.add(front+"1");      
        }

       
    }
    
}
