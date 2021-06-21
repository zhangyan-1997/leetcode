package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>继承Thread类</p>
 *
 * @author : 张严
 * @date : 2021-05-27 12:23
 **/
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("MyThread运行了");
    }
}
