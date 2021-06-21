package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>leetcode</h3>
 * <p>四数相加2</p>
 *
 * @author : 张严
 * @date : 2021-04-12 15:42
 **/
public class No454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                map.put(nums1[i]+nums2[j],map.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }
        int count=0;
        for(int k=0;k<nums3.length;k++){
            for(int l=0;l<nums4.length;l++){
                int sum = nums3[k]+nums4[l];
                count = count+map.getOrDefault(-sum,0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = new int[]{0,0};
        int[] B = new int[]{0,0};
        int[] C = new int[]{0,0};
        int[] D = new int[]{0,0};
        System.out.println(fourSumCount(A,B,C,D));
    }
}
