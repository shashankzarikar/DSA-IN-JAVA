import java.util.*;
public class watercontainer {
    public static int bruteforce(ArrayList<Integer> list ){ // T.C =O(n^2)
         int maxwaterstore=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int waterstore = (j-i)*Math.min(list.get(i),list.get(j));
                maxwaterstore= Math.max(maxwaterstore,waterstore);
            }

        }
        return maxwaterstore;

    }
    public static int twopointerapproach(ArrayList<Integer> list){// T.C = O(n)
        int maxwaterstore=Integer.MIN_VALUE;
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){ 
        //Water store
        int height=Math.min(list.get(lp),list.get(rp));
        int width =rp-lp;
        int waterstore=height*width;
        maxwaterstore=Math.max(waterstore,maxwaterstore);
        //update pointer
        if(list.get(lp)<list.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
    }
    return maxwaterstore;


    }
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println(twopointerapproach(list));
       
    }
    
}
