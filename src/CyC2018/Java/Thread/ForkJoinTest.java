package CyC2018.Java.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.FutureTask;

/**
 * <h3>leetcode</h3>
 * <p>ForkJoin测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 18:47
 **/
public class ForkJoinTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinExample example = new ForkJoinExample(1,10000);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> result = forkJoinPool.submit(example);
        System.out.println(result.get());
    }
}
