package ZJOffer;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>n个骰子的点数</p>
 *
 * @author : 张严
 * @date : 2021-04-08 16:20
 **/
public class Offer60 {
    public static double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp,(double) 1/6);

        for(int i=2;i<=n;i++){
            double[] temp = new double[5*i+1];
            for(int j=0;j<dp.length;j++){
                for(int k=0;k<6;k++){
                    temp[j+k] = temp[j+k]+dp[j]/6;
                }
            }
            dp = temp;
        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dicesProbability(2)));
    }
}
