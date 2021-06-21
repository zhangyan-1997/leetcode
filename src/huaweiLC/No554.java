package huaweiLC;

import java.util.HashMap;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>砖墙</p>
 *
 * @author : 张严
 * @date : 2021-06-15 14:23
 **/
public class No554 {
    public int leastBricks(List<List<Integer>> wall) {
        int n = wall.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int loc = 0;
            for (int x: wall.get(i)){
                loc += x;
                map.put(loc, map.getOrDefault(loc,0)+1);
            }
            map.remove(loc);
        }

        int res = n;
        for (int m: map.keySet()){
            res = Math.min(res, n - map.get(m));
        }
        return res;
    }


}
