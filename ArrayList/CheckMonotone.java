
/*
Monotonic ArrayList(EASY)An Arraylist is monotonic if it is either monotone increasing or monotone
 decreasing.AnArray list is monotone increasing iffor all i<=j,list.get(i)<=list.get(j).AnArraylist
  nums is monotone decreasing if for all i <= j, list.get(i) >= list.get(j).
  Given an integer Arraylist list, return true if the given list is monotonic, or false otherwise
*/

// Time Complexity =O(n)
//Space Complexity = O(1)
import java.util.*;
public class CheckMonotone {
    public static boolean check_monotone(ArrayList<Integer> list){
        boolean increasing_monotone = true;
        boolean decresing_monotone = true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                increasing_monotone=false;
            }
            else if(list.get(i)<list.get(i+1)){
                decresing_monotone=false;
            }
        }
        return increasing_monotone ||decresing_monotone ;
          
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,3,2));
        System.out.println(check_monotone(list));
   }
    
}
