package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>两个字符串的删除操作</p>
 *
 * @author : 张严
 * @date : 2021-06-21 10:29
 **/
public class No583 {
    public int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - 2*lcs(word1, word2);
    }
    private int lcs(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        dp[0][0] = 0;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        No583 no583 = new No583();
        System.out.println(no583.minDistance("sea", "eat"));
    }
}
