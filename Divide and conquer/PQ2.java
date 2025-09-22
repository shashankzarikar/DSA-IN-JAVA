import java.util.*;
public class PQ2 {
    class Solution {
    public static int majority(int nums[],int si,int ei){
        if(si==ei){
            return nums[si];
        }
        int mid=si+(ei-si)/2;

        int left=majority(nums,si,mid);
        int right=majority(nums,mid+1,ei);

        if(left==right){
            return left;
        }
        else{
            int leftcount=0;
            int rightcount=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==left){
                    leftcount++;
                }
                if(nums[i]==right){
                    rightcount++;
                }

            }
         
            return ( leftcount>rightcount )? left:right;
        }
    }
    public int majorityElement(int[] nums) {
       /* for(int i=0;i<nums.length;i++) {
            int count=1;
        for(int j=i+1;j<nums.length;j++) {
            
            if(nums[i]==nums[j]){
                count++;
               
             }
             
        }
        int n=nums.length;
        if(count>n/2){
            return nums[i];
        }
        }
        return 0;
        
    }*/
    Arrays.sort(nums);
    
   return majority(nums,0,nums.length-1);
}
}
    
}
