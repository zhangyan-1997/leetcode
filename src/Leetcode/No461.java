package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>汉明距离</p>
 *
 * @author : 张严
 * @date : 2021-04-01 15:52
 **/
public class No461 {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(2,6));
    }
}
