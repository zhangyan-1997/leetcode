package CyC2018.Java.Thread.Atomic;

/**
 * <h3>leetcode</h3>
 * <p>同步实现</p>
 *
 * @author : 张严
 * @date : 2021-05-27 21:00
 **/
public class AtomicSynchronizedExample {
    private int cnt;

    public synchronized void add(){
        cnt++;
    }
    public synchronized int getCnt(){
        return cnt;
    }
}
