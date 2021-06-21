package CyC2018.Java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>Synchronized测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 13:58
 **/
public class SynchronizedTest {
    public static void main(String[] args) {
        /*
        SynchronizedExample e1 = new SynchronizedExample();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()->e1.func1());
        es.execute(()->e1.func1());
        es.shutdown();

         */
        SynchronizedExample e1 = new SynchronizedExample();
        SynchronizedExample e2 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e2.func1());
        executorService.shutdown();

    }
}
