package Leetcode.Part101;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>leetcode</h3>
 * <p>最长连续序列</p>
 *
 * @author : 张严
 * @date : 2021-05-19 08:40
 **/
public class No128 {
    public int longestConsecutive(int[] nums) {

        int res = 0;
        int length = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums){
            if(!map.containsKey(num)){
                int left = map.getOrDefault(num-1,0);
                int right = map.getOrDefault(num+1,0);

                map.put(num,1);
                length = left +right +1;
                res = Math.max(res,length);
                map.put(num-left,length);
                map.put(num+right,length);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        No128 no128 = new No128();
        System.out.println(no128.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
