package CyC2018.Java.Thread.ThreadSafe;

/**
 * <h3>leetcode</h3>
 * <p>线程本地存储</p>
 *
 * @author : 张严
 * @date : 2021-05-27 21:45
 **/
public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<Object> threadLocal = new ThreadLocal<>();

        new Thread(()->{
            threadLocal.set(1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
            threadLocal.remove();
        }).start();

        new Thread(()->{
            threadLocal.set(2);
            threadLocal.remove();
        }).start();
    }
}
