import java.util.*;

public class EvenOddCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num==0) {
            System.out.println("You entered zero");
        }


        else if ((num & 1) == 1) {
            System.out.println("Number is Odd");

        }
        else{
            System.out.println("Number is Even");
        }

    }
}