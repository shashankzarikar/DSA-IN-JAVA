/*Given two arrays A and B of equal length n.
You must pair each element of array A with exactly one element of array B, such that each element of B is used once.
The goal is to minimize the sum of absolute differences of all paired elements. */
//Time Complexity=O(nlogn) because of sorting 

import java.util.*;
public class MinSumAbsDiff {
    public static void main(String args[]){
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        //Sort Arrays
        Arrays.sort(A);
        Arrays.sort(B);
        
        int minDiff=0;
        for(int i=0;i<A.length;i++) {
            minDiff+=Math.abs(A[i]-B[i]);
        }

        System.out.println("Minimum Absolute Difference : " + minDiff);
    }
    
}
