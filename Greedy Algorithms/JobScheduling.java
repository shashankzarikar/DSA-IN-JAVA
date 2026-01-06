/*Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline.
It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1.
 Maximize the total profit if only one job can be scheduled at a time.
 
 Time Complexity=O(n^2)
 Space Complexity=O(n)
 
 */
import java.util.*;

public class JobScheduling {
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.profit = profit;
            this.deadline = deadline;
        }
    }

    public static void main(String args[]) {

        int jobsInfo[][] = {
                { 3, 100 }, // Job 0
                { 1, 50 }, // Job 1
                { 1, 40 } // Job 2
        };

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        // Find Max Deadline
        int maxdeadline = 0;
        for (int i = 0; i < jobsInfo.length; i++) {
            maxdeadline = Math.max(maxdeadline, jobsInfo[i][0]);
        }

        // Create slots array
        int slots[] = new int[maxdeadline + 1];
        for (int i = 0; i < slots.length; i++) {
            slots[i] = -1;
        }

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            for (int j = curr.deadline; j >= 1; j--) {
                if (slots[j] == -1) {
                    slots[j] = curr.id;
                    break;
                }
            }
        }
        
        int count=0;
        for (int i = 1; i < slots.length; i++) {
            if (slots[i] != -1) {
                System.out.print(slots[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total jobs scheduled :" + count);
    }

}
