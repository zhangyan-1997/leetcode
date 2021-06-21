package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>根据身高重建队列</p>
 *
 * @author : 张严
 * @date : 2021-04-22 19:20
 **/
public class No406 {
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(p1,p2)->{
            if(p1[0] == p2[0]) return p1[1]-p2[1];
            else return p2[0]-p1[0];
        });
        List<int[]> list = new ArrayList<>();
        for(int[] p: people){
            if(p[1]>=list.size()) list.add(p);
            else list.add(p[1],p);
        }
        int[][] res = new int[list.size()][];
        int i = 0;
        for(int[] x: list){
            res[i++] = x;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] people = new int[][]{{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}};
        System.out.println(Arrays.deepToString(reconstructQueue(people)));
    }
}
