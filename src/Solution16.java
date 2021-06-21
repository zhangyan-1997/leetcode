import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution16 {
    static List<Integer> list = new ArrayList<>();
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backStrack(candidates,target,0,0);
        return res;
    }
    private static void backStrack(int[] candidates,int target,int sum,int index){
        if(sum == target){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=index;i<candidates.length&&(sum+candidates[i]<=target);i++){
            list.add(candidates[i]);
            sum = sum+candidates[i];
            backStrack(candidates,target,sum,i);
            sum = sum-candidates[i];
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[]{2,3,5};
        combinationSum(ints,8);
        System.out.println(res);
    }
}
