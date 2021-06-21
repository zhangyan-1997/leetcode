package Leetcode.Part301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>比特位计数</p>
 *
 * @author : 张严
 * @date : 2021-04-01 18:05
 **/
public class No338 {
    public static int[] countBits(int num) {
        List<Integer> coins = new ArrayList<>();
        int i=1;
        while(i<=num){
            coins.add(i);
            i=i*2;
        }
        int[] dp=new int[num+1];
        Arrays.fill(dp,num);
        dp[0]=0;
        for(int coin:coins){
            for(int j=coin;j<=num;j++){
                dp[j]=Math.min(dp[j],dp[j-coin]+1);
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(16)));
    }
}
