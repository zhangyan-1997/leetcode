package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>各位相加</p>
 *
 * @author : 张严
 * @date : 2021-06-20 15:48
 **/
public class No258 {
    public int addDigits(int num) {
        if(num <10) return num;
        int temp = 0;
        while (num>0){
            temp += num%10;
            num /= 10;
        }
        return addDigits(temp);
    }

    public int addDigits_advanced(int num) {
       return (num-1)%9+1;
    }

    public static void main(String[] args) {
        No258 no258 = new No258();
        System.out.println(no258.addDigits(38));
    }

}
