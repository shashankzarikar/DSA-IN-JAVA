/*
 * Problem: Counting BSTs
 * Given n distinct keys, find the number of structurally unique
 * Binary Search Trees (BSTs) that can be constructed using all n keys.
 *
 * TC: O(n^2)
 * SC: O(n)
 */
public class CountingBSTsTabulation {
    public static int countingtrees(int n){
        if(n==0 || n==1) return 1;

        int dp[]=new int[n+1];

        // initilization  dp[i]= number of possible BSTs with i nodes 
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            int trees=0;
            for(int j=1;j<=i;j++){   
                trees+=dp[j-1]*dp[i-j];
            }
            dp[i]=trees;
        }
        return dp[n];
    }
    public static void main(String args[]){
        System.out.println(countingtrees(4));
    }
    
}
