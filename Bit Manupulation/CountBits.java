public class CountBits {
    public static void main(String args[]) {
        int num=15;
        int count =0;
        while(num!=0) {
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println("Total SetBits are "+count);
    }
    
}
