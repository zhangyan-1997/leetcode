package CyC2018.Java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>锁测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 14:18
 **/
public class LockTest {
    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()->lockExample.func());
        es.execute(()->lockExample.func());
        es.shutdown();
    }
}
