package CyC2018.Java.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h3>leetcode</h3>
 * <p>可重入锁</p>
 *
 * @author : 张严
 * @date : 2021-05-27 14:15
 **/
public class LockExample {
    private Lock lock = new ReentrantLock();

    public void func(){
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i+" ");
            }
        }finally {
            lock.unlock();
        }
    }
}
