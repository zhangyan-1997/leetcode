package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>数组中两个数的最大异或值</p>
 *
 * @author : 张严
 * @date : 2021-05-18 11:34
 **/
public class No421 {
    public int findMaximumXOR(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = nums.length-1;i>=0;i--){
            for (int j = nums.length-1;j>=i;j--){
                res[i] = Math.max(res[i],nums[i]^nums[j]);
            }
        }
        int re = Integer.MIN_VALUE;
        for (int i = 0; i < res.length; i++) {
            re = Math.max(re,res[i]);
        }
        return re;
    }
}
