public class ZeroOneKnapSackRecursion{
    public static int KnapSack(int values[],int wt[],int W , int n){
        if(n==0 || W==0){
            return 0;
        }

        if(wt[n-1]<=W){
            int ans1 = values[n-1] + KnapSack(values,wt,W-wt[n-1],n-1);
            int ans2 = KnapSack(values,wt,W,n-1);
            return Math.max(ans1,ans2);
        }
        else{
            return KnapSack(values,wt,W,n-1);
        }
    }
    public static void main(String args[]){
        int values[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println("Maximum Profit : "+KnapSack(values,wt,W,values.length));
    }
}