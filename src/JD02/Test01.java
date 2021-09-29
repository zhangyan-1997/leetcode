package JD02;

import java.util.LinkedList;
import java.util.Queue;

// 矩阵 0，1 m*n 水滴相连
// 0 1 0
// 1 0 1
// 0 1 0
// [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],
// [0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
public class Test01 {
    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxDrop(grid));
    }
    private static int maxDrop(int[][] grid){
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    int count = 1;
                    Queue<int[]> que = new LinkedList<>();
                    grid[i][j] = 0;
                    que.offer(new int[]{i,j});
                    while(!que.isEmpty()){
                        int[] temp = que.poll();
                        for(int[] dir : dirs){
                            int x = temp[0]+dir[0];
                            int y = temp[1]+dir[1];
                            if(inArea(x,y,grid) && grid[x][y] == 1){
                                grid[x][y] = 0;
                                count++;
                                que.offer(new int[]{x,y});
                            }
                        }
                    }
                    res = Math.max(res,count);
                }

            }
        }
        return res;
    }
    private static boolean inArea(int x,int y,int[][] grid){
        return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length;
    }

}
