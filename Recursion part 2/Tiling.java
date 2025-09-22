public class Tiling{
    public static int tilingProblem(int n){
        //Base case
        if(n==0||n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tilingProblem(n-1);
        //horizontal choice
        int fnm2=tilingProblem(n-2);
        //total ways
        int total =fnm1+fnm2;
        return total;
    }
    public static void main (String args[]){
        System.out.println(tilingProblem(5));
        
    }
}