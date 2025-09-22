import java.util.*;

public class PQ1 {
    public static float average(int a ,int b,int c) {
       float average = (a+b+c)/3.0f;
       return average;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float average=average(a,b,c);
                
        System.out.println("The average of these numbers is " +average );

    }
}