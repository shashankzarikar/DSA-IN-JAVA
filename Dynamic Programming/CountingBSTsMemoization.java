/*
 * Problem: Counting BSTs
 * Given n distinct keys, find the number of structurally unique
 * Binary Search Trees (BSTs) that can be constructed using all n keys.
 *
 * TC: O(n^2)
 * SC: O(n)
 */
public class CountingBSTsMemoization {
    public static int countingtrees(int n , int dp[]){
        if(n==0 || n==1) return 1;
        if(dp[n]!=0) return dp[n];

        int trees=0;
        for(int i=1;i<=n;i++){  
            trees+=countingtrees(i-1,dp)*countingtrees(n-i,dp);
        }
        dp[n]=trees;
        return dp[n];
    }
    public static void main(String args[]){
        int n=4;
        int dp[]=new int[n+1];
        System.out.println(countingtrees(n,dp));
    }
    
}
