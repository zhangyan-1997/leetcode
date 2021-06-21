package utils;

import java.util.PriorityQueue;

/**
 * <h3>leetcode</h3>
 * <p>数据流的中位数</p>
 *
 * @author : 张严
 * @date : 2021-05-28 17:08
 **/
public class MedianFinder {

    //如果是奇数，小顶堆多一个，如果是偶数，两个堆一样多
    PriorityQueue<Integer> min_queue;
    PriorityQueue<Integer> max_queue;

    public MedianFinder() {
        min_queue = new PriorityQueue<>();
        max_queue = new PriorityQueue<>((x,y)->(y-x));
    }

    public void addNum(int num) {
        if(min_queue.size()!=max_queue.size()){
            min_queue.offer(num);
            max_queue.offer(min_queue.poll());
        }else {
            max_queue.offer(num);
            min_queue.offer(max_queue.poll());
        }
    }

    public double findMedian() {
        double res = 0.0;
        if(min_queue.size()==max_queue.size()) res = (min_queue.peek()+max_queue.peek())/2;
        else res = min_queue.peek();
        return res;
    }
}
