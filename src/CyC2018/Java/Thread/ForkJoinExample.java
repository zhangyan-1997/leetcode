package CyC2018.Java.Thread;

import java.util.concurrent.RecursiveTask;

/**
 * <h3>leetcode</h3>
 * <p>ForkJoin示例</p>
 *
 * @author : 张严
 * @date : 2021-05-27 18:27
 **/
public class ForkJoinExample extends RecursiveTask<Integer> {
    private final int threshold = 5;
    private int first;
    private int last;
    public ForkJoinExample(int first,int last){
        this.first = first;
        this.last = last;
    }
    @Override
    protected Integer compute() {
        int result = 0;
        if(last - first <threshold) {
            for (int i = first; i <= last; i++) {
                result +=i;
            }
        } else {
            int mid = first + (last - first)/2;
            ForkJoinExample leftFork = new ForkJoinExample(first, mid);
            ForkJoinExample rightFork = new ForkJoinExample(mid+1, last);
            leftFork.fork();
            rightFork.fork();
            result = leftFork.join()+rightFork.join();
        }
        return result;
    }
}
