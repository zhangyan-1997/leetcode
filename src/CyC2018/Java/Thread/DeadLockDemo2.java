package CyC2018.Java.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h3>leetcode</h3>
 * <p>死锁函数版</p>
 *
 * @author : 张严
 * @date : 2021-05-27 14:37
 **/
public class DeadLockDemo2 {
    private Lock lockA = new ReentrantLock();
    private Lock lockB = new ReentrantLock();

    public void fun1(){
        lockA.lock();
        System.out.println("函数1获得了A锁");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lockB.lock();
        System.out.println("函数1获得了B锁");
        lockB.unlock();
        System.out.println("函数1释放了B锁");
        lockA.unlock();
        System.out.println("函数1释放了A锁");
    }
    public void fun2(){
        lockB.lock();
        System.out.println("函数2获得了B锁");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lockA.lock();
        System.out.println("函数2获得了A锁");
        lockA.unlock();
        System.out.println("函数2释放了A锁");
        lockB.unlock();
        System.out.println("函数2释放了B锁");
    }
}
