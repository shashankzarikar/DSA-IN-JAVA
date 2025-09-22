public class Javapractice {
    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                System.out.print("{");
                int currsum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    currsum += arr[k];
                    if (k != j) {
                        System.out.print(",");

                    }
                }
                System.out.print("} ");
                MaxSum=Math.max(MaxSum,currsum);

            }
            System.out.println();
        }
        System.out.println("Max Sum of an array is "+MaxSum); 
    }
}