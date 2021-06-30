package huaweiLC;

public class M1607 {
    public int maximum(int a, int b) {
        long c = a;
        long d = b;
        int k = (int)((c-d)>>63);  //如果c-d大于0，则移位后为0，，若小于0，则移位后为-1；
        return (1+k)*a + (-k)*b;
    }
}
