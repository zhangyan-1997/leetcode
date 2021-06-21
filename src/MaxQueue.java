import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> max;

    public MaxQueue() {
        queue = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
        if(!max.isEmpty()){
            return max.peekFirst();
        }
        return -1;
    }

    public void push_back(int value) {
        while (!max.isEmpty()&&max.peekLast()<value){
            max.pollLast();
        }
        queue.offer(value);
        max.offerLast(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }
        if(queue.peek().equals(max.peekFirst())) {
            max.pollFirst();
        }
        return queue.poll();
    }
}