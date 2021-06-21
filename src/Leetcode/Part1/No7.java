package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>整数反转</p>
 *
 * @author : 张严
 * @date : 2021-04-13 21:15
 **/
public class No7 {
    public static int reverse(int x) {

        int res = 0;
        int last = 0;
        while (x!=0){
            last = res;
            res = res*10+x%10;
            if(last!=res/10) return 0;
            x = x/10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-548));
    }
}
