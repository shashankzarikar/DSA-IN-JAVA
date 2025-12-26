import java.util.*;
public class QueueImplementation {
    public static void main(String args[]){
         Queue<Integer> q=new LinkedList<>();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         System.out.println(q.size());
         while(!q.isEmpty()){
            System.out.println(q.remove());
         }
         System.out.println(q.size());
         
    } 
    
}
