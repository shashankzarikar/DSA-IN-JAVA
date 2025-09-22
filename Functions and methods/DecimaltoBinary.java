import java.util.*;
public class DecimaltoBinary {
    public static int power(int base, int power) {
        int result=1;
        for(int i=1;i<=power;i++) {
            result=result*base;

        }
        return result;
    }
    public static int DectoBin(int Decimal) {
        int Binary=0;
        int pow=0;
        while(Decimal!=0) {
            int remainder=Decimal%2;
            Binary=Binary+remainder*power(10,pow);
            pow++;
            Decimal=Decimal/2;

        }
        return Binary;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal form number");
        int Decimal=sc.nextInt();

        System.out.println("Binary form of "+Decimal+" is "+DectoBin(Decimal));


    }
    
}
