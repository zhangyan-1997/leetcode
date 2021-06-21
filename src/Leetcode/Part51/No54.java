package Leetcode.Part51;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>螺旋矩阵</p>
 *
 * @author : 张严
 * @date : 2021-04-23 15:45
 **/
public class No54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0||matrix[0].length==0) return res;
        int top = 0,bottom = matrix.length-1,left = 0,right = matrix[0].length-1;
        while (top<=bottom&&left<=right){
            int i = top,j = left;
            while (j<=right) res.add(matrix[top][j++]);
            i = top+1;
            while (i<=bottom) res.add(matrix[i++][right]);
            if(top<bottom&&left<right) {
                j = right-1;
                while (j > left) res.add(matrix[bottom][j--]);
                i = bottom;
                while (i > top) res.add(matrix[i--][left]);
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        No54 no54 = new No54();
        System.out.println(no54.spiralOrder(matrix));
    }
}
