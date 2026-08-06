public class FibonacciRecursion{

    public static int fibonacciMemoization(int n, int [] f){
        if(n == 0 || n==1){
            return n;
        }

        if(f[n]!=0){
            return f[n];
        }

        f[n]=fibonacciMemoization(n-1,f)+fibonacciMemoization(n-2,f);

        return f[n];
    }

    public static int fibonacci(int n){

       int f[]=new int[n+1];

       return fibonacciMemoization(n,f);
    }


    public static int fibonacciTabulation(int n ){

        if(n==0) return 0;

        int fib[]=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n+1;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    public static void main(String args[]){
        
         System.out.println("Nth fibonacci number using memoization is " + fibonacci(10));

         System.out.println("Nth fibonacci number using tabulation is "+fibonacciTabulation(20));

         

    }
}
