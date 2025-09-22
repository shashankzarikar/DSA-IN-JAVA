public class DecOrder{

    public static void Print(int n) {
        if (n==1){  // Base case (where recursion have to stop)
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        Print(n-1); // call itself 
    }
    public static void main(String args[]) {
        Print(10);
        
    }
}