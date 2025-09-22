public class FastExpo {
    public static int expo(int num, int pow) {
        int ans = 1;
        while (pow != 0) {
            if ((pow & 1) == 1) {
                ans = ans * num;

            }
            num *= num;
            pow = pow >> 1;
        }
        return ans;

    }

    public static void main(String args[]) {
        System.out.println(expo(3, 5));

    }

}
