package Leetcode.Part301;

/**
 * <h3>leetcode</h3>
 * <p>两整数之和</p>
 *
 * @author : 张严
 * @date : 2021-04-12 14:42
 **/
public class No371 {
    public int getSum(int a, int b) {
        if(b==0) return a;
        return getSum(a^b,(a&b)<<1);//a^b为无进位的和，(a&b)<<1为进位和
    }

    public static void main(String[] args) {
        System.out.println(new No371().getSum(1,2));
    }
}
