/*Problem : You have n ropes with given lengths. You want to connect all
 ropes into one rope. The cost of connecting two ropes is equal to the 
 sum of their lengths. The goal is to minimize the total cost.
  
 Time Complexity=O(nlog n)
 Space Complexity=O(n)

Approach:
1)We want to find the minimum total cost to connect all ropes.
2)If we combine ropes randomly, longer ropes may be combined first. Since the cost of combining two ropes is their sum, combining long ropes early increases the total cost repeatedly.
3)To avoid this, we use a priority queue (min-heap) to always combine the two smallest ropes first.
4)The priority queue ensures that remove() always gives the smallest rope, not the first inserted one.
5)By always combining the smallest ropes, we minimize the incremental cost at each step, which leads to the minimum total cost overall.*/

import java.util.*;
public class PQ2 {
    public static int solution(int n, int arr[]){
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0;i<n;i++){
            pq.add(arr[i]);
         }
         int totalcost=0;
         while(pq.size()>1){
            int first=pq.remove();
            int second=pq.remove();
            int newrope=first+second;
            totalcost+=newrope;
            pq.add(newrope);
         }
         return totalcost;
    }
    public static void main(String args[]){
        int n=4;
        int arr[]={4,3,2,6};
        System.out.println(solution(n,arr));

    }
    
}
