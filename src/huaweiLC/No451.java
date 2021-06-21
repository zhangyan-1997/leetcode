package huaweiLC;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * <h3>leetcode</h3>
 * <p>根据字符串出现频率排序</p>
 *
 * @author : 张严
 * @date : 2021-06-21 15:27
 **/
public class No451 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((o1,o2)->(o2.getValue()-o1.getValue()));

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        queue.addAll(map.entrySet());
        StringBuilder res = new StringBuilder();
        while (!queue.isEmpty()){
            Map.Entry<Character, Integer> item = queue.poll();
            for (int i = 0; i < item.getValue(); i++) {
                res.append(item.getKey());
            }
        }
        return res.toString();
    }
}
