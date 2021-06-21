package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>使用线程</p>
 *
 * @author : 张严
 * @date : 2021-05-27 11:13
 **/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("线程已启动============");
        try {
            System.out.println("线程休眠");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程执行完毕============");
        Thread.yield();
    }
}
