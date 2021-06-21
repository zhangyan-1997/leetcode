package byteDance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * <h3>leetcode</h3>
 * <p>最多可以参加的会议数目</p>
 *
 * @author : 张严
 * @date : 2021-05-28 16:33
 **/
/*

public class No1353 {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(o1,o2)->{
            return o1[1]-o2[1];
        });

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < events.length; i++) {
            for (int j = events[i][0]; j <= events[i][1]; j++) {
                if(!set.contains(j)){
                    set.add(j);
                    break;
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[][] events = new int[][]{{1,4},{4,4},{2,2},{3,4},{1,1}};
        No1353 no1353 = new No1353();
        System.out.println(no1353.maxEvents(events));
    }
}


 */

