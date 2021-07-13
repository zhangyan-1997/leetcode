package huaweiLC;

public class No1313 {
    public int[] decompressRLElist(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {
           count += nums[i];
        }
        int[] res = new int[count];
        int k = 0;
        for (int i = 1; i < nums.length; i += 2) {
            int j = 0;
            while (j < nums[i-1]){
                res[k++] = nums[i];
                j++;
            }
        }
        return res;
    }
}
