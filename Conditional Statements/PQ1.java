//WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative

import java.util.*;
public class PQ1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("Number is positive");
        }
        else if(a<0) {0
            System.out.println("Number is Negative");    
        }
        else {
                System.out.println("Number is Zero");
        }



    }
    
}
