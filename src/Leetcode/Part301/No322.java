package Leetcode.Part301;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>零钱兑换</p>
 *
 * @author : 张严
 * @date : 2021-03-30 19:13
 **/
public class No322 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,10001);
        dp[0] = 0;
        for(int coin:coins){
            for (int i = coin; i <=amount; i++) {
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
                System.out.println("dp-"+i+":   "+dp[i]);
            }
        }
        return dp[amount]!=10001?dp[amount]:-1;
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{2,3,5},11));
    }
}
