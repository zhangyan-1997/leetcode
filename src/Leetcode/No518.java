package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>零钱兑换2</p>
 *
 * @author : 张严
 * @date : 2021-05-31 09:40
 **/
public class No518 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,5001);
        dp[0] = 0;

        int count = 0;
        int pre = 0;
        for (int coin: coins){
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i],dp[i-coin]+1);
                if(dp[i] == dp[i-coin]+1) count++;
            }
        }
        System.out.println(dp[amount]);
        return count;
    }

    public static void main(String[] args) {
        No518 no518 = new No518();
        System.out.println(no518.change(5, new int[]{1, 2, 5}));
    }
}
