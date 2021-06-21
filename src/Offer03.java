/**
 * <h3>leetcode</h3>
 * <p>数组中的重复数字</p>
 *
 * @author : 张严
 * @date : 2021-04-14 10:50
 **/
public class Offer03 {
    public static int findRepeatNumber(int[] nums) {
        int n=nums.length;
        for(int x:nums){
            nums[x%n] = nums[x%n] + n;
        }
        for(int j=0;j<nums.length;j++){
            System.out.println(nums[j]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=n*2) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}
