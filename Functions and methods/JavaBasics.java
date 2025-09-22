import java.util.*;
public class JavaBasics{

    public static int factorial (int num) {
        int fact=1;
        for(int i=1;i<=num;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main (String args[]){

         Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter the number");
        int n= sc.nextInt();
        int answer= factorial(n);
        System.out.println("factorial of given number is "+answer);
*/    
        System.out.println("To find the binomial factorial (nCr) enter the values of n and r respectively ");
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();

        int answer=factorial(n)/(factorial(r)*factorial(n-r));

        System.out.println("Binomial factorial is "+answer);



    }
}