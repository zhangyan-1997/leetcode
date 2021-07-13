package huaweiLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No51 {
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();

        //初始化棋盘
        char[][] grid = new char[n][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = '.';
            }
        }
        backstrace(grid, 0);
        return res;
    }

    private void backstrace(char[][] grid, int index){
        if(index == grid.length){
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < grid.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("\"");
                for (int j = 0; j < grid[0].length; j++) {
                    sb.append(grid[i][j]);
                }
                sb.append("\"");
                temp.add(sb.toString());
            }
            res.add(temp);
            return;
        }
        for (int i = 0; i < grid[0].length; i++) {
            if(isValid(grid, index, i) == false) continue;
            grid[index][i] = 'Q';
            backstrace(grid, index + 1);
            grid[index][i] = '.';
        }
    }

    private boolean isValid(char[][] grid, int r, int c){
        //检查该列
        for (int i = 0; i < r; i++) {
            if (grid[i][c] == 'Q') return false;
        }
        int row = r - 1;
        int col = c + 1;
        //检查右上方对角线
        while (row>=0 && col<grid[0].length){
            if(grid[row][col] == 'Q') return false;
            row--;
            col++;
        }
        row = r - 1;
        col = c - 1;
        //检查左上方对角线
        while (row>=0 && col>=0){
            if(grid[row][col] == 'Q') return false;
            row--;
            col--;
        }
        return true;
    }

    public static void main(String[] args) {
        No51 no51 = new No51();
        System.out.println(no51.solveNQueens(4));
    }
}
