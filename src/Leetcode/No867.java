package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>转置矩阵’</p>
 *
 * @author : 张严
 * @date : 2021-06-01 15:21
 **/
public class No867 {
    public int[][] transpose(int[][] matrix) {

        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        No867 no867 = new No867();
        int[][] nums = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(no867.transpose(nums)));
    }
}
