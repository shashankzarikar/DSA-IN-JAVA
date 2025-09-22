import java.util.*;

public class Checkprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num == 2) {
            System.out.println("It is Prime");
        } else {

            boolean isPrime = true;

            for (int i = 2; i <=Math.sqrt(num); i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;

                }

            }
            if (isPrime == true) {
                System.out.println("It is a Prime number");
            } else {
                System.out.println("It is not a Prime number");
            }
        }
    }
}
