package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>线程不安全示例</p>
 *
 * @author : 张严
 * @date : 2021-05-27 19:16
 **/
public class ThreadUnsafeExample {
    private int cnt = 0;
    public void add(){
        cnt++;
    }
    public int getCnt(){
        return cnt;
    }
}
