package Leetcode.Part1;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>字母异位词分组</p>
 *
 * @author : 张严
 * @date : 2021-03-31 21:07
 **/
public class No49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res =new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s :strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);

            List<String> temp = map.getOrDefault(key,new ArrayList<>());
            temp.add(s);
            map.put(key,temp);
        }
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
