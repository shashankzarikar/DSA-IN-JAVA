import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainofPairs {
    public static  int findLongestChain(int[][] pairs) {
        if(pairs.length==0){
            return 0;
        }
        Arrays.sort(pairs,Comparator.comparingInt(a->a[1]));
    
        int maxpair=1;
        int lastpairend=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            //Check if lastpair end is smaller than current pair start 
            if(lastpairend < pairs[i][0]){
                maxpair++;
                lastpairend=pairs[i][1];
            }
        }
        return maxpair;
    
}
public static void main(String args[]){
    int[][] pairs = {
    {10, 27},
    {25, 26},
    {10, 24},
    {26, 30}
};

System.out.println(findLongestChain(pairs));
}
    
}
