package CyC2018.Java.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * <h3>leetcode</h3>
 * <p>FutureTask示例</p>
 *
 * @author : 张严
 * @date : 2021-05-27 17:56
 **/
public class FutureTaskExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyFutureTask());

        Thread computedThread = new Thread(futureTask);
        computedThread.start();

        new Thread(()->{
            System.out.println("另一个任务正在执行");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        System.out.println(futureTask.get());
    }
}
