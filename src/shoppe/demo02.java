package shoppe;

public class demo02 {
    public long GetNumOfExpress(String express, boolean desired) {
        // write code here
        int flag = 0;
        if(desired==true) flag = 1;
        if(express.length() == 0) return 0;
        if(express.length() == 1) return (express.charAt(0)-'0') == flag && desired? 1: 0;
        char[] ch = express.toCharArray();
        int[][][] dp = new int[ch.length][ch.length][2];
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '0' || ch[i] == '1') dp[i][i][ch[i]-'0'] = 1;
        }

        for (int len = 2; len <= ch.length; len+=2) {
            for (int i = 0; i <= ch.length - len; i+=2) {
                int j = i+ len;
                for (int k = i+1; k <= j-1; k+=2) {
                    if(ch[k] == '&'){
                        dp[i][j][0] += dp[i][k-1][0] * dp[k+1][j][0] + dp[i][k-1][0]*dp[k+1][j][1] + dp[i][k-1][1]*dp[k+1][j][0];
                        dp[i][j][1] += dp[i][k-1][1] * dp[k+1][j][1];
                    }
                    if(ch[k] == '|'){
                        dp[i][j][0] += dp[i][k-1][0] * dp[k+1][j][0];
                        dp[i][j][1] += dp[i][k-1][0] * dp[k+1][j][1] + dp[i][k-1][1]*dp[k+1][j][0] + dp[i][k-1][1]*dp[k+1][j][1];
                    }
                    if(ch[k] == '^'){
                        dp[i][j][0] += dp[i][k-1][0] * dp[k+1][j][0] + dp[i][k-1][1]*dp[k+1][j][1];
                        dp[i][j][1] += dp[i][k-1][1] * dp[k+1][j][0] + dp[i][k-1][0]*dp[k+1][j][1];
                    }
                }
            }
        }
        return dp[0][ch.length-1][flag];
    }

    public static void main(String[] args) {
        demo02 demo02 = new demo02();
        System.out.println(demo02.GetNumOfExpress("1^0|0|1", false));
    }
}
