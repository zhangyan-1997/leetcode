package CyC2018.Java.Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>CyclicBarrier示例</p>
 *
 * @author : 张严
 * @date : 2021-05-27 17:41
 **/
public class CyclicBarrierExample {
    public static void main(String[] args) {
        final int totalThread = 10;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < totalThread; i++) {
            es.execute(()->{
                System.out.println("before..    ");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("after...   ");
            });
        }
        es.shutdown();
    }
}
