package Sort;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>归并排序</p>
 *
 * @author : 张严
 * @date : 2021-04-15 20:07
 **/
public class Mergesort {
    public void sort(int[] nums){
        merge(nums,0,nums.length-1,new int[nums.length]);
    }
    private void merge(int[] nums,int left,int right,int[] help){
        if(left>=right) return;
        int mid = left+(right-left)/2;
        merge(nums,left,mid,help);
        merge(nums,mid+1,right,help);

        int i = left,j=mid+1;
        int k=0;
        while (i<=mid&&j<=right){
            if(nums[i]<nums[j]) help[k++] = nums[i++];
            else help[k++] = nums[j++];
        }
        while (i<=mid) help[k++] = nums[i++];
        while(j<=right) help[k++] = nums[j++];

        for(int m=0;m<k;m++){
            nums[m+left] = help[m];
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{6,9,7,11,3,4,1,0,8,10,2,5};
        new Mergesort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
