// Target Sum Subset Problem:
// Given an array of positive integers and a target sum,
// determine whether there exists subset of the array
// whose elements add up exactly to the target.

// Time Complexity = O(n*target) 
// Space Complexity =O(n*target)

public class TargetSumSubsetTabulation {
    public static boolean targetSumSubset(int arr[], int target) {
        // crete dp and dp[i][j]= first i number of items with target sum j can have TargetSumSubset
        boolean dp[][] = new boolean[arr.length + 1][target + 1];

        // base case if target=0 then answer is always true
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        // base case if number of items are zero and target > 0 then answer is false
        // but we dont have to implement this in java because java assign array values
        // as false by default

        for (int i = 1; i < arr.length + 1; i++) { // i=number of items in array
            for (int j = 1; j < target + 1; j++) { // j=target sum
                if (arr[i - 1] <= j) { // arr[i-1]=value of ith item
                    // case 1 :- include ith item
                    boolean ans1 = dp[i - 1][j - arr[i - 1]];
                    // case 2 :- exlude ith item
                    boolean ans2 = dp[i - 1][j];

                    dp[i][j] = ans1 || ans2;
                } else {
                    dp[i][j] = dp[i - 1][j]; // exclude ith item
                }

            }
        }
        return dp[arr.length][target];
    }

    public static void main(String args[]) {
        int arr[] = { 4, 2, 7, 1, 3 };
        int target = 10;
        System.out.println(targetSumSubset(arr, target));
    }

}
