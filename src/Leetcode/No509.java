package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>斐波那契数</p>
 *
 * @author : 张严
 * @date : 2021-06-07 13:48
 **/
public class No509 {
    public int fib(int n) {
        if(n == 0 || n==1) return n;
        return fib(n-1) + fib(n-2);
    }
}
