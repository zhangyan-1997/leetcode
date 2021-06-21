package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>最长重复子数组</p>
 *
 * @author : 张严
 * @date : 2021-06-07 09:34
 **/
public class No718 {
    public int findLength(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) return findLength(nums2,nums1);

        int an = nums1.length;
        int bn = nums2.length;

        int max = 0;

        for (int i = 0; i < an; i++) {
            max = Math.max(max, maxLen(nums1, 0, nums2, bn-i-1,i+1));
        }

        for (int i = 0; i < bn - an; i++) {
            max = Math.max(max, maxLen(nums1, 0, nums2, i, an));
        }

        for (int i = 1; i < an; i++) {
            max = Math.max(max, maxLen(nums1,i, nums2,0, an-i));
        }
        return max;
    }

    private int maxLen(int[] nums1, int i,int[] nums2, int j, int len){
        int count = 0;
        int max = 0;
        for (int k = 0; k < len; k++) {
            if(nums1[i+k] == nums2[j+k]) count++;
            else {
                max = Math.max(max,count);
                count = 0;
            }
        }
        return Math.max(count,max);
    }

    public static void main(String[] args) {
        No718 no718 = new No718();
        int[] A ={1,2,3,2,1,4,7};
        int[] B ={3,2,1,4,7};
        System.out.println(no718.findLength(A, B));
    }
}
