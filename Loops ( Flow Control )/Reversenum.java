import java.util.*;
public class Reversenum {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int reverse=0;
        while(num!=0) {
            int lastdigit=num%10;
            reverse=(reverse*10)+lastdigit;
            num=num/10;
        }
        System.out.print(reverse);

    }
    
}
