import java.util.*;

public class DiamondPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // First Half
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Second Half
        for (int i = n; i != 0; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
