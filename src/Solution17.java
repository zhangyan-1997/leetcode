import java.util.ArrayList;
import java.util.List;

public class Solution17 {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> list = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for(int i=0;i<visited.length;i++){
            visited[i] = false;
        }
        backstrack(nums,visited);
        return res;
    }
    private static void backstrack(int[] nums,boolean[] visited){
        if(list.size()== nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==false){
                list.add(nums[i]);
                visited[i] = true;
                backstrack(nums,visited);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3};
        System.out.println(permute(ints));
    }
}
