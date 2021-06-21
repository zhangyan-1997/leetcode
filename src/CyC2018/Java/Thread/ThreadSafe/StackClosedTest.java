package CyC2018.Java.Thread.ThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h3>leetcode</h3>
 * <p>栈封闭测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 21:39
 **/
public class StackClosedTest {
    public static void main(String[] args) {
        StackClosedExample example = new StackClosedExample();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()->example.add100());
        es.execute(()->example.add100());
        es.execute(()->example.add100());
        es.shutdown();
    }
}
