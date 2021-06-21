package Leetcode.Part151;

/**
 * <h3>leetcode</h3>
 * <p>寻找峰值</p>
 *
 * @author : 张严
 * @date : 2021-04-19 21:51
 **/
public class No162 {
    public int findPeakElement(int[] nums) {
        int left = 0,right = nums.length-1;
        while (left<right){
            int mid = (left+right)/2;
            if(nums[mid]>nums[mid+1]){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        No162 no162 = new No162();
        System.out.println(no162.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}
