package Sort;


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>堆排序</p>
 *
 * @author : 张严
 * @date : 2021-04-15 21:27
 **/
public class HeapSort {
    public void sort(int[] nums){
        int i = (nums.length-1)/2;
        while (i>=0) {
            adjustHeap(nums,i,nums.length);
            i--;
        }
        for(int j = nums.length-1;j>=0;j--){
            int temp = nums[j];
            nums[j] = nums[0];
            nums[0] = temp;
            adjustHeap(nums,0,j);
        }
    }
    private void adjustHeap(int[] nums,int parent,int length){
        int temp = nums[parent];
        int lChildren = 2*parent+1;
        while (lChildren<length){
            int rChildren = lChildren+1;
            if(rChildren<length&&nums[lChildren]<nums[rChildren]) lChildren++;
            if(temp >=nums[lChildren]) break;
            nums[parent] = nums[lChildren];
            parent = lChildren;
            lChildren = 2*parent+1;
        }
        nums[parent] = temp;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{6,9,7,11,3,4,1,0,8,10,2,5};
        new HeapSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
