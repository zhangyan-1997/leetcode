package byteDance;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>排序数组</p>
 *
 * @author : 张严
 * @date : 2021-05-13 18:41
 **/
public class No912 {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    public void sort(int[] nums,int left,int right){
        if(left>=right) return;
        int start = left,end = right;
        int pivot = nums[left];
        while (left<right){
            while (left<right&&nums[right]>pivot) right--;
            if(left<right) nums[left++] = nums[right];
            while (left<right&&nums[left]<pivot) left++;
            if(left<right) nums[right--] = nums[left];
        }
        nums[left] = pivot;
        sort(nums,start,left-1);
        sort(nums,left+1,end);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,1,1,2,0,0};
        No912 no912 = new No912();
        System.out.println(Arrays.toString(no912.sortArray(nums)));
    }
}
