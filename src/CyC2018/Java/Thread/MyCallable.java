package CyC2018.Java.Thread;

import java.util.concurrent.Callable;

/**
 * <h3>leetcode</h3>
 * <p>实现Callable接口</p>
 *
 * @author : 张严
 * @date : 2021-05-27 12:04
 **/
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 123;
    }
}
