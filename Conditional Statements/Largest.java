import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int A = sc.nextInt();
        System.out.println("Enter the second number");
        int B = sc.nextInt();

        if (A > B) {
            System.out.println("The largest number is " + A);
        }
        else if (B > A){
            System.out.println("The greater number is " + B);
        } 
        else {
            System.out.println("Both numbers are equal");
        }

    }
}