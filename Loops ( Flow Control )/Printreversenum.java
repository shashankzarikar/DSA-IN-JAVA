import java.util.*;
public class Printreversenum {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int num =sc.nextInt();

        while(num!=0) {
            int lastdigit = num%10;
            System.out.print(lastdigit);
            num = num /10;
                       
        }  
     }
    
}
