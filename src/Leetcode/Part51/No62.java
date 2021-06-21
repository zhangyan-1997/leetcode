package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>不同路径</p>
 *
 * @author : 张严
 * @date : 2021-04-16 16:55
 **/
public class No62 {
    public static int uniquePaths(int m, int n) {
        int[][] res = new int[m][n];
        for(int i=0;i<n;i++) res[0][i] = 1;
        for(int j=0;j<m;j++) res[j][0] = 1;
        for(int r=1;r<m;r++){
            for (int c=1;c<n;c++){
                res[r][c] = res[r-1][c]+res[r][c-1];
            }
        }
        return res[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
}
