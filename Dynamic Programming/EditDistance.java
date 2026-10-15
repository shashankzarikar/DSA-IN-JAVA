// Problem: Find the minimum number of operations required to convert str1 into str2
// Allowed Operations: Insertion(addition), Deletion, Replacement
// TC: O(n * m)
// SC: O(n * m)

public class EditDistance {
    public static void main(String args[]) {
        String str1 = "Intention";
        String str2 = "Execution";

        int dp[][] = new int[str1.length() + 1][str2.length() + 1];

        // Initalization

        // str1 has length i and str2 has length 0 then we have to perform delete
        // operations on all characters in str1 so number of operations is equal to
        // number character in str1
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;
        }
        // str1 has length 0 and str2 has length j then we have to add all characters in
        // str2 in str1 so number
        // operations has been equal to characters in str2
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                // Characters are same no operation needed
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // Characters are different , we can perform different operations
                else {
                    // add the jth character of str2 in str1 (1-Based Indexing)
                    int addoperation = dp[i][j - 1] + 1;
                    // delete ith character in str1 (1-Based Indexing)
                    int deleteoperation = dp[i - 1][j] + 1;
                    // replace ith character in str1 with jth character in str2 (1-Based Indexing)
                    int replaceoperation = dp[i - 1][j - 1] + 1;

                    dp[i][j] = Math.min(addoperation, Math.min(deleteoperation, replaceoperation));
                }
            }
        }

        System.out.println(dp[str1.length()][str2.length()]);

    }
}