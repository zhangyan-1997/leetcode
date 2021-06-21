package huaweiLC;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <h3>leetcode</h3>
 * <p>钥匙和房间</p>
 *
 * @author : 张严
 * @date : 2021-06-21 10:40
 **/
public class No841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Arrays.fill(visited, false);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int count = 1;
        visited[0] = true;
        while (!queue.isEmpty()){
            int now = queue.poll();
            for (int x: rooms.get(now)){
                if(visited[x]==false){
                    queue.offer(x);
                    count++;
                    visited[x] = true;
                }
            }
        }
        return count == rooms.size();
    }
}
