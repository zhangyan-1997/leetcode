package Leetcode.Part301;

import java.util.LinkedList;
import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>字符串解码</p>
 *
 * @author : 张严
 * @date : 2021-03-31 14:26
 **/
public class No394 {
    public static String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        Stack<Integer> stack_multi = new Stack<>();
        Stack<String> stack_res = new Stack<>();

        for(Character c:s.toCharArray()){
            if(c == '['){
                stack_multi.push(multi);
                multi = 0;
                stack_res.push(res.toString());
                res = new StringBuilder();
            }else if(c == ']'){
                StringBuilder temp = new StringBuilder();
                int cur_multi = stack_multi.pop();
                for(int i=0;i<cur_multi;i++) temp.append(res);
                res = new StringBuilder(stack_res.pop()+temp);
            }else if(c >= '0'&&c <= '9'){
                multi = multi*10+Integer.parseInt(c+"");
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}
