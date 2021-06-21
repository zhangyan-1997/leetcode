package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>删除有序数组中的重复项II</p>
 *
 * @author : 张严
 * @date : 2021-06-12 16:44
 **/
public class No80 {
    public int removeDuplicates(int[] nums) {

        int now = 0;
        int count = 0;

        while (now < nums.length){
            int temp = 1;
            while (now<nums.length-1 && nums[now+1]==nums[now]) {
                temp++;
                now++;
            }
            for (int i = 0; i < Math.min(2, temp); i++) {
                nums[count++] = nums[now];
            }
            now++;
        }
        return count;
    }

    public static void main(String[] args) {
        No80 no80 = new No80();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(no80.removeDuplicates(nums));
        System.out.printf(Arrays.toString(Arrays.copyOfRange(nums,0,no80.removeDuplicates(nums))));
    }
}
