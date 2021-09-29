package baidu;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String now = sc.nextLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = now.charAt(j);
            }
        }
        System.out.println(bfs(grid));
    }
    private static int bfs(char[][] grid){
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 'F'){
                    count++;
                    grid[i][j] = 'X';
                    queue.offer(new int[]{i, j});
                    while (!queue.isEmpty()){
                        int[] poll = queue.poll();
                        int[][] temp = {{0,1},{0,-1},{1,0},{-1,0}};
                        for (int k = 0; k < temp.length; k++) {
                            int r = poll[0] + temp[k][0];
                            int c = poll[1] + temp[k][1];
                            if(r>=0 && r < grid.length && c >=0 && c < grid[0].length && grid[r][c]=='F') {
                               queue.offer(new int[]{r, c});
                               grid[r][c] = 'X';
                            }
                        }
                    }
                }
            }
        }
        return count;


    }
}
