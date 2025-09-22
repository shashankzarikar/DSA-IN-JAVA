import java.util.*;
public class ButterflyPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
    // First Half
        for(int i=1;i<=n;i++) {
             for(int star=1;star<=i;star++) {
                System.out.print("*");
             }
             for(int spaces=1;spaces<=2*(n-i);spaces++) {
                System.out.print(" ");
             }
             for(int star=1;star<=i;star++) {
                System.out.print("*");
             }
             System.out.println();
        }
    // Second Half
    for(int i=n;i!=0;i--) {
             for(int star=1;star<=i;star++) {
                System.out.print("*");
             }
             for(int spaces=1;spaces<=2*(n-i);spaces++) {
                System.out.print(" ");
             }
             for(int star=1;star<=i;star++) {
                System.out.print("*");
             }
             System.out.println();
        }
    }
}