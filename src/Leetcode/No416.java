package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>分割等和子集</p>
 *
 * @author : 张严
 * @date : 2021-04-09 11:13
 **/
public class No416 {
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(sum%2!=0) return false;
        Arrays.sort(nums);
        return backstrack(nums,0,sum/2,0);

    }
    public static boolean backstrack(int[] nums,int sum,int target,int index){
        if(sum ==target) return true;
        if(index==nums.length||sum>target) return false;
        return backstrack(nums,sum+nums[index],target,index+1)|| backstrack(nums,sum,target,index+1);
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97}));
    }
}
