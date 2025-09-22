import java.util.*;
public class Ternary {
    public static void main (String args[]) {
        System.out.println("Enter your marks");
        Scanner sc = new Scanner (System.in);
        int marks = sc.nextInt();
        String result = (marks >=33) ? "Your are pass" : "You are fail";
        System.out.println(result);
    }
    
}
