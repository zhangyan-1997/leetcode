package CyC2018.Java.Thread.ThreadSafe;

/**
 * <h3>leetcode</h3>
 * <p>栈封闭</p>
 *
 * @author : 张严
 * @date : 2021-05-27 21:38
 **/
public class StackClosedExample {
    public void add100(){
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
