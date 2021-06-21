package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>最短无序连续子数组</p>
 *
 * @author : 张严
 * @date : 2021-04-02 10:40
 **/
public class No581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] news = Arrays.copyOf(nums, nums.length);
        Arrays.sort(news);
        int i=0,j=news.length-1;
        while (i<j){
            while (i<j&&news[i]==nums[i]) i++;
            while (j>i&&news[j]==nums[j]) j--;
            break;
        }
        System.out.println(nums[i]+","+nums[j]);
        if(i==j) return 0;
        return j-i+1;
    }

    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{1}));
    }
}
