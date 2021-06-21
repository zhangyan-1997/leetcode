package huaweiLC;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>去除重复字母</p>
 *
 * @author : 张严
 * @date : 2021-06-15 17:22
 **/
/*
public class No316 {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();

        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(!stack.contains(s.charAt(i))){
                while (!stack.isEmpty() && s.charAt(i) < stack.peek() && alpha[stack.peek() - 'a']>0) stack.pop();
                stack.push(s.charAt(i));
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        No316 no316 = new No316();
        System.out.println(no316.removeDuplicateLetters("cbacdcbc"));
    }
}

 */
