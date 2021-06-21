package CyC2018.Java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * <h3>leetcode</h3>
 * <p>Semaphore示例</p>
 *
 * @author : 张严
 * @date : 2021-05-27 17:48
 **/
public class SemaphoreExample {
    public static void main(String[] args) {
        final int clientCount = 3;
        final int totalThread = 10;
        Semaphore semaphore = new Semaphore(clientCount);
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < totalThread; i++) {
            es.execute(()->{
                try {
                    semaphore.acquire();
                    System.out.println(semaphore.availablePermits()+"  ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            });
        }
        es.shutdown();
    }
}
