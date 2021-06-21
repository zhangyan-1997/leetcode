package ZJOffer;

public class Offer47 {
    public static int maxValue(int[][] grid) {
        for(int i=1;i<grid.length;i++){
            grid[i][0]= grid[i][0]+grid[i-1][0];
        }
        for(int j=1;j<grid[0].length;j++){
            grid[0][j]= grid[0][j]+grid[0][j-1];
        }
        for(int i =1;i<grid.length;i++){
            for(int j = 1;j<grid[0].length;j++){
                grid[i][j] = grid[i][j]+Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1}};
        System.out.println(maxValue(nums));
    }
}