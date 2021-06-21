package huaweiLC;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>矩阵中的最长递增路径</p>
 *
 * @author : 张严
 * @date : 2021-06-15 15:33
 **/
public class No329 {
    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        int res = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res = Math.max(res, dfs(matrix, i, j, dp));
            }
        }
        System.out.printf(Arrays.deepToString(dp));
        return res;
    }

    private int dfs(int[][] matrix, int r, int c, int[][] dp){
        if(dp[r][c] >0) return dp[r][c];
        dp[r][c]++;
        if(r+1<matrix.length && matrix[r+1][c]>matrix[r][c]) dp[r][c] = Math.max(dp[r][c], dfs(matrix, r+1, c, dp)+1);
        if(r-1>=0 && matrix[r-1][c]>matrix[r][c]) dp[r][c] = Math.max(dp[r][c], dfs(matrix, r-1, c, dp)+1);
        if(c+1<matrix[0].length && matrix[r][c+1]>matrix[r][c]) dp[r][c] = Math.max(dp[r][c], dfs(matrix, r, c+1, dp)+1);
        if(c-1>=0 && matrix[r][c-1]>matrix[r][c]) dp[r][c] = Math.max(dp[r][c], dfs(matrix, r, c-1, dp)+1);
        return dp[r][c];
    }

    public static void main(String[] args) {
        No329 no329 = new No329();
        int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        System.out.println(no329.longestIncreasingPath(matrix));
    }
}
