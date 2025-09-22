
//Find pair in a sorted arraylist has a target sum
import java.util.ArrayList;
import java.util.Arrays;

public class Pairsum {
    // Brute force approach
    // Time complexity = O(n^2)
    public static void bruteforce(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println(list.get(i) + " " + list.get(j));

                }
            }
        }
    }

    // two pointer approach
    // Time complexity = O(n)
    public static void twopointer(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.println(list.get(lp) + " " + list.get(rp));
                lp++;
                rp--;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        bruteforce(list, 5);
        // twopointer(list,8);

    }

}
