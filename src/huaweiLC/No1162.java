package huaweiLC;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>地图分析</p>
 *
 * @author : 张严
 * @date : 2021-06-20 13:27
 **/
public class No1162 {
    public int maxDistance(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) queue.offer(new int[]{i, j});
            }
        }

        boolean flag = false; //flag表示是否还有海洋
       int[] node = null;
        while (!queue.isEmpty()){
           node = queue.poll();
           int x = node[0];
           int y = node[1];
            if(x-1>=0&&grid[x-1][y]==0) {
                grid[x-1][y] = grid[x][y] + 1;
                flag = true;
                queue.offer(new int[]{x-1, y});
            }
            if(y-1>=0&&grid[x][y-1]==0) {
                grid[x][y-1] = grid[x][y] + 1;
                flag = true;
                queue.offer(new int[]{x, y-1});
            }
            if(x+1<grid.length&&grid[x+1][y]==0) {
                grid[x+1][y] = grid[x][y] + 1;
                flag = true;
                queue.offer(new int[]{x+1, y});
            }
            if(y+1<grid[0].length&&grid[x][y+1]==0) {
                grid[x][y+1] = grid[x][y] + 1;
                flag = true;
                queue.offer(new int[]{x, y+1});
            }
        }
        if(node==null||flag==false) return -1;
        return grid[node[0]][node[1]]-1;
    }

}
