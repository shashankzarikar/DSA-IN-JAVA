import java.util.*;
public class Incometax {
    public static void main ( String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs");
        float income = sc.nextFloat();

        if  ( income < 5) {
            System.out.println("You do not have to pay tax");
        }

        else if ( income >= 5 && income < 10) {
            float tax = income * 0.2f;
            System.out.println("You have to pay tax of " + tax + " lakhs");
        }
        else if ( income >= 10 ) {
            float tax = income * 0.3f;
            System.out.println("You have to pay tax of " + tax + " lakhs");
        }

    }
    
}
