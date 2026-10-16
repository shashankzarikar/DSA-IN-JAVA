/*
 * Problem: Catalan Number
 *
 * Calculate the nth Catalan number using the recurrence:
 * C(n) = Σ C(i) * C(n-i-1), for i = 0 to n-1
 *
 * Base Cases: C(0) = 1, C(1) = 1
 *
 * TC: O(n^2) 
 * SC: O(n) 
 */

public class CatalanNumberMemoization {
    public static int catalannumber(int n , int dp[]){
        if(n==0 || n==1) return 1;
        if(dp[n]!=0) return dp[n];

        int catn = 0;
        for(int i=0;i<n;i++){
            catn+=catalannumber(i,dp)*catalannumber(n-i-1,dp);
        }
        dp[n]=catn;
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        int dp[]=new int[n+1];
        System.out.println(catalannumber(n,dp));

    }
    
}
