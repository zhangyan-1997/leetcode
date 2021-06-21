package byteDance;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>反转每对括号间的子串</p>
 *
 * @author : 张严
 * @date : 2021-05-26 15:53
 **/
/*
public class No1190 {
    public String reverseParentheses(String s) {
        if(s == null ||s.length()==0) return s;
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack2.push(i);
            else if(s.charAt(i)>='a'&&s.charAt(i)) sb.append(s.charAt(i));
            else {
                System.out.println("开始反转！");
                int j = stack.pop();
                int end = sb.length();
                int start = end - (i - j)+1;
                sb.delete(start,end);
                System.out.println(s.substring(j+1, i));
                String temp = reverse(s.substring(j+1, i));
                System.out.println(temp);
                sb.append(temp);
            }
        }


        return sb.toString();
    }
    private String reverse(String s){
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;
        char p = ' ';
        while (i<j){
            p = chars[i];
            chars[i] = chars[j];
            chars[j] = p;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c:chars) sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        No1190 no1190 = new No1190();
        System.out.println(no1190.reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }
}

*/