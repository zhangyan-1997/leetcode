package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>不同的二叉搜索树</p>
 *
 * @author : 张严
 * @date : 2021-04-01 02:09
 **/
public class No96 {
    public static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i] = dp[i]+dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(2));
    }
}
