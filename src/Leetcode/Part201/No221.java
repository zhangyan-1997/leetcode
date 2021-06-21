package Leetcode.Part201;

/**
 * <h3>leetcode</h3>
 * <p>最大正方形</p>
 *
 * @author : 张严
 * @date : 2021-04-18 21:00
 **/
public class No221 {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        int maxSide = 0;
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]=='1') dp[0][i]=1;
            maxSide = Math.max(maxSide,dp[0][i]);
        }
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[i][0]=='1') dp[i][0]=1;
            maxSide = Math.max(maxSide,dp[i][0]);
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]=='1') {
                    dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                }
                maxSide = Math.max(maxSide,dp[i][j]);
            }
        }
        return maxSide*maxSide;
    }
}
