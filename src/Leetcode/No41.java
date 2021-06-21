package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>缺失的第一个正数</p>
 *
 * @author : 张严
 * @date : 2021-06-02 22:13
 **/

public class No41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]>0&&nums[i]<=nums.length&&nums[nums[i]-1]!=nums[i]){
                swap(nums,nums[i]-1,i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1) return i+1;
        }
        return nums.length + 1;
    }
    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        No41 no41 = new No41();
        System.out.println(no41.firstMissingPositive(nums));
    }
}


