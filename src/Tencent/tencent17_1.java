package Tencent;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>构造回文</p>
 *
 * @author : 张严
 * @date : 2021-03-31 19:55
 **/
public class tencent17_1 {
    public String compress (String str) {
        // write code here
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                int j = i+1;
                while (str.charAt(j)>=0&&str.charAt(j)<=9) j++;
                int m=Integer.parseInt(str.substring(i,j));
            }
        }
        return res.toString();
    }
}
