package huaweiLC;

public class No974 {
    public int subarraysDivByK(int[] nums, int k) {
        int[] map = new int[k];
        map[0] = 1;
        int presum = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            presum += nums[i];
            int key = (presum%k + k)%k;
            res += map[key];
            map[key]++;
        }
        return res;
    }

    public static void main(String[] args) {
        No974 no974 = new No974();
        System.out.println(no974.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
    }
}
