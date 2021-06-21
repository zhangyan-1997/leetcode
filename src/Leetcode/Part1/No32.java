package Leetcode.Part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>最长有效括号</p>
 *
 * @author : 张严
 * @date : 2021-05-18 16:07
 **/
public class No32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        if(s == null||s.length()==0) return 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if((!stack.isEmpty())&&s.charAt(i)==')'){
                list.add(stack.pop());
                list.add(i);
            }else if(s.charAt(i)=='('){
                stack.push(i);
            }
        }
        System.out.println(list);
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);

        int res = 0;
        int i = 0;
        while (i< list.size()){
            int j = i;
            while (j<list.size()-1&&list.get(j)+1==list.get(j+1)) j++;
            res = Math.max(res,j-i+1);
            i = j+1;
        }
        return res;
    }

    public static void main(String[] args) {
        No32 no32 = new No32();
        System.out.println(no32.longestValidParentheses("()(()"));
    }
}
