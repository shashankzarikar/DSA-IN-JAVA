/*You are given an array of Indian currency denominations and a value amount.
Find the minimum number of coins/notes required to make the given amount using the greedy approach.
Assume unlimited supply of each denomination

Time Complexity=O(nlogn)
Space Complexity=O(1)

Note :- Indian currency is a canonical coin system, so the greedy choice of always selecting the
 largest possible denomination gives the optimal (minimum coin) solution.
 A canonical coin system is one in which the greedy algorithm always yields the minimum number of coins for any amount.
*/
import java.util.*;

public class IndianCoins {

    public static int coinChange(Integer[] coins, int amount) {
        // Sort denominations in descending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int numberOfCoins = 0;
        int remainingAmount = amount;
        int i = 0;

        // Greedy selection
        while (i < coins.length && remainingAmount != 0) {
            if (coins[i] <= remainingAmount) {
                remainingAmount -= coins[i];
                numberOfCoins++;
            } else {
                i++;
            }
        }

        // If exact amount is formed
        if (remainingAmount == 0) {
            return numberOfCoins;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 590;

        System.out.println("Minimum number of notes required: " 
                            + coinChange(coins, amount));
    }
}


