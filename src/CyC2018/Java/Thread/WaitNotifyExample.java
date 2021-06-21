package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>wait与notify</p>
 *
 * @author : 张严
 * @date : 2021-05-27 15:47
 **/
public class WaitNotifyExample {
    public synchronized void before(){
        System.out.println("before");
        notifyAll();
    }
    public synchronized void after(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");

    }
}
