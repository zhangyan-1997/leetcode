package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>二分查找</p>
 *
 * @author : 张严
 * @date : 2021-06-01 10:47
 **/
public class No704 {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while (i<=j){  //注意这里必须有等号，手工模拟一下，没有等号，查找不出来0
            int mid = i+(j-i)/2;
            if(target == nums[mid]) return mid;
            else if(target < nums[mid]) j = mid-1;
            else i = mid +1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        No704 no704 = new No704();
        System.out.println(no704.search(nums, 0));
    }
}
