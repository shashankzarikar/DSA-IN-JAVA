import java.util.*;
public class PQ4 {
    public static ArrayList<Integer> answer(int n){
        ArrayList<Integer> nums = new ArrayList<>();
        int number=1;
        for(int i=0;i<n;i=i+2){
            nums.add(i,number++);
        }
        for(int i=1;i<n;i=i+2){
            nums.add(i,number++);
        }
        return nums;


    }
    public static void main(String args[]){
        System.out.println(answer(6));
    }
    
}
