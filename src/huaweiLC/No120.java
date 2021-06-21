package huaweiLC;

import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>三角形最小路径和</p>
 *
 * @author : 张严
 * @date : 2021-06-15 22:20
 **/

public class No120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[triangle.size()][triangle.size()];

        dfs(triangle, dp, 0,0);
        return dp[0][0];
    }

    private int dfs(List<List<Integer>> triangle, Integer[][] dp, int r, int c){
        if(r>=triangle.size()) return 0;
        if(dp[r][c]!=null) return dp[r][c];
        dp[r][c] = Math.min(dfs(triangle, dp, r+1, c), dfs(triangle, dp, r+1, c+1))+triangle.get(r).get(c);
        return dp[r][c];
    }
}


