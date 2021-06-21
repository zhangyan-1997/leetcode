package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>Pow</p>
 *
 * @author : 张严
 * @date : 2021-05-12 20:35
 **/
public class No50 {
    public double myPow(double x, int n) {
        if(x == 0.0f) return 0.0d;
        long b = n;
        double res = 1.0;
        if(b<0) {
            x = 1/x;
            b = -b;
        }
        while (b>0){
            if((b&1)==1) res = res*x;
            x = x*x;
            b>>=1;
        }
        return res;
    }
}
