package HuaWei;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>华为机试第二题</p>
 *
 * @author : 张严
 * @date : 2021-04-09 13:46
 **/
public class hw_20210407_02 {
    public static int[] computeTime(int[] times,int[][] prerequisites,int N){
        List<Integer>[] tasks = new ArrayList[N];
        for(int i=0;i<N;i++){
            tasks[i] = new ArrayList<>();
            tasks[i].add(0,times[i]);
        }
        int[] indegree = new int[N];
        for(int[] p:prerequisites){
            tasks[p[1]].add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<N;i++){
            if(indegree[i]==0) queue.offer(i);
        }
        int[] res = new int[N];
        int sum =0;
        while (!queue.isEmpty()){
            int head = queue.poll();
            sum = tasks[head].get(0)+sum;
            res[head] = sum;
            for(int j=1;j<tasks[head].size();j++){
                indegree[tasks[head].get(j)]--;
                if(indegree[tasks[head].get(j)]==0) queue.offer(tasks[head].get(j));
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int[] times = new int[]{1,3,4,5,8,5,3,6};
        int[][] prerequisites = new int[][]{{0,2},{2,4},{2,6}};
        System.out.println(Arrays.toString(computeTime(times,prerequisites,8)));
    }
}
