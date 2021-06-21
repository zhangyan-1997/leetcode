public class Solution10 {
    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        int left = 0;
        int right = nums.length-1;
        int mid =0;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(nums[left]<target) {
            return left + 1;
        }else{
            return left;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
}
