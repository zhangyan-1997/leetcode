public class Solution22 {
    public static int numSquares(int n) {
        int[] res = new int[n+1];

        for(int i=0;i<=n;i++){
            res[i] = i;
            for(int j=1;j*j<=i;j++){
                res[i] = Math.min(res[i],res[i-j*j]+1);
            }
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }
}
