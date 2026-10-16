public class CatalanNumberRecursion{
    public static int catalannumber(int n){
        if(n==0 || n==1) return 1;

        int cat=0;
        for(int i=0;i<n;i++){
            cat=cat+catalannumber(i)*catalannumber(n-i-1);
        }
        return cat;
    }
    public static void main(String args[]){
        System.out.println(catalannumber(5));
    }
}