package huaweiLC;

import java.util.*;


public class No18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4) return new ArrayList<>();
        Arrays.sort(nums);
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(!map.containsKey(nums[i]+nums[j])) {
                    List<int[]> list = new ArrayList<>();
                    list.add(new int[]{i, j});
                    map.put(nums[i]+nums[j], list);
                }
                else {
                    List<int[]> temp = map.get(nums[i]+nums[j]);
                    temp.add(new int[]{i, j});
                    map.put(nums[i] + nums[j], temp);
                }
            }
        }

        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int key = target - (nums[i] + nums[j]);
                if(!map.containsKey(key)) continue;
                List<int[]> values = map.get(key);
                for (int[] value: values){
                    if (value[1] >= i) continue;  //确保子区间无重复
                    res.add(new ArrayList<>(Arrays.asList(nums[value[0]], nums[value[1]], nums[i], nums[j])));
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
       for (List<Integer> s: res){
           ans.add(s);
       }
        return ans;
    }

    public static void main(String[] args) {
        No18 no18 = new No18();
        System.out.println(no18.fourSum(new int[]{2, 2, 2, 2,2}, 8));
    }
}



