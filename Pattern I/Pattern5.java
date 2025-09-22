
/*
   *
  **
 ***
****
*/
import java.util.Scanner;

public class Pattern5 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n"); 
        for (int i = 1; i<=n;i++){
            for(int space=1;space<=n-i;space++) {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
    
}
