/*
 * Wildcard Matching
 *
 * Given a text and a wildcard pattern, implement an algorithm to check
 * whether the pattern matches the entire text (not partial text).
 *
 * '?' -> Matches any single character.
 * '*' -> Matches any sequence of characters, including the empty sequence.
 *
 * Example 1:
 * Text = "baaabab"
 * Pattern = "*****ba******ab"
 * Output = true
 *
 * Example 2:
 * Text = "baaabab"
 * Pattern = "a*ab"
 * Output = false
 */

public class WildCardMatching {
    public static boolean wildcardmatching(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();

        boolean dp[][] = new boolean[n + 1][m + 1];

        // Initalization
        dp[0][0] = true; // If both the string and pattern are empty, they match.

        // If the pattern is empty, it cannot match a non-empty string.
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = false;
        }

        // if string is empty but pattern has length more than zero then we have two cases
        for (int j = 1; j < dp[0].length; j++) {
            // If the jth character is '*', it can match an empty sequence.
            // Check whether the remaining pattern can also match the empty string: dp[0][j-1].
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
            // If the jth character is not '*', the empty string cannot match the pattern.
            else {
                dp[0][j] = false;
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                // if both characters are same or jth character in pattern is '?' we can match
                // it and go for subproblem diagonally 
                if (str.charAt(i - 1) == pattern.charAt(j - 1) || pattern.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // if jth character in pattern is '*' then we can take two different steps
                else if (pattern.charAt(j - 1) == '*') {
                    // Ignore '*', allowing it to match an empty sequence.
                    boolean ignoreit = dp[i][j - 1];
                    // we can replace it with sequence of characters
                    boolean useit = dp[i - 1][j]; // there should be chances of we need to use '*' to replace more than
                                                  // one character that why we kept it here

                    dp[i][j] = ignoreit || useit;

                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];

    }

    public static void main(String args[]) {
        String str1 = "baaabab";
        String pattern = "*****ba*****ab";

        System.out.println(wildcardmatching(str1, pattern));

    }
}