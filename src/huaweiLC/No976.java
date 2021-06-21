package huaweiLC;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <h3>leetcode</h3>
 * <p>三角形的最大周长</p>
 *
 * @author : 张严
 * @date : 2021-06-20 15:16
 **/
public class No976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = nums.length-1; i >=0 ; i--) {
            int start = i-1;
            int end = i-2;
            if(nums[start]+nums[end]<=nums[i]) continue;
            else {
                int temp = nums[start]+nums[end]+nums[i];
                res = Math.max(temp, res);
            }
        }
        return res;
    }
}
