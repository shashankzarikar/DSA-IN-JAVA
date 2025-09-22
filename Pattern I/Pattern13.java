
/*
1
01
101
0101
10101
 */
import java.util.Scanner;

public class Pattern13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (num == 1) { // We can use simply
                     num = 0;   // num=1-num;
                }               // instead of this if and if else loop
                else if (num == 0) {
                    num = 1;
                }

            }
            System.out.println();
        }

    }

}
