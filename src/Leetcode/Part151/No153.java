package Leetcode.Part151;

/**
 * <h3>leetcode</h3>
 * <p>寻找排序旋转数组中的最小值</p>
 *
 * @author : 张严
 * @date : 2021-05-21 21:22
 **/
public class No153 {
    public int findMin(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1]) return nums[i];
        }
        return nums[0];
    }
}
