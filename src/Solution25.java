import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution25 {
    public static int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    grid[i][j] = '0';
                    queue.offer(new int[]{i,j});
                    while(!queue.isEmpty()){
                        int[] x = queue.poll();
                        int r = x[0];
                        int c = x[1];
                        if(r-1>=0&&grid[r-1][c]=='1'){
                            queue.offer(new int[]{r-1,c});
                            grid[r-1][c] ='0';
                        }
                        if(c-1>=0&&grid[r][c-1]=='1'){
                            queue.offer(new int[]{r,c-1});
                            grid[r][c-1]='0';
                        }
                        if(r+1<m&&grid[r+1][c]=='1'){
                            queue.offer(new int[]{r+1,c});
                            grid[r+1][c]='0';
                        }
                        if(c+1<n&&grid[r][c+1]=='1'){
                            queue.offer(new int[]{r,c+1});
                            grid[r][c+1]='0';
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println(numIslands(grid));
    }
}
