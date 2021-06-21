package byteDance;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>翻转字符串里的单词</p>
 *
 * @author : 张严
 * @date : 2021-05-14 19:48
 **/
public class No151 {
    public String reverseWords(String s) {

        String[] s1 = s.trim().split(" ");
        System.out.println(Arrays.toString(s1));
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length-1; i > 0; i--) {
            if(s1[i].length()!=0) {
                sb.append(s1[i].trim());
                sb.append(" ");
            }
        }
        sb.append(s1[0].trim());
        return sb.toString();
    }

    public static void main(String[] args) {
        No151 no151 = new No151();
        System.out.println(no151.reverseWords("a good   example"));
    }
}
