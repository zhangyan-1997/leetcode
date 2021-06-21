package HuaWei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <h3>leetcode</h3>
 * <p>华为机试第一题</p>
 *
 * @author : 张严
 * @date : 2021-04-09 15:15
 **/

public class hw_20210407_01 {
    public static int numsGroup(int[][] grid){
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<=i;j++){
                if(grid[i][j]==1) {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(int[][] grid,int r,int c){
        if(r<0||r>=grid.length||c>r||c<0||grid[r][c]==0) return;
        grid[r][c]=0;
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=0;
        N = in.nextInt();
        in.nextLine();
        String[][] names = new String[N][];
        for(int i=0;i<N;i++){
            names[i] = in.nextLine().split(" ");
        }
        Map<String,Integer> map = new HashMap<>();
        int count =0;
        for(String[] s:names){
            map.put(s[0],count);
            count++;
        }
        int[][] grid = new int[count][count];
        for (String[] s:names){
            grid[map.get(s[0])][map.get(s[1])] = 1;
            grid[map.get(s[1])][map.get(s[0])] = 1;
        }
        System.out.println(Arrays.deepToString(grid));
        System.out.println(numsGroup(grid));
    }
}

/*
6
Jack Tom
Alice John
Jessica Leonie
Tom Alice
John Jack
Leonie Jessica
 */
