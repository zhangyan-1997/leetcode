package huaweiLC;

public class No69 {
    public int mySqrt(int x) {
        if(x<2) return x;
        int left = 1;
        int right = x/2;
        while (left < right){  //注意这里的符号
            int mid = left + (right - left +1)/2;
            if(mid > x/mid){  //一定要注意这里的符号
                right = mid -1;
            }else left = mid;  //注意这里是等于mid
        }
        return left;
    }

    public static void main(String[] args) {
        No69 no69 = new No69();
        System.out.println(no69.mySqrt(9));
    }
}
