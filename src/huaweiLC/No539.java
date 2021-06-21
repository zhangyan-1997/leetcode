package huaweiLC;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>最小时间差</p>
 *
 * @author : 张严
 * @date : 2021-06-20 15:02
 **/
public class No539 {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size()<2 || timePoints.size()>1440) return 0;

        int[] times = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            times[i] = parseMinute(timePoints.get(i));
        }
        Arrays.sort(times);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < times.length-1; i++) {
            min = Math.min(min, times[i+1]-times[i]);
            if(min==0) return 0;
        }
        return Math.min(min, times[0]-times[times.length-1]+1440);
    }

    private int parseMinute(String str){
        return str.charAt(0)*600 + str.charAt(1)*60 + str.charAt(3)*10 + str.charAt(4);
    }
}
