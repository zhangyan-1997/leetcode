package Leetcode.Part201;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>滑动窗口的最大值</p>
 *
 * @author : 张严
 * @date : 2021-04-19 15:29
 **/
public class No239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        //递减队列
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0;i<k;i++){
            while (!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]) deque.pollLast();
            deque.offerLast(i);
        }
        int[] res = new int[nums.length-k+1];
        res[0] = nums[deque.peekFirst()];
        for(int i=k;i<nums.length;i++){
            while (!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]) deque.pollLast();
            deque.offerLast(i);
            while (deque.peekFirst()<=(i-k)) deque.pollFirst();
            res[i-k+1] = nums[deque.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        No239 no239 = new No239();
        System.out.println(Arrays.toString(no239.maxSlidingWindow(new int[]{1,-1},1)));

    }
}
