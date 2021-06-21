package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>和为k的子数组</p>
 *
 * @author : 张严
 * @date : 2021-03-30 19:54
 **/

public class No560 {
    public static int subarraySum(int[] nums, int k) {
        if (nums.length==0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            count = count+map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,-1,0},0));
    }
}


