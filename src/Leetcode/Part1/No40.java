package Leetcode.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>组合总和2</p>
 *
 * @author : 张严
 * @date : 2021-04-08 19:10
 **/
public class No40 {

    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            backstrack(candidates,target,0,i,list);
        }
        return res;
    }

    public  void backstrack(int[] candidates,int target,int sum,int index,List<Integer> list){
        if(sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        if(index==candidates.length||sum>target) return;

        list.add(candidates[index]);
        backstrack(candidates, target,sum+candidates[index],index+1,list);
        list.remove(list.size()-1);
        backstrack(candidates,target,sum,index+1,list);
    }

    public static void main(String[] args) {
        No40 no40 = new No40();
        System.out.println(no40.combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }
}
