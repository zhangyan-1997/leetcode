package Leetcode;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>两个数组的交集</p>
 *
 * @author : 张严
 * @date : 2021-06-05 10:53
 **/
public class No349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j =0;
        int[] res = new int[Math.min(nums1.length,nums2.length)];
        int k = 0;
        while (i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else {
                if(k==0 || res[k-1]!=nums1[i]) res[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(res,0,k);

    }

    public static void main(String[] args) {
        No349 no349 = new No349();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(no349.intersection(nums1, nums2)));
    }
}
