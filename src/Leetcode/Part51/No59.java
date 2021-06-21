package Leetcode.Part51;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>螺旋矩阵2</p>
 *
 * @author : 张严
 * @date : 2021-05-14 21:44
 **/
public class No59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0,bottom = n-1,left = 0,right = n-1;
        int count = 1;
        while (top<=bottom&&left<=right){
            int i = top,j = left;
            while (j<=right) res[top][j++] = count++;
            i = top+1;
            while (i<=bottom) res[i++][right] = count++;
            if(top<=bottom&&left<=right){
                j = right - 1;
                while (j >left) res[bottom][j--] = count++;
                i = bottom;
                while (i>top) res[i--][left] = count++;
            }
            top++;
            left++;
            bottom--;
            right--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new No59().generateMatrix(3)));
    }
}
