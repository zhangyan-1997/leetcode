package Leetcode.Part51;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>颜色分类</p>
 *
 * @author : 张严
 * @date : 2021-03-31 21:34
 **/

public class No75 {
    public static void sortColors(int[] nums) {
        if(nums.length<2) return;
        int temp=0;
        int i=0,j=0,k=nums.length-1;  //i指向第一个非0元素，移动指针，k指向从后往前第一个非2元素
        while (j<=k){
            if(nums[j]==0){
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }else if(nums[j]==2){

                temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                k--;
            }else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}


