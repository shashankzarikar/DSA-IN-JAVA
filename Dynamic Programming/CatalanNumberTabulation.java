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
public class CatalanNumberTabulation {
    public static int catalannumber(int n){

        if(n==0 || n==1) return 1;

        int dp[]=new int[n+1];

        //Initialization
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            int cati=0;
            for(int j=0;j<i;j++){
                cati+=dp[j]*dp[i-j-1];
            }
            dp[i]=cati;
        }
        return dp[n];
    }
    public static void main(String args[]){
        System.out.println(catalannumber(3));
    }
    
}
