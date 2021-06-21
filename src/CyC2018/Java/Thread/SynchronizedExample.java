package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>Synchronized示例</p>
 *
 * @author : 张严
 * @date : 2021-05-27 13:56
 **/
public class SynchronizedExample {
    public synchronized void func1(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
    }
}
