/*Most Frequent Number following Key
You are given an integer Arraylist nums.You area ls o given an integer key ,which is present in nums.For every unique integer 
target in nums,count the number of times target immediately follows an occurrence of key in nums. 
In other words, count the number of indices i such that:0 <= i <= nums.size() - 2,nums.get(i) == key and,nums.get(i+1) == target.
Return the target with the maximum count
 
 */
import java.util.*;
public class PQ3 {
    public static int mostfrequencies(ArrayList<Integer> nums, int key){
        int result[]=new int[1000];
        //frequency of each target element
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==key){
            result[nums.get(i+1)-1]++;
            }
        }
        //Check which target element has most frequency
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<1000;i++){
            if(result[i]>max){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;



    } 
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,100,200,1,100));
        System.out.println(mostfrequencies(nums,1));

    }
    
}
