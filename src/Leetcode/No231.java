package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>2的幂</p>
 *
 * @author : 张严
 * @date : 2021-06-07 14:58
 **/
public class No231 {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1)) == 0;
    }
}
