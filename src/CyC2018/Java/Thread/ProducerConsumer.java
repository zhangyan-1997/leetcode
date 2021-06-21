package CyC2018.Java.Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * <h3>leetcode</h3>
 * <p>生产者消费者问题</p>
 *
 * @author : 张严
 * @date : 2021-05-27 18:15
 **/
public class ProducerConsumer {
    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

    private static class Producer extends Thread{
        @Override
        public void run(){
            try {
                queue.put("product");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产了一个产品.....");
        }
    }

    private static class Consumer extends Thread{
        @Override
        public void run(){
            try {
                String producer = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费了一个产品.....");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Producer().start();
        }

        for (int i = 0; i < 5; i++) {
            new Consumer().start();
        }

        for (int i = 0; i < 3; i++) {
            new Producer().start();
        }
    }

}
