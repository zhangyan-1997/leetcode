package Leetcode.Part301;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>两个数组的交集2</p>
 *
 * @author : 张严
 * @date : 2021-04-12 13:40
 **/
public class No350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return intersect(nums2,nums1);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        int[] res = new int[nums1.length];
        int index =0;
        for(int j=0;j<nums2.length;j++){
            int count = map.getOrDefault(nums2[j],0);
           if(count>0){
               res[index++] = nums2[j];
               count--;
               if(count>0) map.put(nums2[j],count);
               else map.remove(nums2[j]);
           }
        }
        return Arrays.copyOfRange(res,0,index);
    }

    public static void main(String[] args) {
        No350 no350 = new No350();
        System.out.println(Arrays.toString(no350.intersect(new int[]{4,9,5},new int[]{9,4,9,8,4})));
    }
}
