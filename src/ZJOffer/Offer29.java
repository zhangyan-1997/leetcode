package ZJOffer;

import java.util.Arrays;

public class Offer29 {
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0) return new int[0];
        int[] res = new int[matrix.length*matrix[0].length];

        int rows = matrix.length,columns= matrix[0].length;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        int k=0;
        while (left<=right&&top<=bottom){
            for(int c = left;c<=right;c++){
                res[k++] = matrix[top][c];
            }
            for(int r =top+1;r<=bottom;r++){
                res[k++]=matrix[r][right];
            }
            if(left<right&&top<bottom){
                for(int c= right-1;c>=left;c--){
                    res[k++] = matrix[bottom][c];
                }
                for(int r=bottom-1;r>top;r--){
                    res[k++] = matrix[r][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums= new int[][]{{}};
        System.out.println(Arrays.toString(spiralOrder(nums)));
    }
}
