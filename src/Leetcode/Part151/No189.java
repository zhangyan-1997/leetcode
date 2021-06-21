package Leetcode.Part151;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>旋转数组</p>
 *
 * @author : 张严
 * @date : 2021-04-23 17:28
 **/
public class No189 {
    public void rotate(int[] nums, int k) {
        if(k>=nums.length) k =k%nums.length;
        if(k<=0) return;
        int[] temp = new int[k];
        for(int i=nums.length-k;i<nums.length;i++){
            temp[i-nums.length+k] = nums[i];
        }
        for (int i = nums.length-1; i >= k; i--) {
            nums[i] = nums[i-k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        No189 no189 = new No189();
        int[] nums = new int[]{-1,-100,3,99};
        no189.rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }
}
