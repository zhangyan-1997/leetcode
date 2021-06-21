package huaweiLC;

import java.util.HashMap;

/**
 * <h3>leetcode</h3>
 * <p>数组的度</p>
 *
 * @author : 张严
 * @date : 2021-06-21 14:53
 **/
public class No697 {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashMap<Integer, Integer> firstMap = new HashMap<>();
        int res = nums.length;
        int curmaxcount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(!firstMap.containsKey(nums[i])) firstMap.put(nums[i], i);
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            if(countMap.get(nums[i])>curmaxcount){
                res = i-firstMap.get(nums[i])+1;
                curmaxcount = countMap.get(nums[i]);
            }else if(countMap.get(nums[i])==curmaxcount){
                res = Math.min(i-firstMap.get(nums[i])+1, res);
            }
        }
        return res;
    }
}
