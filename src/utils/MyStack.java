package utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>用队列实现栈</p>
 *
 * @author : 张严
 * @date : 2021-06-05 10:39
 **/
public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }


    public void push(int x) {
        queue1.offer(x);
    }


    public int pop() {
        while (queue1.size()>1) queue2.offer(queue1.poll());
        int res = queue1.poll();
        while (!queue2.isEmpty()) queue1.offer(queue2.poll());
        return res;
    }


    public int top() {
        while (queue1.size()>1) queue2.offer(queue1.poll());
        int res = queue1.peek();
        queue2.offer(queue1.poll());
        while (!queue2.isEmpty()) queue1.offer(queue2.poll());
        return res;
    }


    public boolean empty() {
        return queue1.isEmpty();
    }
}
