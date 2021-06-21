package byteDance;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>移掉k位数字</p>
 *
 * @author : 张严
 * @date : 2021-05-17 19:36
 **/
public class No402 {
    public String removeKdigits(String num, int k) {
        if (k>=num.length()) return String.valueOf(0);
        Stack<Character> stack = new Stack<>();
        char[] chars = num.toCharArray();
        for (char c:chars){
            while (!stack.isEmpty()&&k>0&&stack.peek()>c){
                stack.pop();
                k--;
            }
            if(c=='0'&&stack.size()==0) continue;
            stack.push(c);
        }

        while( k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for (char c:stack) sb.append(c);

        return sb.length() == 0?"0":sb.toString();

    }

    public static void main(String[] args) {
        No402 no402 = new No402();
        System.out.println(no402.removeKdigits("9", 1));
    }
}
