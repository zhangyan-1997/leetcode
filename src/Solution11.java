public class Solution11 {
    public static int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int res = nums[0];
        int now =nums[0];
        for(int i=1;i<nums.length;i++){
            now = Math.max(now+nums[i],nums[i]);
            res = Math.max(res,now);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
