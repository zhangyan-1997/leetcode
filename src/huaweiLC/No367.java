package huaweiLC;

public class No367 {
    public boolean isPerfectSquare(int num) {
        int temp = 1;
        while (num > 0){
            num -= temp;
            temp += 2;
        }
        return num == 0;
    }
}
