// Target Sum Subset Problem:
// Given an array of positive integers and a target sum,
// determine whether there exists subset of the array
// whose elements add up exactly to the target.

public class TargetSumSubsetRecursion{
    public static boolean targetSumSubset(int arr[],int i,int sum,int target){

        if(target==0) return true;
        
        if(i==arr.length) return false;
        
        if(arr[i]+sum==target){
            return true;
        }else if(arr[i]+sum<target){
            //include arr[i]         ||    exclude arr[i]
            return targetSumSubset(arr,i+1,sum+arr[i],target) || targetSumSubset(arr,i+1,sum,target);
        }else{
            // exclude arr[i]
            return targetSumSubset(arr,i+1,sum,target);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,5,65};
         System.out.println(targetSumSubset(arr,0,0,64));
    }
}