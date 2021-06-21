package Sort;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>快排</p>
 *
 * @author : 张严
 * @date : 2021-04-15 19:44
 **/
public class QuickSort {
    public void sort(int[] nums){
        pivot(nums,0,nums.length-1);
    }
    private void pivot(int[] nums,int left,int right){
        if(left>=right) return;
        int pi = nums[left];
        int i=left,j=right;
        while (i<j) {
            while (i < j && nums[j] >= pi) j--;
            if (i < j) nums[i++] = nums[j];
            while (i < j && nums[i] < pi) i++;
            if (i < j) nums[j--] = nums[i];
        }
        nums[i] = pi;
        pivot(nums,left,i-1);
        pivot(nums,i+1,right);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,9,7,3,4,1,0,8,10,2,5};
        new QuickSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
