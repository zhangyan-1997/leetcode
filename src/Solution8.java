public class Solution8 {
    public static int climbStairs(int n) {
        int x1=1;
        int x2=2;
        int res = 0;
        for(int i=3;i<=n;i++){
            res = x1+x2;
            x1=x2;
            x2=res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
