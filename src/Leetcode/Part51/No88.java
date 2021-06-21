package Leetcode.Part51;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>合并两个有序数组</p>
 *
 * @author : 张严
 * @date : 2021-04-09 16:39
 **/
public class No88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        while (i>=0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while (j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }


    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1};
        int[] num2 = new int[0];
        merge(num1,1,num2,0);
        System.out.println(Arrays.toString(num1));

    }

}
