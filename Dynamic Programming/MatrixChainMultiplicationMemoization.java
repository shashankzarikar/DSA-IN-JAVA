public class MatrixChainMultiplicationMemoization {
    public static int mcm(int arr[],int i , int j ,int dp[][]){
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int mincost=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){

            int cost1=mcm(arr,i,k,dp);
            int cost2=mcm(arr,k+1,j,dp);

            int cost3=arr[i-1]*arr[k]*arr[j];

            int totalcost=cost1+cost2+cost3;
            mincost=Math.min(totalcost,mincost);
        }
        dp[i][j]=mincost;
        return dp[i][j];
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,3};
        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(mcm(arr,1,arr.length-1,dp));
    }
    
}
