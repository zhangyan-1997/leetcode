package CyC2018.Java.Thread.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <h3>leetcode</h3>
 * <p>原子整型包装类</p>
 *
 * @author : 张严
 * @date : 2021-05-27 20:50
 **/
public class AtomicIntegerExample {
    private AtomicInteger cnt = new AtomicInteger();

    public void add(){
        cnt.incrementAndGet();
    }

    public int getCnt(){
        return cnt.get();
    }
}
