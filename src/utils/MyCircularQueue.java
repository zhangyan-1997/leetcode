package utils;

/**
 * <h3>leetcode</h3>
 * <p>设计循环队列</p>
 *
 * @author : 张严
 * @date : 2021-06-10 18:35
 **/
public class MyCircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int cap;

    public MyCircularQueue(int k) {
        if(k<0) return;
        arr = new int[k];
        front = 0;
        rear = -1;
        cap = k;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        arr[rear] = value;
        rear = (rear + 1)%cap;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        front = (front+1)%cap;
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear-1];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return front == rear +1;
    }
}
