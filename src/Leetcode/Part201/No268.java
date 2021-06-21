package Leetcode.Part201;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>丢失的数字</p>
 *
 * @author : 张严
 * @date : 2021-03-30 13:52
 **/
public class No268 {
    public static int missingNumber(int[] nums) {
        int n=nums.length+1;
        boolean flag = false;
        for(int x:nums){
            if(x%n==n-1) flag = true;
           else nums[(x)%n] = nums[(x)%n]+n;
        }
        int res =-1;
        for(int i=0;i<nums.length;i++){
            if (nums[i]<n){
                res = i;
                break;
            }
        }
        if(res==-1&&flag==false) res=n-1;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0}));
    }
}
