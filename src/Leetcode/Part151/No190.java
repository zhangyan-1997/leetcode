package Leetcode.Part151;

/**
 * <h3>leetcode</h3>
 * <p>颠倒二进制位</p>
 *
 * @author : 张严
 * @date : 2021-04-19 21:58
 **/
public class No190 {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0;i<32;i++){
            res = res*2+n%2;
            n = n/2;
        }
        return res;
    }

    public static void main(String[] args) {
        No190 no190 = new No190();
        System.out.println(no190.reverseBits(101));
    }
}
