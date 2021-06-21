package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <h3>leetcode</h3>
 * <p>数据流中的第K大元素</p>
 *
 * @author : 张严
 * @date : 2021-05-28 10:38
 **/
public class KthLargest {
    private PriorityQueue<Integer> queue;
    private int k ;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        //小顶堆
        queue = new PriorityQueue<>(k,(o1,o2)->(o1.compareTo(o2)));
        for (int i = 0; i < nums.length; i++) {
           if (queue.size()<k ) queue.offer(nums[i]);
           else if(nums[i]>queue.peek()){
               queue.poll();
               queue.offer(nums[i]);
           }
        }
    }

    public int add(int val) {
        if(queue.size()<k) queue.offer(val);
        else if(val>=queue.peek()){
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}
