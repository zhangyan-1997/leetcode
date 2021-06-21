package Leetcode.Part201;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>基本计算器2</p>
 *
 * @author : 张严
 * @date : 2021-04-12 17:07
 **/
public class No227 {
    public static int calculate(String s) {
        char flag = '+';
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) {
                num = num*10+(s.charAt(i)-'0');
            }
            if(!Character.isDigit(s.charAt(i))&&s.charAt(i)!=' '||i==s.length()-1){
                switch (flag){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop()*num);
                        break;
                    case '/':
                        stack.push(stack.pop()/num);
                        break;
                    default:
                }
                flag = s.charAt(i);
                num = 0;
            }
        }
        int res =0;
        while (!stack.isEmpty()){
            res = stack.pop()+res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(calculate("3"));
    }
}
