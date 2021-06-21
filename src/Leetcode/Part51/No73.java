package Leetcode.Part51;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>矩阵置零</p>
 *
 * @author : 张严
 * @date : 2021-04-23 16:40
 **/
public class No73 {
    public void setZeroes(int[][] matrix) {
        boolean row = false;
        boolean col = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0]==0) {
                col = true;
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i]==0) {
                row = true;
                break;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }

            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if(matrix[i][0]==0){
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if(matrix[0][i]==0){
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if(col==true) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if(row==true) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

    }

    public static void main(String[] args) {
        No73 no73 = new No73();
        int[][] ints = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        no73.setZeroes(ints);
        System.out.println(Arrays.deepToString(ints));
    }
}
