package huaweiLC;

import java.util.HashMap;

/**
 * *<h>leetcode<h>
 * *@author:张严
 * *<p>直线上最多的点数<p>
 * *@date 2021-06-24  21:58
 */
public class No149 {
    public int maxPoints(int[][] points) {
        if(points == null || points.length==0) return 0;

        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int x1 = points[i][0];
            int y1 = points[i][1];
            int max = 0;
            for (int j = i + 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                int a = x2 - x1;
                int b = y2 - y1;
                String key = a/gcd(a, b) + "_" + b/gcd(a, b);
                map.put(key, map.getOrDefault(key, 0) + 1);
                max = Math.max(max, map.get(key));
            }
            res = Math.max(res, max+1);
        }
        return res;
    }

    //求最大公约数
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }

    public static void main(String[] args) {
        No149 no149 = new No149();
        System.out.println(no149.maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }
}
