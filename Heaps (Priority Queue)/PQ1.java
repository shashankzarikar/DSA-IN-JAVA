/*
Question:
---------
K'th Largest Element in a Stream

Given a stream of integers and an integer k, print the k'th largest
element after each new element is received.

If fewer than k elements have been seen so far, output -1.

Example:
Input:
stream = {10, 20, 11, 70, 50, 40, 100, 5}
k = 3

Output:
{-1, -1, 10, 11, 20, 40, 50, 50}

Approach:
---------
1. Maintain a Min Heap of size k.
2. Insert the first k elements into the heap.
3. The root (peek()) of the Min Heap is the k'th largest element.
4. For every new element:
   - If the element is greater than peek():
       -> Remove the root.
       -> Insert the new element.
   - Otherwise, ignore it.
5. After processing each element:
   - If heap size < k, output -1.
   - Else, output peek().

Time Complexity:
----------------
Building first k elements : O(k log k)
Processing remaining      : O((n - k) log k)

Overall:
O(n log k)

Space Complexity:
-----------------
O(k)
*/
import java.util.*;

public class PQ1 {
    public static void main(String args[]){

        int streams[]={10, 20, 11, 70, 50, 40, 100, 5};
        int k=3;

         PriorityQueue<Integer> pq=new PriorityQueue<>();
         ArrayList<Integer> result =new ArrayList<>();
         int i=0;
         while(i<k){
            pq.add(streams[i]);
            i++;
            if(i<k){
                result.add(-1);
            }
         }
         result.add(pq.peek());
         while(i<streams.length){

            if(pq.peek()<streams[i]){
                pq.remove();
                pq.add(streams[i]);
            }
            result.add(pq.peek());
            i++;
         }

         System.out.println(result);


    }
}
