package CyC2018.Java.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>CountdownLatch类</p>
 *
 * @author : 张严
 * @date : 2021-05-27 16:47
 **/
public class CountdownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            es.execute(()->{
                System.out.println("run...  ");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println("end===========");
        es.shutdown();
    }
}
