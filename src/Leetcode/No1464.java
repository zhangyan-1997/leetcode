package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>数组中两元素的最大乘积</p>
 *
 * @author : 张严
 * @date : 2021-06-06 21:46
 **/
public class No1464 {
    public int maxProduct(int[] nums) {
        int max = -1;
        int second = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                second = max;
                max = nums[i];
            }else if(nums[i] > second) second = nums[i];
        }
        return (second-1)*(max-1);
    }
}
