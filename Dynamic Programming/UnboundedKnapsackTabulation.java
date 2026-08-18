// Unbounded Knapsack Problem:
// Given n items, each with a value and a weight, and a knapsack
// with a maximum capacity W, determine the maximum total value
// that can be obtained.

// Time Complexity = O(n * W)
// Space Complexity = O(n * W)
public class UnboundedKnapsackTabulation {
    public static void main(String args[]) {
        int values[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[values.length + 1][W + 1];
        // dp[i][j]=max profit with first i items and capacity of knapsack is j

        // Base case :- if number of items are zero max profit is zero
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        // Base case :- if capacity of knapsack is zero max profit is zero
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < values.length + 1; i++) { // i=number of items j= capacity of knapsack
            for (int j = 1; j < W + 1; j++) {
                int v = values[i - 1]; // value of ith item
                int w = wt[i - 1]; // weight of ith item

                if (w <= j) {
                    // case 1 :- item included
                    int ans1 = v + dp[i][j - w]; // Unlike 0/1 Knapsack, we use dp[i][j-w]
                                                 // because the current item can be selected again.
                    // case 2 :- item excluded
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println("Max profit : " + dp[values.length][W]);
    }
}
