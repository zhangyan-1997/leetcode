package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>3的幂</p>
 *
 * @author : 张严
 * @date : 2021-06-17 16:18
 **/
public class No326 {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while (n%3 == 0){
            n = n/3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        No326 no326 = new No326();
        System.out.println(no326.isPowerOfThree(45));
    }
}
