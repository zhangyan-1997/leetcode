package byteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>下一个更大元素3</p>
 *
 * @author : 张严
 * @date : 2021-05-17 09:47
 **/
public class No556 {
    public int nextGreaterElement(int n) {
        if( n <10) return -1;

        //将数字每个字符单独存储
        List<Integer> list = new ArrayList<>();
        while (n>0){
            int x = n%10;
            list.add(x);
            n = n/10;
        }
        int[] nums = new int[list.size()];
        for (int i=0;i < list.size();i++){
            nums[list.size()-i-1] = list.get(i);
        }

        //进行变换
        //1.找到从后往前最进的逆序数
        int j= nums.length-1;
        while (j>0){
            if(nums[j]>nums[j-1]) break;
            j--;
        }

        if(j==0) return -1;

        int temp = 0;
        for (int i = nums.length-1; i >= j; i--) {
            if(nums[i]>nums[j-1]){
                temp = nums[i];
                nums[i] = nums[j-1];
                nums[j-1] = temp;
                break;
            }
        }
        reverse(nums,j,nums.length-1);
        int res = 0;
        int boundry = Integer.MAX_VALUE/10;
        for (int num:nums) {
            if(res>boundry||(res==boundry&&num>7)) return -1;
            res = res*10+num;
        }
        return res;
    }
    public void reverse(int[] nums,int left,int right){
        int temp =0;
        while(left<right){
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        No556 no556 = new No556();
        System.out.println(no556.nextGreaterElement(2147483486));
    }
}
