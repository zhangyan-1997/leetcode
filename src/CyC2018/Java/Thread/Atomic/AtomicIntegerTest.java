package CyC2018.Java.Thread.Atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>原子整形测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 20:53
 **/
public class AtomicIntegerTest {
    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerExample example = new AtomicIntegerExample();
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            es.execute(()->example.add());
        }
        Thread.sleep(100);
        System.out.println(example.getCnt());


        AtomicSynchronizedExample example1 = new AtomicSynchronizedExample();
        for (int i = 0; i < 1000; i++) {
            es.execute(()->example1.add());
        }
        Thread.sleep(100);
        es.shutdown();
        System.out.println(example1.getCnt());
    }
}
