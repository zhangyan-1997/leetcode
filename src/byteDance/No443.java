package byteDance;

import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>压缩字符串</p>
 *
 * @author : 张严
 * @date : 2021-05-17 18:55
 **/
public class No443 {
    public int compress(char[] chars) {

        int len = 0;
        int i = 0;
        while (i<chars.length){
            int j = i + 1;
            while (j<chars.length&&chars[j]==chars[i]) j++;

            if(j==i+1) chars[len++] = chars[i];

            else {
                chars[len++] = chars[i];
                char[]  cur = String.valueOf(j-i).toCharArray();
                for(char c:cur) chars[len++] = c;
            }
            i = j;
        }
        return len;
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        No443 no443 = new No443();
        System.out.println(no443.compress(chars));
        System.out.println(chars);
    }
}
