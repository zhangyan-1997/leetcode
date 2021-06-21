package Leetcode.Part301;

/**
 * <h3>leetcode</h3>
 * <p>有序矩阵中第k小的元素</p>
 *
 * @author : 张严
 * @date : 2021-04-12 21:54
 **/
public class No378 {
    public static int kthSmallest(int[][] matrix, int k) {
        int r =0,c=matrix[0].length-1;
        int small = matrix[0][0],large = matrix[matrix.length-1][matrix[0].length-1];
        while (large>small){
            int mid = (small+large)/2;
            if(compare(matrix,k,mid)) large = mid;
            else small = mid+1;
        }
        return small;
    }
    public static boolean compare(int[][] matrix,int k,int mid){
        int r = 0,c=matrix[0].length-1;
        int num = 0;
        while (r<matrix.length&&c>=0){
            if(matrix[r][c]<=mid){
                num = num+c+1;
                r++;
            }else c--;
        }
        return num>=k;
    }

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[][]{{1,5,9},{10,11,13},{12,13,15}},2));
    }
}
