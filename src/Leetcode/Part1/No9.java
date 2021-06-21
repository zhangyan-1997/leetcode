package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>回文数</p>
 *
 * @author : 张严
 * @date : 2021-04-08 19:01
 **/
public class No9 {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int num = x;
        int res =0;
        while (num>0){
            res = res*10 +num%10;
            num = num/10;
        }
        if(res==x) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
