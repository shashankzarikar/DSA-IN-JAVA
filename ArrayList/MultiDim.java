import java.util.*;
public class MultiDim {
    public static void main(String args[]){
        ArrayList<ArrayList<?>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(3);
        list2.add(4);
        ArrayList<Character> list3=new ArrayList<>();
        list3.add('a');
        list3.add('b');
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

        mainlist.add(list);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        for(int i=0;i<mainlist.size();i++){
            ArrayList<?> currlist =
            mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();

        }

    }
    
}
