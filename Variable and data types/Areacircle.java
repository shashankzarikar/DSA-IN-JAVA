import java.util.*;
public class Areacircle {
    public static void main (String args []) {
        System.out.println("Enter the radius of circle");
        Scanner sc = new Scanner (System.in);
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius ;
        System.out.println("The area of circle is "+ area );
    }
    
}
