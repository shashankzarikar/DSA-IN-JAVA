// Question: Given n ropes, connect them with minimum cost.The 
// TC: O(n log n) because each insert/remove on the min-heap takes log n time.

import java.util.*;

public class ConnectNRopes{
    public static void main(String args[]){

        
        int ropes[]={2,3,3,4,6};

        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        
        int cost=0;
        while(pq.size()>1){
            int firstSmallest=pq.remove();
            int secondSmallest=pq.remove();

            int newRope=firstSmallest+secondSmallest;
            cost+=newRope;
            pq.add(newRope);
        }

        System.out.println("minimum cost to connect all rope is "+cost);
         
    }
}