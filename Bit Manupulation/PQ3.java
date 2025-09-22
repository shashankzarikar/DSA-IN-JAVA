/* 
 * Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator)
 */
public class PQ3 {
    public static void main (String args[]) {
        int x=7;
        // 2's complement 
        //-x = ~x+1
        // -~x=x+1
        //x+1=-~x
        System.out.println(x+" + 1 = "+-~x);
    }
    
}
