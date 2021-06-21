package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>搜索旋转排序数组</p>
 *
 * @author : 张严
 * @date : 2021-03-31 20:21
 **/
public class No33 {
    public static int search(int[] nums, int target) {
        int start=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                start = i;
                break;
            }
        }
        int left=0,right=0;
        if(start==nums.length){
            left=0;
            right=start-1;
        }else if(target<=nums[nums.length-1]&&target>=nums[start]){
            left = start;
            right = nums.length-1;
        }else if(target>=nums[0]&&target<=nums[start-1]){
            left=0;
            right=start-1;
        }else {
            return -1;
        }
        int mid=0;
        while (left<=right){
            mid=(left+right)/2;
            if(nums[mid]<target) left=mid+1;
            if(nums[mid]>target) right=mid-1;
            if(nums[mid]==target) return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1},2));
    }
}
