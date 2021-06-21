package huaweiLC;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>反转每对括号间的子串</p>
 *
 * @author : 张严
 * @date : 2021-06-15 14:38
 **/
public class No1190 {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(res.toString());
                res.delete(0,res.length());
            }else if(s.charAt(i)==')'){
                String temp = res.reverse().toString();
                res.delete(0,res.length());
                res.append(stack.pop());
                res.append(temp);
            }else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        No1190 no1190 = new No1190();
        System.out.println(no1190.reverseParentheses( "a(bcdefghijkl(mno)p)q"));
    }
}
