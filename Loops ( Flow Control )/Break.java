import java.util.*;

public class Break {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int num;
        do { 
        System.out.println("Enter number");
         num = sc.nextInt();
         if (num%10==0) {
            break;
         }
         System.out.println(num);


    } while (true);

    }
    
}
