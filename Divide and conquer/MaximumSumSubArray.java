// implement the divide-and-conquer paradigm by solving the maximum subarray  sum problem.
public class MaximumSumSubArray {
    public static int find_crossing_maximum_subarray_sum(int arr[], int si, int mid, int ei) {
        // Starting from mid and moving backward
        int leftmax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >=si; i--) {
            sum += arr[i];
            leftmax = Math.max(leftmax, sum);
        }
        // starting from mid+1 and moving forward
        sum = 0;
        int rightmax = Integer.MIN_VALUE;
        for (int j = mid + 1; j <=ei; j++) {
            sum += arr[j];
            rightmax = Math.max(rightmax, sum);
        }
        return leftmax + rightmax;

    }

    public static int find_maximum_subarray_sum(int arr[], int si, int ei) { // Time complexity=O(nlogn)
        if (si >= ei) {
            return arr[si];
        }
        int mid = si + (ei - si) / 2;
        int left_maximum_subarray = find_maximum_subarray_sum(arr, si, mid);
        int right_maximum_subarray = find_maximum_subarray_sum(arr, mid + 1, ei);
        int cross_maximum_subarray = find_crossing_maximum_subarray_sum(arr, si, mid, ei);

        return Math.max(left_maximum_subarray, Math.max(right_maximum_subarray, cross_maximum_subarray));
    }

    public static int bruteforce(int arr[]) { // Time Complexity =O(n^2)
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, -9, -7, 10, 12 };
        System.out.println(find_maximum_subarray_sum(arr, 0, arr.length - 1));
        System.out.println(bruteforce(arr));

    }

}
