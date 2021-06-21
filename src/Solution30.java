/**
 * <h3>leetcode</h3>
 * <p>圆圈中最后剩下的数字</p>
 *约瑟夫环问题，使用动态规划进行解题
 * @author : 张严
 * @date : 2021-04-08 18:50
 **/
public class Solution30 {
    public static int lastRemaining(int n, int m) {
        int res = 0;
        for(int i=2;i<=n;i++){
            res = (res+m)%i;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(5,3));
    }
}
