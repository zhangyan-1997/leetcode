package Leetcode.Part51;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>柱状图中最大的矩形</p>
 *
 * @author : 张严
 * @date : 2021-04-19 20:38
 **/
public class No84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] newHeights = new int[heights.length+2];
        newHeights[0]=0;
        newHeights[heights.length+1]=0;
        for(int i=1;i<=heights.length;i++){
            newHeights[i]=heights[i-1];
        }
        int res = 0;
        for(int i=0;i<newHeights.length;i++){
            while (!stack.isEmpty()&&newHeights[i]<newHeights[stack.peek()]){
                int cur = stack.pop();
                int left = stack.peek();
                int right = i;
                res = Math.max(res,(right-left-1)*newHeights[cur]);
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        No84 no84 = new No84();
        System.out.println(no84.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}
