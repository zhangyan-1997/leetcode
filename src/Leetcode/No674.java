package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>最长连续递增序列</p>
 *
 * @author : 张严
 * @date : 2021-06-07 13:59
 **/
public class No674 {
    public int findLengthOfLCIS(int[] nums) {
        int res = 1;
        int count = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] < nums[i+1]) count++;
            else {
                res = Math.max(res,count);
                count = 1;
            }
        }
        return Math.max(res,count);
    }
}
