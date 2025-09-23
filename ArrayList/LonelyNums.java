
/*
Lonely Numbers in ArrayListmYou are given an integer arraylist .A number x is lonely when it 
appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
 */
import java.util.*;

// Approach -1 Time Complexity = O(n^2)
public class LonelyNums {
    public static boolean checklonely(ArrayList<Integer> nums, int number) {
        // Condition 1 :- Number should be appeared only once
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == number) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
            // Condition 2 :- No adjacent numbers should appear in the ArrayList
            if (nums.get(i) == (number - 1) || nums.get(i) == (number + 1)) {
                return false;
            }

        }
        return true;

    }

    // Approach-2 :
    // Time Complexity = O(nlogn) --> O(nlogn) + O(n)
    // Space complexity = O(n)
    public static ArrayList<Integer> checklonelyoptimised(ArrayList<Integer> nums) {
        // Sort the ArrayList
        Collections.sort(nums);
        // Create a new arraylist to store lonely numbers
        ArrayList<Integer> lonelylist = new ArrayList<>();
        // Check for arrylist for size 1
        if (nums.size() == 1) {
            lonelylist.add(nums.get(0));
            return lonelylist;
        }
        // Check the full arraylist from 1 to end-1
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                lonelylist.add(nums.get(i));
            }
        }
        // Check for first element
        if (nums.get(0) + 1 < nums.get(1)) {
            lonelylist.add(nums.get(0));
        }
        // check for last element
        if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
            lonelylist.add(nums.get(nums.size() - 1));
        }
        return lonelylist;

    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 3, 5, 7));
        // following is for loop for approach -1 , no need in approach 2
         for (int i = 0; i < nums.size(); i++) {
            int number = nums.get(i);
            if (checklonely(nums, number)) {
                System.out.print(number + " ");
            }
        
        System.out.println(checklonelyoptimised(nums));

    }

}
