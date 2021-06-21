package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>Daemon测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 12:31
 **/
public class DaemonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setDaemon(true);
    }
}
