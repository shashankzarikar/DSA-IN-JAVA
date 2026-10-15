// Problem: Find the minimum deletions and insertions required to convert one string into another.
// Approach :- 
// 1) find the longest common subsequence of str1 and str2 
// 2) number od deletions operations = str1.length()-lcs
// 3) number of insertions operations = str2.length()-lcs
// TC: O(n * m)
// SC: O(n * m)

public class StringConversion{
    public static int lcs(String str1, String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i][j-1];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        String str1 = "pear";
        String str2 = "sea";

        int lcs=lcs(str1,str2);

        System.out.println("Number of deletion operations needed "+ (str1.length()-lcs));
        System.out.println("Number of insertions operations needed "+ (str2.length()-lcs));


    }
}