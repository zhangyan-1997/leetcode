package CyC2018.Java.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>线程不安全测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 19:17
 **/
public class ThreadUnsafeTest {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 1000;
        ThreadUnsafeExample example = new ThreadUnsafeExample();
        ExecutorService es = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);

        for (int i = 0; i < 1000; i++) {
            es.execute(()->{
                example.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        es.shutdown();
        System.out.println(example.getCnt());
    }
}
