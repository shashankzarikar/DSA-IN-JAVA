public class MaxSumSubarray {
    public static void MaxSumSubarray(int array[]) {
        int MaxSum = Integer.MIN_VALUE;
        int prefixarray[] = new int[array.length];
    // find prefix array
        prefixarray[0] = array[0];
        for (int i = 1; i < prefixarray.length; i++) {
            prefixarray[i] = prefixarray[i - 1] + array[i];
         }
         for(int i=0;i<array.length;i++) {
            int start=i;
            for(int j=i;j<array.length;j++) {
                int end =j;
                int CurrSum= start==0  ? prefixarray[end] : prefixarray[end]-prefixarray[start-1];
                if (CurrSum>MaxSum){
                    MaxSum=CurrSum;

                }
                

            }
         }
         System.out.println("Max Subarray sum is : "+MaxSum);
    }

    public static void main(String args[]) {
        int array[] = { -1, -1,5,-1,-1 };
        MaxSumSubarray(array);
    }
}
