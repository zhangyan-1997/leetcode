package Leetcode.Part51;

/**
 * <h3>leetcode</h3>
 * <p>不同路径2</p>
 *
 * @author : 张严
 * @date : 2021-05-31 20:45
 **/
public class No63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return dfs(obstacleGrid,0,0);
    }

    public int dfs(int[][] obstacleGrid, int r, int c){
        if(obstacleGrid[r][c]==1) return 0;
        if(r==obstacleGrid.length-1 && c==obstacleGrid[0].length-1) return 1;

        int x1 = 0, x2 = 0;
        if(r+1 < obstacleGrid.length) x1 = dfs(obstacleGrid,r+1,c);
        if(c+1 < obstacleGrid[0].length) x2 = dfs(obstacleGrid,r,c+1);
        return  x1 + x2;
    }

    public static void main(String[] args) {
        No63 no63 = new No63();
        int[][] grid = {{0,0},{0,1}};
        System.out.println(no63.uniquePathsWithObstacles(grid));
    }
}
