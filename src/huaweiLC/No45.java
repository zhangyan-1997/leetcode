package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>跳跃游戏2</p>
 *
 * @author : 张严
 * @date : 2021-06-15 13:21
 **/
public class No45 {
    public int jump(int[] nums) {
        int start = 0;
        int end = 1;
        int res = 0;
        int maxPos = 0;
        while (end < nums.length){
            for (int i = start; i < end; i++) {
                maxPos = Math.max(maxPos, i + nums[i]);
            }
            start = end;
            end = maxPos + 1;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        No45 no45 = new No45();
        System.out.println(no45.jump(new int[]{2,3,0,1,4}));
    }
}
