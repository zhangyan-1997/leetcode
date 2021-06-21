package huaweiLC;

import java.util.Arrays;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>行星碰撞</p>
 *
 * @author : 张严
 * @date : 2021-06-21 11:21
 **/
public class No735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int x : asteroids){
            collision: {
                while (!stack.isEmpty()&&x<0&&stack.peek()>0) {
                    if(stack.peek()<-x){
                        stack.pop();
                        continue;
                    }else if(stack.peek()==-x){
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(x);
            }
        }
        int[] res = new int[stack.size()];
        int count = 0;
        for (int x: stack){
            res[count++] = x;
        }
        return res;
    }

    public static void main(String[] args) {
        No735 no753 = new No735();
        System.out.println(Arrays.toString(no753.asteroidCollision(new int[]{5, 10, -5})));
    }
}
