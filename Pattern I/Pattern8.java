/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */
import java.util.Scanner;

public class Pattern8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int a1 = 1; a1 <= i; a1++) {
                System.out.print("*");
            }
            for (int a2 = 1; a2 <= n - i; a2++) {
                System.out.print(" ");

            }
            for (int b1 = 1; b1 <= n - i; b1++) {
                System.out.print(" ");
            }
            for (int b2 = 1; b2 <= i; b2++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int j = 1; j <= n; j++) {
            for (int c1 = 1; c1 <= n - j + 1; c1++) {
                System.out.print("*");
            }
            for (int c2 = 1; c2 <= j - 1; c2++) {
                System.out.print(" ");
            }
            for (int d1 = 1; d1 <= j - 1; d1++) {
                System.out.print(" ");
            }
            for (int d2 = 1; d2 <= n - j + 1; d2++) {
                System.out.print("*");
            }
              System.out.println();


        }

    }

}
