package Leetcode.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>全排列2</p>
 *
 * @author : 张严
 * @date : 2021-05-21 19:15
 **/
public class No47 {
    List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited,false);
        backstrace(nums,visited,new ArrayList<>());
        return res;
    }
    public void backstrace(int[] nums,boolean[] visited,List<Integer> list){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(visited[i]==false){
                list.add(nums[i]);
                visited[i] = true;
                backstrace(nums,visited,list);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        No47 no47 = new No47();
        System.out.println(no47.permuteUnique(new int[]{1, 2, 3}));
    }
}
