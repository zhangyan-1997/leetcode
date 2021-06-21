package huaweiLC;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <h3>leetcode</h3>
 * <p>森林中的兔子</p>
 *
 * @author : 张严
 * @date : 2021-06-15 13:49
 **/


public class No781 {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x: answers){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int res = 0;
        for (int key: map.keySet()){
            int per = key + 1;
            int cnt = map.get(key);
            int k = cnt/per;
            if(cnt%per>0) k++;
            res += k*per;
        }
        return res;
    }
}

