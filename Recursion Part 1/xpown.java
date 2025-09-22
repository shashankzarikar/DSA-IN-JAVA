public class xpown {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=pow(x,n/2);
        int halfpowersq=halfpower*halfpower;

        if(n%2!=0){
            halfpowersq=x*halfpowersq;

        }
        return halfpowersq;
    }
    public static void main(String args[]){
        System.out.println(pow(2,10));


    }
    
}
