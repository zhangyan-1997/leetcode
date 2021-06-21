package CyC2018.Java.Thread;

/**
 * <h3>leetcode</h3>
 * <p>join示例</p>
 *
 * @author : 张严
 * @date : 2021-05-27 15:39
 **/
public class JoinExample {
    private class A extends Thread{
        @Override
        public void run(){
            System.out.println("A");
        }
    }

    private class B extends Thread{
        private A a;
        B(A a){ this.a = a;}
        @Override
        public void run(){
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test(){
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
    }

}
