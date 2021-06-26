package huaweiLC;

public class No85 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == '1') dp[0][i] = 1;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]=='1') dp[i][j] = dp[i-1][j] + 1;
            }
        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(dp[i][j]*dp[0].length<=res) continue;
                int count = 1;
                for (int k = j+1; k < dp[0].length; k++) {
                    if(dp[i][k]<dp[i][j]) break;
                    count++;
                }
                for (int k = j-1; k >= 0; k--) {
                    if(dp[i][k]<dp[i][j]) break;
                    count++;
                }
                res = Math.max(res, count*dp[i][j]);
            }
        }
        return res;
    }
}
