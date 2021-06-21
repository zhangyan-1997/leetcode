package Leetcode.Part1;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>在排序数组中查找元素的第一个和最后一个位置</p>
 *
 * @author : 张严
 * @date : 2021-03-31 20:55
 **/
public class No34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] soultion = new int[]{-1,-1};
        if(nums.length == 0){
            return soultion;
        }
        int left = 0;
        int right = nums.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                break;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
            if(nums[mid]<target){
                left=mid+1;
            }
        }
        if(left>right){
            return soultion;
        }
        int i=mid-1,j=mid+1;
        while(i>=0&&nums[i]==target){
            i--;
        }
        while (j<nums.length&&nums[j]==target) {
            j++;
        }
        soultion[0] = i+1;
        soultion[1] = j-1;
        return soultion;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},6)));
    }
}
