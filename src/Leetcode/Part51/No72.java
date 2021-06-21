package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>编辑距离</p>
 *
 * @author : 张严
 * @date : 2021-05-18 19:23
 **/
public class No72 {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= word2.length(); i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                dp[i][j] = Math.min(Math.min(dp[i][j-1]+1,dp[i-1][j]+1),dp[i-1][j-1]+1);
                if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j] = Math.min(dp[i][j],dp[i-1][j-1]);
            }
        }
        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        No72 no72 = new No72();
        System.out.println(no72.minDistance("intention", "execution"));
    }
}
