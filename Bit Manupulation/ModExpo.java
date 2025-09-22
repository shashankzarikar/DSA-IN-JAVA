// find a^n % x 
public class ModExpo {
    public static long modexpo(long a , long n, long x){
        long ans =1;
        a =a%x;
        while(n!=0) {
            if((n&1)==1) {
                ans= (ans*a)%x;
            }
            a=(a*a)%x;
            n=n>>1;
        }
        return ans;

    }
    public static void main(String args[]) {
        System.out.println(modexpo(3,5,2));


    }
    
}
