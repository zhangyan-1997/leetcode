package huaweiLC;

public class No343 {
    public int integerBreak(int n) {
        if(n <= 3) return n-1;
        int a = n/3;
        int b = n%3;
        if(b==0) return (int) Math.pow(3, a);
        if(b==1) return (int) Math.pow(3, a-1) * 4;
        return (int) Math.pow(3, a) * 2;
    }

    public static void main(String[] args) {
        No343 no343 = new No343();
        System.out.println(no343.integerBreak(4));
    }
}
