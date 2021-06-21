package Leetcode.Part101;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>逆波兰表达式求值</p>
 *
 * @author : 张严
 * @date : 2021-05-21 20:54
 **/
public class No150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s:tokens){
            if(s.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            }else if(s.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if(s.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);
            }else if(s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else {
                int x = Integer.parseInt(s);
                stack.push(x);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        No150 no150 = new No150();
        System.out.println(no150.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
