/*
Question:
Given an integer array nums and an integer k, find the maximum element in every
contiguous subarray (sliding window) of size k.

Time Complexity (TC):O(n)
Each element is added to and removed from the deque at most once.

Space Complexity (SC):O(k)
The deque stores at most k indices at any time.
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class PQ5 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int result[] = new int[nums.length - k + 1];
        int curr_window = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && nums[dq.getLast()] < nums[i]) {
                dq.removeLast();
            }
            while (!dq.isEmpty() && dq.getFirst() < i - k + 1) {
                dq.removeFirst();
            }
            dq.addLast(i);
            if (i >= k - 1) {
                result[curr_window++] = nums[dq.getFirst()];
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        System.out.println(maxSlidingWindow(nums, k));
    }

}
