package CyC2018.Java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>Await与Signal测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 16:37
 **/
public class AwaitSingalTest {
    public static void main(String[] args) {
        AwaitSignalExample a1 = new AwaitSignalExample();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()->a1.after());
        es.execute(()->a1.before());
        es.shutdown();
    }
}
