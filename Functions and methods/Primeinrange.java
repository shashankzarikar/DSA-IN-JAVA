import java.util.*;
public class Primeinrange {

    public static boolean isPrime(int n) {

        if (n == 2) {

            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main (String args[]){
        primeinrange(20);
     
    }

}