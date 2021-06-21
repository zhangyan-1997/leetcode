package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>最小路径和</p>
 *
 * @author : 张严
 * @date : 2021-03-30 17:06
 **/
public class No64 {
    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        for(int j=1;j<grid[0].length;j++){
            grid[0][j] = grid[0][j]+ grid[0][j-1];
        }

        for(int i=1;i<grid.length;i++){
            grid[i][0] = grid[i][0]+ grid[i-1][0];
        }


        for (int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                grid[i][j]=grid[i][j]+Math.min(grid[i][j-1],grid[i-1][j]);

            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(minPathSum(nums));
    }
}
