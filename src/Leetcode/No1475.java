package Leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>商品折扣后的最终价格</p>
 *
 * @author : 张严
 * @date : 2021-06-05 09:38
 **/
public class No1475 {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>(); //stack存储下标
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]){
                index = stack.pop();
                prices[index] = prices[index] - prices[i];
            }
            stack.push(i);
        }
        return prices;
    }

    public static void main(String[] args) {
        No1475 no1475 = new No1475();
        int[] prices = {10};
        System.out.println(Arrays.toString(no1475.finalPrices(prices)));
    }
}
