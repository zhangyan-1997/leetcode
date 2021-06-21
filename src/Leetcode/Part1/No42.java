package Leetcode.Part1;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>接雨水</p>
 *
 * @author : 张严
 * @date : 2021-05-19 10:33
 **/
public class No42 {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();

        int res = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()&&height[i]>height[stack.peek()]){
                int curr = stack.pop();
                if(stack.isEmpty()) break;
                int l = stack.peek();
                int r = i;
                int h = Math.min(height[l],height[r])-height[curr];
                res = res + h*(r-l-1);
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        No42 no42 = new No42();
        System.out.println(no42.trap(height));
    }
}
