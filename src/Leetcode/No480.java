package Leetcode;

import java.util.PriorityQueue;

/**
 * <h3>leetcode</h3>
 * <p>滑动窗口中位数</p>
 *
 * @author : 张严
 * @date : 2021-06-02 21:44
 **/

/*
public class No480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] res = new double[nums.length-k+1];
        if(nums == null || nums.length == 0) return res;

        PriorityQueue<Integer> queue_min = new PriorityQueue<>((k+1)/2);//小顶堆
        PriorityQueue<Integer> queue_max = new PriorityQueue<>(k/2,(o1,o2)->(o2-o1));

        for (int i = 0; i < k; i++) {
            if(queue_min.size()<(k+1)/2) queue_min.offer(nums[i]);
            else {
                queue_min.offer(nums[i]);
                queue_max.offer(queue_min.poll());
            }
        }

        int i = 0;
       while (i<res.length)
    }
}

 */
