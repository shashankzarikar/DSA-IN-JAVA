public class KadanesMaxSum {
    public static void kadanes(int array[]) {
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;
        // Special Case (if all values in an array has -ve values then our code returns
        // 0 for that,instead of smallest num to resolve this we have to add special
        // case )
        boolean allnegative = true;
        for(int i=0;i<array.length;i++) {
            if (array[i]>0){
                allnegative=false;
            }
        }
        if(allnegative){
            for(int i=0;i<array.length;i++) {
                if(array[i]>MaxSum){
                    MaxSum=array[i];
                }
            
            }


        }
        else {

        for (int i = 0; i < array.length; i++) {
             
            CurrSum += array[i];
            if (CurrSum < 0) {
                CurrSum = 0;
            }
            MaxSum = Math.max(CurrSum, MaxSum);
        }
    }
        System.out.println("Max value of Subarray Sum is " + MaxSum);
    }

    public static void main(String args[]) {
        int array[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        kadanes(array);

    }

}
