package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>搜索二维矩阵</p>
 *
 * @author : 张严
 * @date : 2021-05-31 15:10
 **/
public class No74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        if(target < matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1]) return false;
        int r = 0;
        int c = matrix[0].length-1;

        while (r<matrix.length&&c>=0){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] < target) r++;
            else c--;
        }
        return false;
    }
}
