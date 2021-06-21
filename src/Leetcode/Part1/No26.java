package Leetcode.Part1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>删除有序数组中的重复项</p>
 *
 * @author : 张严
 * @date : 2021-04-18 15:49
 **/
public class No26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;
        int fast =1,slow=1;
        while (fast<nums.length){
            if(nums[fast]!=nums[fast-1]) nums[slow++] = nums[fast];
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
