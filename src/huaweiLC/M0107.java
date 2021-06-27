package huaweiLC;

public class M0107 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int top = 0;
            int bottom = matrix.length-1;
            while (top < bottom){
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = temp;
                bottom--;
                top++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
