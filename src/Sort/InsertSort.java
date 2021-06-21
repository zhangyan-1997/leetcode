package Sort;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>插入排序</p>
 *
 * @author : 张严
 * @date : 2021-04-15 21:15
 **/
public class InsertSort {
    public void sort(int[] nums){
        for(int i = 1;i<nums.length;i++){
            int temp = nums[i];
            int j = i-1;
            while (j>=0&&nums[j]>temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{6,9,7,11,3,4,1,0,8,10,2,5};
        new InsertSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
