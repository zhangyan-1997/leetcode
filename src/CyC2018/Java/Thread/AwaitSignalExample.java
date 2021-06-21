package CyC2018.Java.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h3>leetcode</h3>
 * <p>await与Signal</p>
 *
 * @author : 张严
 * @date : 2021-05-27 16:26
 **/
public class AwaitSignalExample {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void before(){
        lock.lock();
        try {
            System.out.println("before");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void after(){
        lock.lock();
        try {
            condition.await();
            System.out.println("after");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
