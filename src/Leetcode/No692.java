package Leetcode;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>前k个高频单词</p>
 *
 * @author : 张严
 * @date : 2021-05-20 15:09
 **/
public class No692 {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words) map.put(word,map.getOrDefault(word,0)+1);

        //建立小顶堆
        PriorityQueue<String> queue = new PriorityQueue<>(k,(o1,o2)->{
            if(map.get(o1).equals(map.get(o2))) return o2.compareTo(o1);
            return map.get(o1) - map.get(o2);
        });

        for (String s: map.keySet()){
            queue.offer(s);
            if(queue.size()>k) queue.poll();
        }

        List<String> res = new ArrayList<>();
        while (queue.size()>0) res.add(queue.poll());
        Collections.reverse(res);
        return res;

    }

    public static void main(String[] args) {
        No692 no692 = new No692();
        System.out.println(no692.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
    }
}
