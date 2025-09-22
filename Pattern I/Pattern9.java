/*
    *****
   *****
  *****
 *****
*****
 */
import java.util.Scanner;

public class Pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int i =1; i<=n;i++) {
            for(int space = i; space<=n-1;space++) {
                System.out.print(" ");

            }
            for (int star = 1; star<=n;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
