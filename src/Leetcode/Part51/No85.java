package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>最大矩形</p>
 *
 * @author : 张严
 * @date : 2021-05-19 10:56
 **/
public class No85 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0||matrix[0].length==0) return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i]=='1') dp[0][i] = 1;
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][0]==1) dp[i][0] = 1;
            }
        }

        int res = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                if(dp[i][j]*matrix[0].length<=res) continue;
                if(dp[i][j]!=0){
                    int cnt = 1;
                    for (int k = j+1;k<matrix[0].length;k++){
                        if(dp[i][k] < dp[i][j]) break;
                        cnt ++;
                    }
                    for (int k = j-1;k>=0;k--){
                        if(dp[i][k] < dp[i][j]) break;
                        cnt ++;
                    }
                    res = Math.max(res,cnt*dp[i][j]);
                }
            }
        }
        return res;
    }
}
