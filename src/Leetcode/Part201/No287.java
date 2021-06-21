package Leetcode.Part201;

/**
 * <h3>leetcode</h3>
 * <p>寻找重复数</p>
 *
 * @author : 张严
 * @date : 2021-04-01 13:18
 **/
public class No287 {
    public static int findDuplicate(int[] nums) {
        int n=nums.length;
        for (int x:nums){
            nums[(x)%n] = nums[x%n]+n;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>2*n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,1,2}));
    }
}
