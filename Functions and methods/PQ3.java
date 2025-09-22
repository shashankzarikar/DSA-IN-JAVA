import java.util.*;

public class PQ3 {
    public static boolean palidromecheck(int num) {
        int reverse = 0;
        int originalnum = num;

        while (num != 0) {
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }
        if (reverse == originalnum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (palidromecheck(number)) {
            System.out.println("Number is palidrome");
        } else {
            System.out.println("Number is not palidrome");

        }

    }

}
