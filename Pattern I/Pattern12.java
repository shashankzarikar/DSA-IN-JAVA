
/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
*/
import java.util.Scanner;

public class Pattern12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            for (int star = 1; star <= i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j <= n; j++) {
            for (int space = 1; space <= j - 1; space++) {
                System.out.print(" ");
            }
            for(int star=1;star<=n-j+1;star++) {
                System.out.print("*");
            }
            for(int star=1;star<=n-j;star++){
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
