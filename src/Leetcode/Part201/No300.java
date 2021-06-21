package Leetcode.Part201;

/**
 * <h3>leetcode</h3>
 * <p>最长递归子列</p>
 *
 * @author : 张严
 * @date : 2021-04-01 17:03
 **/
public class No300 {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            dp[i]=1;
           for(int j=0;j<i;j++){
               if(nums[i]>nums[j]){
                   dp[i]=Math.max(dp[i],dp[j]+1);
               }
           }
        }
        int max=0;
        for(int x:dp){
            max=Math.max(x,max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
