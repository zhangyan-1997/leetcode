package huaweiLC;

public class No463 {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) ans += dfs(grid, i, j);
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int r, int c) {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] == 0) return 1;
        if(grid[r][c] == 2) return 0;

        grid[r][c] = 2;
        int res = 0;
        res += dfs(grid, r-1, c);
        res += dfs(grid, r, c-1);
        res += dfs(grid, r+1, c);
        res += dfs(grid, r, c+1);
        return res;
    }
}
