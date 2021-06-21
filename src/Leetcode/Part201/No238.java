package Leetcode.Part201;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>除自身以外数组的乘积</p>
 *
 * @author : 张严
 * @date : 2021-04-12 18:28
 **/
public class No238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int current =1;
        for(int i=0;i<nums.length;i++){
            res[i]=current;
            current = current*nums[i];
        }
        current = 1;
        for(int j=nums.length-1;j>=0;j--){
            res[j] = res[j]*current;
            current = nums[j]*current;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
}
