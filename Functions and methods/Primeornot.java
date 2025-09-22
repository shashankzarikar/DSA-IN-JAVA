public class Primeornot {

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

    public static void main(String args[]) {
        System.out.print(isPrime(1));

    }

}
