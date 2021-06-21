package huaweiLC;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>对角线遍历</p>
 *
 * @author : 张严
 * @date : 2021-05-13 09:33
 **/
public class No498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        if(m*n==0) return res;

        int i = 0;
        int j = 0;
        while (i < m+n){
            int x1 = i<m?i:m-1;
            int y1 = i-x1;
            while (x1>=0&&y1<n){
                res[j++] = mat[x1][y1];
                x1--;
                y1++;
            }
            i++;
            if(i>=m+n) break;
            int y2 = i<n?i:n-1;
            int x2 = i-y2;
            while (y2>=0&&x2<m){
                res[j++] = mat[x2][y2];
                x2++;
                y2--;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        No498 no498 = new No498();
        System.out.println(Arrays.toString(no498.findDiagonalOrder(nums)));
    }
}
