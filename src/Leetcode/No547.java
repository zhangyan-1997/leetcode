package Leetcode;

/**
 * <h3>leetcode</h3>
 * <p>省份数量</p>
 *
 * @author : 张严
 * @date : 2021-05-31 20:19
 **/
public class No547 {
    public int findCircleNum(int[][] isConnected){
        int count =0;
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<=i;j++){
                if(isConnected[i][j]==1) {
                    dfs(isConnected,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int[][] grid,int r,int c){
        if(r<0||r>=grid.length||c>r||c<0||grid[r][c]==0) return;
        grid[r][c]=0;
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
    }

    public static void main(String[] args) {
        No547 no547 = new No547();
        int[][] isConnect = {{0,0,0,0,1},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{1,0,0,0,0}};
        System.out.println(no547.findCircleNum(isConnect));
    }
}
