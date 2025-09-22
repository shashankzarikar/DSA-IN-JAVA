import java.util.ArrayList;

public class Maximum {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(8);
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > maximum){
                maximum=list.get(i);
           }
           //maximum = Math.max(maximum,list.get(i));
        }
        System.out.println(maximum);


    }
    
}
