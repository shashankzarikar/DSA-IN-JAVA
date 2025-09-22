public class Operations {
    public static void getithbit(int num, int i){
        num=num>>i;
        if((num&1)==1){
        System.out.println("ith bit is 1");
        }
        else{
            System.out.println("ith bit is 0");
        }
    }
    public static int setithbit(int num , int i){
        int bitmask=1<<i;
        num=num |bitmask;
        return num;

    }
    public static int clearithbit(int num, int i) {
        int bitmask=~(1<<i);
        num = num & bitmask;
        return num;
    }
    public static int clearlastIbits(int num,int i) {
        int BitMask=(~0)<<i;
        num=num & BitMask ;
        return num; 
    }
    public static int ClearBitsinRange (int num ,int i, int j) {
        int a = (~0)<<j+1;
        //int b= (1<<i) -1;
        int b=~((~0)<<i);

        int bitmask = a|b;

        num=num&bitmask;
        return num;
    }
 
    public static void main(String args[]){
       System.out.println( ClearBitsinRange(10,2,4));
     //getithbit(15,4);



    }
    
}
