package Leetcode.Part101;

/**
 * <h3>leetcode</h3>
 * <p>买卖股票的最佳时机2</p>
 *
 * @author : 张严
 * @date : 2021-05-25 16:20
 **/
public class No122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit += Math.max(0,prices[i]-prices[i-1]);
        }
        return maxProfit;
    }
}
