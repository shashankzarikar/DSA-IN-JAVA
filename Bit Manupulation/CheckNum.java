public class CheckNum {
    public static boolean CheckNumPowTwo (int num) { 
        int count =0;
        if (num==0) {
            return false;
        }
        while(num!=0){
            if ((num&1)==1) {
                count++;
            }
            if(count>1) {
                return false;
            }
            num=num>>1;
        } 
        return true;        
    }
    public static boolean optimised (int num) {
        return num >0 && (num & (num -1))==0;
    }
    public static void main(String args[]) {
        if(optimised(8)) {
            System.out.println("Yes it is a power of two");
        }
        else{
            System.out.println("no, it is not power of two");
        }

    }
    
}
