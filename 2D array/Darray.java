import java.util.*;
public class Darray {
    public static void Searchinarray (int arr[][],int key){
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j]==key){
                    System.out.println("Key is found at ("+(i+1)+","+(j+1)+")");
                    return;
                }
            }
        } 
        System.out.println("Key is not available in this array");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in array");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns in array");
        int m=sc.nextInt();
        //creation of 2D array
        int arr[][]=new int [n][m];
        //Input 2D array 
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j]=sc.nextInt();
            }
          }
        //output array
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("Enter the key which have to search in an 2D array");
        int key=sc.nextInt();
        Searchinarray(arr,key);
        
        



    }
}