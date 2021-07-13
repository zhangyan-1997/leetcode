package huaweiLC;

import java.util.Arrays;

public class No416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        if((sum&1) == 1) return false;
        int target = sum/2;

        boolean[][] dp = new boolean[nums.length][target+1];
        if(nums[0] <= target) dp[0][nums[0]] = true;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i-1][j];
                if(nums[i]==j) {
                    dp[i][j] = true;
                    continue;
                }
                if(nums[i]<j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[dp.length-1][target];
    }

    public static void main(String[] args) {
        No416 no416 = new No416();
        System.out.println(no416.canPartition(new int[]{1, 5, 11, 5}));
    }
}
