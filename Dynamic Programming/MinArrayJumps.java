public class MinArrayJumps {
    public static int minjumps(int arr[]){
        int n=arr.length;
        int dp[]=new int[n];
        //initialization 
        dp[n-1]=0;
        for(int i=0;i<dp.length-1;i++){
            dp[i]=n; // we will use n as infinity in this problem 
        }
        for(int i=n-2;i>=0;i--){
            for(int j=1;j<=arr[i] && i+j < dp.length;j++){
                dp[i]=Math.min(dp[i+j]+1,dp[i]);
            }
        }

        return dp[0];
    }
    public static void main(String args[]){
        int arr[]= {2,3,1,1,4};
        System.out.println(minjumps(arr));

    }
    
}
