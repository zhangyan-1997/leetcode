package huaweiLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
public class No18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4) return new ArrayList<>();
        Arrays.sort(nums);
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(!map.containsKey(nums[i]+nums[j])) map.put(nums[i]+nums[j], new ArrayList<>());
                else {
                    List<int[]> temp = map.get(nums[i]+nums[j]);
                    temp.add(new int[]{i, j});
                    map.put(nums[i] + nums[j], temp);
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int key = target - (nums[i] + nums[j]);
                if(map.containsKey(key)) {
                    List<int[]> list = map.get(key);
                    for (int[] l : list){
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[l[0]], nums[l[1]])));
                    }
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        No18 no18 = new No18();
        System.out.println(no18.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}
 */


