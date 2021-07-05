package huaweiLC;

import java.util.Arrays;
import java.util.PriorityQueue;

public class No778 {
    public int swimInWater(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dp[i][j] = 0;
            }
        }
        dp[0][0] = 1;

        int res = 0;
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2)->(grid[o1[0]][o1[1]] - grid[o2[0]][o2[1]]));
        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            res = Math.max(res, grid[now[0]][now[1]]);

            if(now[0]==grid.length-1 && now[1]==grid[0].length-1) break;
            if(now[0]+1<grid.length&&dp[now[0]+1][now[1]]==0){
                dp[now[0]+1][now[1]] = 1;
                queue.offer(new int[]{now[0]+1, now[1]});
            }
            if(now[0]-1>=0&&dp[now[0]-1][now[1]]==0){
                dp[now[0]-1][now[1]] = 1;
                queue.offer(new int[]{now[0]-1, now[1]});
            }
            if(now[1]+1<grid[0].length&&dp[now[0]][now[1]+1]==0){
                dp[now[0]][now[1]+1] = 1;
                queue.offer(new int[]{now[0], now[1]+1});
            }
            if(now[1]-1>=0&&dp[now[0]][now[1]-1]==0){
                dp[now[0]][now[1]-1] = 1;
                queue.offer(new int[]{now[0], now[1]-1});
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        No778 no778 = new No778();
        System.out.println(no778.swimInWater(grid));

    }
}
