package CyC2018.Java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>Executor测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 12:26
 **/
public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            es.execute(new MyRunnable());
        }
        es.shutdown();
    }
}
