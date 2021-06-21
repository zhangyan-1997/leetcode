package Leetcode.Part201;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>课程表2</p>
 *
 * @author : 张严
 * @date : 2021-04-07 21:48
 **/
public class No210 {
    public static int[] findOrder(int numCourses,int[][] prerequisites){
        if(numCourses<=0) return new int[0];
        Set<Integer>[] course = new HashSet[numCourses]; //邻接表，构建图
        for (int i=0;i<numCourses;i++){
            course[i] = new HashSet<>(); //初始化
        }

        int[] inDegree = new int[numCourses]; //入度表，
        for(int[] p:prerequisites){
            course[p[1]].add(p[0]);
            inDegree[p[0]]++;
        }

        //拓扑排序
        Queue<Integer> queue = new LinkedList<>();
        for (int k = 0; k < numCourses; k++) {
            if(inDegree[k]==0) queue.offer(k);
        }

        int[] res = new int[numCourses]; //结果集
        int count =0;
        while (!queue.isEmpty()){
            int head = queue.poll();
            res[count] = head;
            count++;
            Set<Integer> successor = course[head];
            for(int nextCourse:successor){
                inDegree[nextCourse]--;
                if(inDegree[nextCourse]==0) queue.offer(nextCourse);
            }
        }
        if(count==numCourses) return res;
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOrder(4,new int[][]{{1,0},{2,0},{3,1},{3,2}})));
    }
}
