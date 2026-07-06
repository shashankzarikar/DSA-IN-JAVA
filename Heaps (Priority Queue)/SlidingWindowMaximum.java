/*
 Sliding Window Maximum

 Problem:
 Given an integer array `nums` and a sliding window size `k`, return an array
 of the maximum values in each sliding window as it moves from left to right.

 Example: nums = [1,3,-1,-3,5,3,6,7], k = 3 -> output [3,3,5,5,6,7]

 Time complexity:
 - Deque (monotonic queue) solution: O(n) time, O(k) extra space.
 - PriorityQueue (heap) lazy-removal approach: O(n log k) time, O(n) worst-case space.
*/
import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String args[]){
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;

        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->nums[b]-nums[a]);
        int result[]=new int[nums.length-k+1];

        int i=0;

        while(i<k){
            pq.add(i);
            i++;
        }
        result[0]=nums[pq.peek()];

        while(i<nums.length){
            while(!pq.isEmpty() && pq.peek() <= i-k){
                pq.remove();
            }
            pq.add(i);
            result[i-k+1]=nums[pq.peek()];
            i++;
        }

        for( i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
    
}
