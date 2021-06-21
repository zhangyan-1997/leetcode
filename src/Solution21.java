public class Solution21 {
    public static boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i<=max){
                max = Math.max(i+nums[i],max);
                if(max>=nums.length-1){
                    return true;
                }
            }else {
                break;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1};
        System.out.println(canJump(ints));
    }

}
