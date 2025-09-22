import java.util.*;
public class HollowRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want");
        int r = sc.nextInt();
         System.out.println("Enter the number of columns you want");
         int c= sc.nextInt();

         for(int row=1;row<=r;row++){
            for(int col=1;col<=c;col++) {
                if(row==1||col==1||row==r||col==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }

    }
}