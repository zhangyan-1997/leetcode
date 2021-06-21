package CyC2018.Java.Thread;

import utils.TreeNode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h3>leetcode</h3>
 * <p>死锁</p>
 *
 * @author : 张严
 * @date : 2021-05-27 14:21
 **/
public class DeadLockDemo {
    private static Lock lock1 = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new A());
        es.execute(new B());
        es.shutdown();
    }

    static class A implements Runnable{

        @Override
        public void run() {
            Thread.currentThread().setName("A线程");
            lock1.lock();
            System.out.println(Thread.currentThread().getName()+"获取1锁");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock2.lock();
            System.out.println(Thread.currentThread().getName()+"获取2锁");
            lock2.unlock();
            lock1.unlock();
        }
    }

    static class B implements Runnable{

        @Override
        public void run() {
            Thread.currentThread().setName("B线程");
            lock2.lock();
            System.out.println(Thread.currentThread().getName()+"获取2锁");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock1.lock();
            System.out.println(Thread.currentThread().getName()+"获取1锁");
            lock1.unlock();
            lock2.unlock();
        }
    }
}
