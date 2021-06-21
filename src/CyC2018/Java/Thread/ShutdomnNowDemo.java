package CyC2018.Java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <h3>leetcode</h3>
 * <p>shutdownNow示例</p>
 *
 * @author : 张严
 * @date : 2021-05-27 13:44
 **/
public class ShutdomnNowDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        /*
        es.execute(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        es.shutdownNow();
        System.out.println("Main run");

         */

        //如果只想中断 Executor 中的一个线程，可以通过使用 submit() 方法来提交一个线程，它会返回一个 Future<?> 对
        //象，通过调用该对象的 cancel(true) 方法就可以中断线程。
        Future<?> future = es.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        future.cancel(true);
        System.out.println("Main run2");

    }
}
