package Sort;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>简单选择排序</p>
 *
 * @author : 张严
 * @date : 2021-04-15 21:10
 **/
public class SelectSort {
    public void sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int k = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[k]) k = j;
            }
            int temp=nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{6,9,7,11,3,4,1,0,8,10,2,5};
        new SelectSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
