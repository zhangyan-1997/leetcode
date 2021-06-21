package byteDance;

/**
 * <h3>leetcode</h3>
 * <p>岛屿的最大面积</p>
 *
 * @author : 张严
 * @date : 2021-05-14 20:42
 **/
public class No695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) max = Math.max(max,bfs(grid,i,j));
            }
        }
        return max;
    }
    public int bfs(int[][] grid,int r,int c){
        if(grid[r][c]==0) return 0;
        grid[r][c] = 0;
        int count1 = 0 , count2 = 0 , count3 = 0 , count4 = 0;
        if(r-1>=0) count1 = bfs(grid,r-1,c);
        if(c-1>=0) count2 = bfs(grid,r,c-1);
        if(r+1<grid.length) count3 = bfs(grid,r+1,c);
        if(c+1<grid[0].length) count4 = bfs(grid,r,c+1);

        return count1 + count2 + count3 + count4 + 1;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(new No695().maxAreaOfIsland(grid));
    }
}
