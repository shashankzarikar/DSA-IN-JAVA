public class MaxSum {
    public static void MaxSumInSubarray(int array[]){
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++) {
            for(int j=i;j<array.length;j++) {
                int CurrSum=0;
                for(int k=i;k<=j;k++){
                    CurrSum+=array[k];
                }
                if(CurrSum>MaxSum){
                    MaxSum=CurrSum;
                }
            }
        }
        System.out.println("Max Sum in subarray is :"+MaxSum);
    }
    
    public static void main(String args[]) {
        int array[]={1,-2,6,-1,3};
        MaxSumInSubarray(array);


    }
    
}
