import java.util.ArrayList;
public class reverse {
    public static void printreverse(ArrayList<Integer>list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");

        }

    }
public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList();
    list.add(1);
    list.add(2);
    printreverse(list);


}

    
}
