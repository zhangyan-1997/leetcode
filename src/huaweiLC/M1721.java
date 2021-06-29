package huaweiLC;

import java.util.Stack;

public class M1721 {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();

        int res = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()&&height[i]>height[stack.peek()]){
                int curr = stack.pop();
                if(stack.isEmpty()) break;
                int l = stack.peek();
                int r = i;
                int h = Math.min(height[l], height[r]-height[curr]);
                res += h*(r-l-1);
            }
            stack.push(i);
        }
        return res;
    }
}
