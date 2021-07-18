package huaweiLC;

public class No29 {
    public int divide(int dividend, int divisor) {
        long a = dividend;
        long b = divisor;
        boolean flag = true; //标志结果的正负
        if((a>0&&b<0) || (a<0&&b>0)) flag = false;
        if(a<0) a = -a;
        if(b<0) b = -b;
        long left = 0;
        long right = a;
        while (left < right){
            long mid = (left + right +1) >>1;
            if(mul(mid, b) < a) left = mid;
            else if(mul(mid, b)==a){
                left = mid;
                break;
            }
            else right = mid - 1;
        }
        long ans = flag ? left : -left;
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) return Integer.MAX_VALUE;
        return (int)ans;
    }

    private long mul(long a, long b){
        int ans = 0;
        while (b>0){
            if((b&1)==1) ans += a;
            b >>= 1;
            a += a;
        }
        return ans;
    }

    public static void main(String[] args) {
        No29 no29 = new No29();
        System.out.println(no29.divide(2147483647, 2));
    }
}
