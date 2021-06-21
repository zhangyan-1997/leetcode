package ZJOffer;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>数据流中的中位数</p>
 *
 * @author : 张严
 * @date : 2021-04-08 11:06
 **/
public class Offer41 {
    //优先队列默认的是小顶堆
    Queue<Integer> A = new PriorityQueue<>(); //小顶堆，存储较大的一半元素
    Queue<Integer> B = new PriorityQueue<>((x,y)->(y-x)); //大顶堆，存储较小的一半元素
    public Offer41() {

    }
    public void addNum(int num) {
        if(A.size()!=B.size()){
            A.offer(num);
            B.offer(A.poll());
        }else {
            B.offer(num);
            A.offer(B.poll());
        }
    }

    public double findMedian() {
        double res = 0.0;
        if(A.size()!=B.size()) res = (double)A.peek();
        else res = (double) (A.peek()+B.peek())/2;
        return res;
    }

    public static void main(String[] args) {
        Offer41 offer41 = new Offer41();
        offer41.addNum(1);
        offer41.addNum(2);
        System.out.println(offer41.findMedian());
        offer41.addNum(3);
        System.out.println(offer41.findMedian());
    }
}
