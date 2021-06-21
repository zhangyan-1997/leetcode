package Leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>每日温度</p>
 *
 * @author : 张严
 * @date : 2021-04-11 21:00
 **/
public class No739 {
    public static int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<T.length;i++){
            while (!stack.isEmpty()&&T[i]>T[stack.peek()]){
                int t = stack.pop();
                res[t] = i-t;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
