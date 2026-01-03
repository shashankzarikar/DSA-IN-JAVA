
/*You are given n activities, each with a start time and a finish time.Only one activity can be performed at a time,
 and an activity can start only after the previous selected activity has finished. Your task is to select the maximum 
 number of non-overlapping activities that can be performed by a single person.

Time Complexity:
- Sorting activities by end time: O(n log n)
- Greedy selection of activities: O(n)
Overall Time Complexity: O(n log n)

Space Complexity:
- Activities array and result list: O(n)
*/
    
import java.util.*;

public class ActivitySelection {
    public static void main(String args[]) {
        int start[] = { 10, 12, 20 };
        int end[] = { 20, 25, 30 };

        if (start.length == 0) {
            System.out.println("Maximum Activities we can perform are 0");
            return;
        }
        final int IDX = 0, START = 1, END = 2;

        // Sort all activities according to end time
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][IDX] = i;
            activities[i][START] = start[i];
            activities[i][END] = end[i];
        }
        // lambda function ( used to sort 2D array according to end time of activities)
        Arrays.sort(activities, Comparator.comparingInt(o -> o[END]));

        // Create arraylist to store indices of selected activities
        ArrayList<Integer> result = new ArrayList<>();

        // Store the first activity since it ends earlier than the others
        result.add(activities[IDX][IDX]);
        int lastActEnd = activities[IDX][END];

        for (int i = 1; i < activities.length; i++) {
            // if start time of activity is greater than or equal to end time of last
            // selected activity then select activity
            if (activities[i][START] >= lastActEnd) {
                lastActEnd = activities[i][END];
                result.add(activities[i][IDX]);
            }
        }

        System.out.println("Maximum Activities we can perform are " + result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.print("A" + result.get(i) + " ");
        }

    }
}