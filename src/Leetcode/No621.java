package Leetcode;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>任务调度器</p>
 *
 * @author : 张严
 * @date : 2021-04-01 16:03
 **/
public class No621 {
    public static int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char c:tasks){
            count[c-'A'] ++;
        }
        Arrays.sort(count);
        int maxTime=count[25];
        int maxCount=1;
        for(int i=25;i>=1;i--){
            if(count[i]==count[i-1]) maxCount++;
            else break;
        }
        int res = (maxTime-1)*(n+1)+maxCount;
        return Math.max(res,tasks.length);
    }

    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A','A','A','B','B'},2));
    }
}
