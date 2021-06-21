package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>测试无限循环的中断</p>
 *
 * @author : 张严
 * @date : 2021-05-27 13:38
 **/
public class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (!interrupted()){
            System.out.println(i++);
        }
        System.out.println("线程结束=====");
    }
}
