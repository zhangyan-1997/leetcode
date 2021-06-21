package Leetcode.Part201;

/**
 * <h3>leetcode</h3>
 * <p>长度最小的子数组</p>
 *
 * @author : 张严
 * @date : 2021-05-30 20:48
 **/
public class No209 {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min,backstrack(nums,i,0,target) - i);
        }
        return min<=nums.length? min:0;
    }
    public int backstrack(int[] nums,int start,int sum,int target){
        if(sum >= target) return start;
        if(start >= nums.length) return Integer.MAX_VALUE;
        return backstrack(nums,start+1,sum+nums[start],target);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1,1,1,1};
        No209 no209 = new No209();
        System.out.println(no209.minSubArrayLen(11, nums));
    }
}
