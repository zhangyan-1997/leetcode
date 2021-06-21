package Leetcode.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>最接近的三数之和</p>
 *
 * @author : 张严
 * @date : 2021-05-21 19:56
 **/
public class No16 {
    List<List<Integer>> res;
    public int threeSumClosest(int[] nums, int target) {
        res = new ArrayList<>();
        backstrace(nums,0,0,0,new ArrayList<>());
        int ans = Integer.MAX_VALUE;

        for (List<Integer> l:res){
            System.out.println(l);
            int count = 0;
            for(int x:l) count+=x;
            if(Math.abs(count-target)<Math.abs(ans-target)) ans = count;
        }
        return ans;

    }
    public void backstrace(int[] nums, int sum, int k,int index, List<Integer> list){
        if(k==3) res.add(new ArrayList<>(list));
        if(index >= nums.length) return;
        list.add(nums[index]);
        backstrace(nums,sum+nums[index],k+1,index+1,list);
        list.remove(list.size()-1);
        backstrace(nums,sum,k,index+1,list);
    }

    public static void main(String[] args) {
        No16 no16 = new No16();
        System.out.println(no16.threeSumClosest(new int[]{1,1,-1,-1,3}, -1));
    }
}
