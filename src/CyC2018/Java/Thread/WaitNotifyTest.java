package CyC2018.Java.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>wait与notify测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 16:01
 **/
public class WaitNotifyTest {
    public static void main(String[] args) {
        WaitNotifyExample w1 = new WaitNotifyExample();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()->w1.after());
        es.execute(()->w1.before());
        es.shutdown();
    }
}
