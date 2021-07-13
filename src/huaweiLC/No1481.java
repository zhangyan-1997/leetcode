package huaweiLC;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class No1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            queue.offer(entry);
        }

        int size = queue.size();
        System.out.println(size);

        while (!queue.isEmpty()&&k>0){
            Map.Entry<Integer, Integer> cur = queue.poll();
            k -= cur.getValue();
            if(k<0) break;
            size--;

        }
        return size;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,1,1,3,3,2};
        No1481 no1481 = new No1481();
        System.out.println(no1481.findLeastNumOfUniqueInts(arr, 3));
    }
}
