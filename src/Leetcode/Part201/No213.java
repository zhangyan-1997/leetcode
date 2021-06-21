package Leetcode.Part201;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>打家劫舍2</p>
 *
 * @author : 张严
 * @date : 2021-05-31 15:36
 **/
public class No213 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums,0,nums.length-1)),myRob(Arrays.copyOfRange(nums,1,nums.length)));

    }

    private int myRob(int[] nums){
        int curr = 0;
        int prev = 0;
        for(int i=0;i<nums.length;i++){
            int temp = Math.max(curr,nums[i]+prev);
            prev = curr;
            curr=temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        No213 no213 = new No213();
        System.out.println(no213.rob(new int[]{1,3,1,3,100}));
    }
}
