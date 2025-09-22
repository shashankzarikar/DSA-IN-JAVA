import java.util.*;
public class PQ2 {
    public static boolean isEven(int n) {
        if (n%2==0) {
            return true;

        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        boolean answer=isEven(num);
        System.out.println(answer);


    }
    
}
