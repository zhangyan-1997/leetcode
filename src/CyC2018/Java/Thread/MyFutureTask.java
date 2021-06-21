package CyC2018.Java.Thread;

import java.util.concurrent.Callable;

/**
 * <h3>leetcode</h3>
 * <p>MyFutureTask</p>
 *
 * @author : 张严
 * @date : 2021-05-27 18:03
 **/
public class MyFutureTask implements Callable {
    @Override
    public Object call() throws Exception {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            Thread.sleep(10);
            result +=i;
        }
        return result;
    }
}
