package huaweiLC;

import java.util.Arrays;
/*
public class No452 {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points,((o1, o2) -> (o1[0] - o2[0])));
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if(points[i][0] > points[i-1][1]){
                count ++;
            }else points[i][1] = Math.min(points[i][1], points[i-1][1]);
        }
        return count;
    }

    public static void main(String[] args) {
        No452 no452 = new No452();
        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
        System.out.println(no452.findMinArrowShots(points));
    }
}

 */
