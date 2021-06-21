package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>找到所有数组中消失的数字</p>
 *
 * @author : 张严
 * @date : 2021-03-30 20:39
 **/
public class No448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n =nums.length;
        if(n==0) return new ArrayList<Integer>();
        for(int x:nums){
            nums[(x-1)%n] = nums[(x-1)%n]+n;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=nums.length){
                res.add(i+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1,2,3,4,5}));
    }
}
