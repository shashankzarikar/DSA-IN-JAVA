/*
Given a rod of maximum length and arrays containing possible piece lengths and their 
corresponding prices, find the maximum profit that can be obtained by cutting the rod into pieces.
         Time Complexity: O(n * maxLength)
         Space Complexity: O(n * maxLength) 
*/
public class RodCutting {
    public static void main(String args[]) {

        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int prices[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int maxLength = 8;

        int dp[][] = new int[length.length + 1][maxLength + 1];

        // If we have 0 types of cuts, maximum profit is 0
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        // If rod length is 0, maximum profit is 0
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                int currLen = length[i - 1];
                int maxLen = j;

                if (currLen <= maxLen) {

                    // Include: same piece can be used again
                    int ans1 = prices[i - 1] + dp[i][j - currLen];

                    // Exclude: move to previous piece
                    int ans2 = dp[i - 1][j];

                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[length.length][maxLength]);
    }
}