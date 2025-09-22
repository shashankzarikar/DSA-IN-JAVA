import java.util.*;
public class PQ5 {
    public static int digitssum(int n){
        int sum =0;
        while(n!=0) {
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
    }
    return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Sum of digits in number "+num+" is "+digitssum(num));
        
    }
    
}
