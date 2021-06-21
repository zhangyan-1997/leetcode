package Leetcode.Part201;

/**
 * <h3>leetcode</h3>
 * <p>搜索二维矩阵2</p>
 *
 * @author : 张严
 * @date : 2021-04-13 21:02
 **/
public class No240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0,c = matrix[0].length-1;
        while (r<matrix.length&&c>=0){
            if(matrix[r][c]>target) c--;
            else if(matrix[r][c]<target) r++;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},20));
    }
}
