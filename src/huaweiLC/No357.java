package huaweiLC;

public class No357 {
    int countNumbersWithUniqueDigits(int n) {
        if( n == 0) return 1;
        int count = 9;
        int res = 10;
        for (int i = 2; i <= Math.min(10, n); i++) {
            count *= (10-i+1);
            res += count;
        }
        return res;
    }

    public static void main(String[] args) {
        No357 no357 = new No357();
        System.out.println(no357.countNumbersWithUniqueDigits(1));
    }
}
