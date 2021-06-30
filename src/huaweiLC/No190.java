package huaweiLC;

public class No190 {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int t = (n>>i)&1;
            res = res | (t<<(31-i));
        }
        return res;
    }

    public static void main(String[] args) {
        No190 no190 = new No190();
        System.out.println(no190.reverseBits(43261596));
    }
}
