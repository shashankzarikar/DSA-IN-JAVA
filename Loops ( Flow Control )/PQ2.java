import java.util.*;
public class PQ2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int evensum =0;
        int oddsum=0;
        int choice;

        do { 
            System.out.println("Enter the number");
            int number=sc.nextInt();

            if (number%2==0) {
                evensum+=number;
            }
            else{
                oddsum+=number;
            }
            System.out.println("Do you want to continue ? if yes then press 1 and if no press 0");
            choice = sc.nextInt();

        }while(choice==1);

        System.out.println("Sum of Even integers is "+evensum);
        System.out.println("Sum of Odd integers is "+oddsum);


    }
    
}
