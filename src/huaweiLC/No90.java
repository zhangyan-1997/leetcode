package huaweiLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * *<h>leetcode<h>
 * *@author:张严
 * *<p>子集II<p>
 * *@date 2021-06-24  22:58
 */
public class No90 {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>());
        return res;
    }

    private void dfs(int[] nums, int index, List<Integer> list){
        res.add(new ArrayList<>(list));
        if(index == nums.length) return;

        for (int i = index; i < nums.length; i++){
            if(i>index&&nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            dfs(nums, i+1, list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        No90 no90 = new No90();
        System.out.println(no90.subsetsWithDup(new int[]{1, 2, 2}));
    }
}
