public class Subarray {
    public static void SubarrayPrint(int array[]) {
        for(int i=0;i<array.length;i++) {
            for(int j=i ;j<array.length;j++) {
                System.out.print("{");
                for(int k=i;k<=j;k++) {
                    System.out.print(array[k]);
                    if(k!=j){
                        System.out.print(",");
                    }

                }
                System.out.print("} ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int array[]= {1,2,3,4,5,6};
        SubarrayPrint(array);
    }
    
}
