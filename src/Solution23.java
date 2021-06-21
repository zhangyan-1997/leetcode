import java.util.*;

public class Solution23 {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0) + 1);
        }
        Queue<int[]> heap = new PriorityQueue<>(k,(x1, x2)->{return x1[1]-x2[1];});

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            System.out.println("key:"+num+" "+"value"+count);
            if(heap.size()==k){
                if(heap.peek()[1]<count){
                    heap.poll();
                    heap.offer(new int[]{num,count});
                }
            }else{
                heap.offer(new int[]{num,count});
            }

        }
        int[] res = new int[k];
        int i = 0;
        while(!heap.isEmpty()){
            res[i++] = heap.poll()[0];
        }
        return res;

    }

    public static void main(String[] args) {
        int[] ints = new int[]{1};
        int[] res =(topKFrequent(ints,1));
        System.out.println(Arrays.toString(res));
    }
}
