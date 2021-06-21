package CyC2018.Java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>死锁测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 14:43
 **/
public class DeadLockTest2 {
    public static void main(String[] args) {
        DeadLockDemo2 dD2 = new DeadLockDemo2();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()->dD2.fun1());
        es.execute(()->dD2.fun2());
        es.shutdown();
    }
}
