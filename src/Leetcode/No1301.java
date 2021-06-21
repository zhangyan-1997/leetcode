package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>子数组异或查询</p>
 *
 * @author : 张严
 * @date : 2021-05-12 15:59
 **/
public class No1301 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];
        if(queries.length == 0) return res;
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int j = left;
            int x = 0;
            while (j<=right&&j<arr.length){
                x = x^arr[j];
                j++;
            }
            res[i] = x;
        }
        return res;
    }

    public static void main(String[] args) {
        No1301 no1301 = new No1301();
        int[] arr = new int[]{1,3,4,8};
        int[][] queries = new int[][]{{0,1},{1,2},{0,3},{3,3}};
        System.out.println(Arrays.toString(no1301.xorQueries(arr,queries)));
    }
}
