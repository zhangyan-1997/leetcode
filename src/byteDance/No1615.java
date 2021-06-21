package byteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>最大网络秩</p>
 *
 * @author : 张严
 * @date : 2021-05-28 14:13
 **/
public class No1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        if(roads == null ||roads.length == 0) return 0;
        List<Integer>[] LinkedGraph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            LinkedGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < roads.length; i++) {
            LinkedGraph[roads[i][0]].add(roads[i][1]);
            LinkedGraph[roads[i][1]].add(roads[i][0]);
        }

        int[][] res = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = LinkedGraph[i].size()+LinkedGraph[j].size();
                if(LinkedGraph[i].contains(j)) res[i][j]--;
                if(j == i) res[i][j] = 0;
                max = Math.max(res[i][j],max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] roads = new int[][]{{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}};
        No1615 no1615 = new No1615();
        System.out.println(no1615.maximalNetworkRank(8, roads));
    }
}
