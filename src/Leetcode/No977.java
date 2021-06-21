package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>有序数组的平方</p>
 *
 * @author : 张严
 * @date : 2021-06-01 08:50
 **/
public class No977 {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;
        while (i<=j){

            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k--] = nums[i]*nums[i];
                i++;
            } else {
                res[k--] = nums[j]*nums[j];
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        No977 no977 = new No977();
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(no977.sortedSquares(nums)));
    }
}
