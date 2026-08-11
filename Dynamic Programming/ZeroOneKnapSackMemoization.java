public class ZeroOneKnapSackMemoization {
    public static int KnapSack(int dp[][], int values[], int wt[], int W, int n) {
        if (W == 0 || n == 0)
            return 0;
        if (dp[W][n] != -1) {
            return dp[W][n];
        }

        if (wt[n - 1] <= W) {
            int ans1 = values[n - 1] + KnapSack(dp, values, wt, W - wt[n - 1], n - 1);
            int ans2 = KnapSack(dp, values, wt, W, n - 1);
            dp[W][n] = Math.max(ans1, ans2);
            return dp[W][n];
        } else {
            dp[W][n] = KnapSack(dp, values, wt, W, n - 1);
            return dp[W][n];
        }

    }

    public static void main(String args[]) {
        int values[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[W + 1][values.length + 1];
        for (int i = 0; i < W + 1; i++) {
            for (int j = 0; j < values.length + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("Maximim Profit : " + KnapSack(dp, values, wt, W, values.length));

    }

}
