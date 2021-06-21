import java.util.ArrayList;
import java.util.List;

public class Solution19 {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> list = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        backstrack(nums,0);
        return res;
    }
    private static void backstrack(int[] nums,int index){
        res.add(new ArrayList<Integer>(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            backstrack(nums,i+1);
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3};
        System.out.println(subsets(ints));
    }
}
