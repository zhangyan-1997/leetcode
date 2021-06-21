package Leetcode.Part1;

import java.util.HashMap;
import java.util.Stack;
/**
 * <h3>leetcode</h3>
 * <p>有效的括号</p>
 *
 * @author : 张严
 * @date : 2021-04-08 18:33
 **/
public class No20 {
    public static boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

       // if(s.length()==1) return false;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
           if((!stack.isEmpty())&&map.containsKey(stack.peek())&&map.get(stack.peek())==s.charAt(i)){
               System.out.println(s.charAt(i));
               stack.pop();
           }else {
               stack.push(s.charAt(i));
               System.out.println("入栈");
           }
        }
        return stack.isEmpty()?true:false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}
