package byteDance;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>腐烂的橘子</p>
 *
 * @author : 张严
 * @date : 2021-05-13 10:49
 **/
public class No994 {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1) count++;
                if(grid[i][j]==2) queue.offer(new int[]{i,j});
            }
        }

        int time = 0;
        while (count>0&&!queue.isEmpty()){
            time++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int[] node = queue.poll();
                int r = node[0];
                int c = node[1];
                if(r-1>=0&&grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    count--;
                    queue.offer(new int[]{r-1,c});
                }
                if(c-1>=0&&grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    count--;
                    queue.offer(new int[]{r,c-1});
                }
                if(r+1<grid.length&&grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    count--;
                    queue.offer(new int[]{r+1,c});
                }
                if(c+1<grid[0].length&&grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    count--;
                    queue.offer(new int[]{r,c+1});
                }
            }
        }
        if(count==0) return time;
        return -1;
    }
}
