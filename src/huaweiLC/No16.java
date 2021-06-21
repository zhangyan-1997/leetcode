package huaweiLC;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>最接近的三数之和</p>
 *
 * @author : 张严
 * @date : 2021-06-20 14:13
 **/
public class No16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int res = 100000;
        for (int i = 0; i < nums.length-2; i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start < end){
                int sum = nums[i]+nums[start]+nums[end];
                if(Math.abs(sum - target) < Math.abs(res - target)) res = sum;
                if(sum < target) start++;
                else if(sum > target) end--;
                else return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        No16 no16 = new No16();
        System.out.println(no16.threeSumClosest(new int[]{1, 1, -1, -1, 3}, -1));
    }
}
