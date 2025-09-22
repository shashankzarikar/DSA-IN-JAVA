import java.util.*;
public class PQ2 {
    
    public static int Sum(int arr[][],int row){
        int sum=0;
        for(int col=0;col<arr[0].length;col++) {
           sum +=arr [row] [col];
         }
         return sum;
    }
    public static void main(String args[] ){
        int arr[][]={ {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("Enter the number of row which total sum you want ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Total sum of row is "+ Sum(arr,row));


    }
    
}
