package Leetcode.Part201;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>课程表</p>
 *
 * @author : 张严
 * @date : 2021-04-09 13:14
 **/
public class No207 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] linkedGraph = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            linkedGraph[i] = new ArrayList<>();
        }
        int[] indegree = new int[numCourses];
        for(int[] p:prerequisites){
            linkedGraph[p[1]].add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        int count =0;
        while (!queue.isEmpty()){
            int head = queue.poll();
            count++;
            for(int x:linkedGraph[head]){
                indegree[x]--;
                if(indegree[x]==0) queue.offer(x);
            }
        }

        return count==numCourses;
    }

    public static void main(String[] args) {
        System.out.println(canFinish(20,new int[][]{{0,10},{3,18},{5,5},{6,11},{11,6},{13,1},{15,1},{17,4}}));//{{0,10},{3,18},{5,5},{6,11},{11,6},{13,1},{15,1},{17,4}}
    }
}
