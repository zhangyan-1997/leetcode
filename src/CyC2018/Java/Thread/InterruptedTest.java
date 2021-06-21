package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>中断测试</p>
 *
 * @author : 张严
 * @date : 2021-05-27 13:27
 **/
public class InterruptedTest {
    public static void main(String[] args) {
        /*
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        thread.interrupt();
        System.out.println("Main run");
         */

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread2.interrupt();
    }
}
