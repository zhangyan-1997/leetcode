package Sort;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>冒泡排序</p>
 *
 * @author : 张严
 * @date : 2021-04-15 21:00
 **/
public class BubbleSort {
    public void sort(int[] nums){
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{6,9,7,11,3,4,1,0,8,10,2,5};
        new BubbleSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
