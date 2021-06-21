package CyC2018.Java.Thread;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * <h3>leetcode</h3>
 * <p>测试线程</p>
 *
 * @author : 张严
 * @date : 2021-05-27 11:15
 **/
public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyRunnable instance = new MyRunnable();
        Thread tread = new Thread(instance);
        tread.start();


        /*
        MyCallable instance = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(instance);
        Thread tread = new Thread(ft);
        tread.start();
        System.out.println(ft.get());
         */

        /*
        MyThread instance = new MyThread();
        instance.start();
         */
    }
}
