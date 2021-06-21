package byteDance;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>无重叠区间</p>
 *
 * @author : 张严
 * @date : 2021-05-25 10:29
 **/
public class No435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals,(o1,o2)->(o1[1]-o2[1]));

        int count = 0;
        int rightEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]>=rightEnd) rightEnd = intervals[i][1];
            else count++;
        }
        return count;
    }
}
