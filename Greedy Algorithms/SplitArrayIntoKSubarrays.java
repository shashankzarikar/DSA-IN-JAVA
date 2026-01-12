/*Given an integer array nums and an integer k, split nums into k non-empty subarrays 
such that the largest sum of any subarray is minimized.Return the minimized largest sum of the split.
A subarray is a contiguous part of the array. 
Time Complexity=O(n * log S) S= Max sum value
Space Complexity=O(1)
*/
public class SplitArrayIntoKSubarrays {
    public static boolean canSplit(int nums[],int k,int mid){
        int subarray=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if((sum+nums[i])>mid){
                subarray++;
                sum=0;
            }
            sum+=nums[i];
        }
        return subarray<=k;
    }
    public static int splitArray(int[] nums, int k) {
        //minimum answer we can get
        int low=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
        }
        //maximum answer we can get
        int high=0;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
        }
        
        //perform binary search on low and high
        while(low<high){
            int mid=low+(high-low)/2;
            if(canSplit(nums,k,mid)){
                //try smaller max value
                high=mid;
            }
            else{
                //need bigger max value
                low=mid+1;
            }
        
        }
        return low;
       
    }
    public static void main(String args[]){
        int nums[]={7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(nums,k));
    }
}
    

