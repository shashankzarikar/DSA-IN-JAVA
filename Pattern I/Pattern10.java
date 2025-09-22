/*
    1
   212
  32123
 4321234
543212345
 */
import java.util.Scanner;

public class Pattern10 {
    public static void main (String args[]) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int space=1;space<=n-i;space++) {
                System.out.print(" ");
            }
            for(int num=i;num>=1;num--){
                System.out.print(num);

            }
            for(int num=1;num<=i-1;num++){
                System.out.print(num+1);

            }
            System.out.println();

        }


    }
    
}
