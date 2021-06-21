package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>数组中重复的数据</p>
 *
 * @author : 张严
 * @date : 2021-05-31 16:37
 **/
public class No442 {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        for (int x: nums){
            nums[(x-1)%n] += n;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 2*n) res.add(i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        No442 no442 = new No442();
        System.out.println(no442.findDuplicates(new int[]{1}));
    }
}
