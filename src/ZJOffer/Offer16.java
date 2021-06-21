package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>数值的整数次方</p>
 *
 * @author : 张严
 * @date : 2021-04-07 14:40
 **/
public class Offer16 {
    public static double myPow(double x, int n) {
        if(x==0) return 0;
        long b = n;
        if(b<0) {
            x = 1/x;
            b = -b;
        }
        double res = 1.0;
        while(b>0){
            if((b&1)==1){
                res = res*x;
            }
            x = x*x;
            b = b>>1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00,-2));
    }
}
