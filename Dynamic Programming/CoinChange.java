// Question:
// Find the number of ways to make a given sum using given coins.
// A coin can be used any number of times.

public class CoinChange {

    public static void main(String args[]) {

        int coins[] = {2, 5, 3, 6};
        int sum = 10;

        // dp[i][j] = number of ways to make sum j using the first i coins.
        int[][] dp = new int[coins.length + 1][sum + 1];


        // There is only 1 way to make sum 0 ,  select no coin.
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }


        // With 0 coins, we cannot make any positive sum.
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < dp.length; i++) {

            for (int j = 1; j < dp[0].length; j++) {

                if (coins[i - 1] <= j) {

                    // INCLUDE the current coin.
                    //
                    // After taking the coin, we need to make
                    // the remaining sum.
                    int ans1 = dp[i][j - coins[i - 1]];

                    // We don't add coins[i-1] to ans1 here.
                    // In Unbounded Knapsack, we add the item value
                    // because we are calculating maximum VALUE.
                    //
                    // Here we are calculating NUMBER OF WAYS.
                    // dp[i][j - coins[i-1]] already tells us how
                    // many ways are possible for the remaining sum.
                    // The current coin simply becomes part of
                    // each of those ways.


                    // EXCLUDE the current coin.
                    // Use only the previous coins.
                    int ans2 = dp[i - 1][j];


                    // Total ways:
                    // ways by including the coin
                    // + ways by excluding the coin.
                    dp[i][j] = ans1 + ans2;

                } else {

                    // Current coin is bigger than the required sum,
                    // so it cannot be included.
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println("Number of ways = "
                + dp[coins.length][sum]);
    }
}