package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>位1的个数</p>
 *
 * @author : 张严
 * @date : 2021-06-05 21:29
 **/
public class No191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n!=0){
            count++;
            n = n&(n-1); //重要一步
        }
        return count;
    }
}
