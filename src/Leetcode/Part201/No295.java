package Leetcode.Part201;

import java.util.PriorityQueue;

/**
 * <h3>leetcode</h3>
 * <p>数据流的中位数</p>
 *
 * @author : 张严
 * @date : 2021-06-01 17:07
 **/
public class No295 {
    PriorityQueue<Integer> queue_min;
    PriorityQueue<Integer> queue_max;
    public No295() {
        queue_min = new PriorityQueue<>(); //小顶栈，存储较大的一半
        queue_max = new PriorityQueue<>((o1,o2)->(o2-o1)); //大顶栈，存储较小的一半
    }

    public void addNum(int num) {
        if(queue_min.size() == queue_max.size()){
            queue_max.offer(num);
            queue_min.offer(queue_max.poll());
        }else {
            queue_min.offer(num);
            queue_max.offer(queue_min.poll());
        }
    }

    public double findMedian() {
        if(queue_min.size() == queue_max.size()){
            return ((double)queue_max.peek()+(double)queue_min.peek())/2;
        }else return (double)queue_min.peek();
    }
}
