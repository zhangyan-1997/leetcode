package Leetcode.Part201;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>会议室2</p>
 *
 * @author : 张严
 * @date : 2021-05-18 18:09
 *
 * 题目描述：给定一个会议时间安排的数组，每个会议时间都会包括开始和结束的时间 [[s1,e1],[s2,e2],…] (si < ei)，为避免会议冲突，
 * 同时要考虑充分利用会议室资源，请你计算至少需要多少间会议室，才能满足这些会议安排。
 * 输入: [[0, 30],[5, 10],[15, 20]]
 * 输出: 2
 * 输入: [[7,10],[2,4]]
 * 输出: 1
 **/
public class No253 {
    public int minMeetingRooms(int[][] intervals){
        int maxRoom = 0;
        int nowRoom = 0;
        if(intervals.length == 0) return 0;
        int[] startTime = new int[intervals.length];
        int[] endTime = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            startTime[i] = intervals[i][0];
            endTime[i] = intervals[i][1];
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);

        int i = 0;
        int j = 0;
        while (i<startTime.length&&j<endTime.length){
            if(startTime[i]<endTime[j]){
                nowRoom++;
                i++;
            }else {
                nowRoom--;
                j++;
            }
            maxRoom = Math.max(nowRoom,maxRoom);
        }
        return maxRoom;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{0,30},{5,10},{15,20}};
        No253 no253 = new No253();
        System.out.println(no253.minMeetingRooms(intervals));
    }
}
