package huaweiLC;

public class No1004 {
    public int longestOnes(int[] nums, int k) {
        int right = 0;
        int left = 0;
        int zero = 0;
        int res = 0;
        while (right < nums.length){
            if(nums[right] == 0) zero++;
            while (zero > k){
                if(nums[left]==0) zero--;
                left ++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        No1004 no1004 = new No1004();
        System.out.println(no1004.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 0));
    }
}
