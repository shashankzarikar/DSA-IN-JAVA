import java.util.*;

public class BinarytoDecimal {
    public static int power(int base, int pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result * base;
        }
        return result;
    }

    public static int BinarytoDecimal(int BinaryNum) {
        int decimal = 0;
        int i = 0;
        while (BinaryNum != 0) {
            int lastdigit=BinaryNum%10;
            decimal=decimal+(lastdigit*power(2,i));
            BinaryNum=BinaryNum/10;
           

            i++;

        }
        return decimal;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int BinaryNum = sc.nextInt();
        int answer = BinarytoDecimal(BinaryNum);
        System.out.println("Decimal form of " + BinaryNum + " is " + answer);

    }

}
