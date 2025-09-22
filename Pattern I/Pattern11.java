/*
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
import java.util.Scanner;

public class Pattern11 {
    public static void main (String arg[]) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int space=i;space<=n-1;space++) {
                System.out.print(" ");

            }
            for(int num=1;num<=i;num++){
                System.out.print(i+" ");
            }
            System.out.println();
        }



    }
    
}
