/*Problem Statement:

You are given an array of n integers. Divide the array into two subsets such that the absolute difference between the sums of the two subsets is minimum.

Return the minimum possible difference. */
public class MinimumPartitioning {
    public static int minpartition(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int n = arr.length;
        int w = sum / 2;

        int dp[][] = new int[n + 1][w + 1];

        // dp[i][j] = maximum sum we can get with first i elements and maxcapacity j

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int curr = arr[i - 1];
                int maxcapacity = j;
                if (curr <= maxcapacity) {
                    // include
                    int include = curr + dp[i - 1][j - curr];
                    // exclude
                    int exclude = dp[i - 1][j];

                    dp[i][j] = Math.max(include, exclude);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int sum1 = dp[n][w];
        int sum2 = sum - sum1;

        return Math.abs(sum1 - sum2);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 6, 11, 5 };
        System.out.println(minpartition(arr));
    }
}