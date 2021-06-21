import java.util.Arrays;

public class Solution29 {
    public static int maxProduct(int[] nums){
        if(nums.length==0||nums==null) return 0;
        if (nums.length==1) return nums[0];
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int res = dpMax[0];
        for (int i=1;i<nums.length;i++){
            dpMax[i] = Math.max(Math.max(dpMax[i-1]*nums[i],dpMin[i-1]*nums[i]),nums[i]);
            dpMin[i] = Math.min(Math.min(dpMax[i-1]*nums[i],dpMin[i-1]*nums[i]),nums[i]);
            res = Math.max(res,dpMax[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{2,-1,1,1};
        System.out.println(maxProduct(ints));
    }
}
