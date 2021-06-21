package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>不用加减乘除做加法</p>
 *
 * @author : 张严
 * @date : 2021-04-08 16:36
 **/
public class Offer65 {
    public static int add(int a, int b) {
       if(b==0) return a;
       return add(a^b,(a&b)<<1);
    }

    public static void main(String[] args) {
        System.out.println(add(5,4));
    }
}
