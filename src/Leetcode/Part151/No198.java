package Leetcode.Part151;

/**
 * <h3>leetcode</h3>
 * <p>打家砸舍</p>
 *
 * @author : 张严
 * @date : 2021-04-18 21:53
 **/
public class No198 {
    public static int rob(int[] nums) {
        int curr = 0;
        int prev = 0;
        for(int i=0;i<nums.length;i++){
            int temp = Math.max(curr,nums[i]+prev);
            prev = curr;
            curr=temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }
}
